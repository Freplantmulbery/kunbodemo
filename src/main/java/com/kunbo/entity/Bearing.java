package com.kunbo.entity;

//轴承类
public class Bearing {
    //对应表中类型创建变量
    //目前使用float会造成精度损失
    private float time;
    private float x;
    private float y;
    private float z;

    @Override
    public String toString() {
        return "Bearing{" +
                "time:" + time +
                ", x:" + x +
                ", y:" + y +
                ", z:" + z +
                '}';
    }

    public Bearing() {
    }

    public Bearing(float time, float x, float y, float z) {
        this.time = time;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
