package com.kunbo.entity;

public class DianJi {
    private int id;
    private String speed;

    @Override
    public String toString() {
        return "DianJi{" +
                "id=" + id +
                ", speed=" + speed +
                '}';
    }

    public DianJi() {
    }

    public DianJi(int id, String speed) {
        this.id = id;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
