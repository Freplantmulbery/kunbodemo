package com.kunbo.mathutil;

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

import java.util.List;

interface TestCase
{
    public Object run(List<Object> params) throws Exception;
    public List<Object> getParams();
}

class FFTW implements TestCase {

    public FFTW(){
        System.out.print("本算例用于计算快速傅立叶变换。正在初始化 计算数据(" + arrayLength + "点)... ...");
            inputData = new double[arrayLength];
            for (int index = 0; index < inputData.length; index++)
            {
            inputData[index] = (Math.random() - 0.5) * 100.0;
            }
            System.out.println("初始化完成");

    }
    @Override
    public Object run(List<Object> params) throws Exception {
        FastFourierTransformer fft = new FastFourierTransformer(DftNormalization.STANDARD);
        Complex[] result = fft.transform(inputData, TransformType.FORWARD);

        return result;
    }

    private double[] inputData = null;
    private final int arrayLength = 4 * 1024*1024;

    @Override
    public List<Object> getParams() {
        return null;
    }
}

public class TimeCostCalculator{
    public TimeCostCalculator()
    {
    }

    /**
     * 计算指定对象的运行时间开销。
     *
     * @param testCase 指定被测对象。
     * @return 返回sub.run的时间开销，单位为s。
     * @throws Exception
     */
    public double calcTimeCost(TestCase testCase) throws Exception{
        List<Object> params = testCase.getParams();
        long startTime = System.nanoTime();
        testCase.run(params);
        long stopTime = System.nanoTime();
        System.out.println("start: " + startTime + " / stop: " + stopTime);
        double timeCost = (stopTime - startTime) * 1.0e-9;
        // double timeCost = BigDecimal.valueOf(stopTime - startTime, 9).doubleValue();
        return timeCost;
    }

    public static void main(String[] args) throws Exception{
        TimeCostCalculator tcc = new TimeCostCalculator();
        double timeCost;

        System.out.println("--------------------------------------------------------------------------");
        timeCost = tcc.calcTimeCost(new FFTW());
        System.out.println("time cost is: " + timeCost + "s");
        System.out.println("--------------------------------------------------------------------------");
    }


}
