package com.codegym;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public Fan() {
    }

    public String getColor() {
        this.color = "blue";
        return this.color;

    }

    public int getSpeed(int speed) {
        switch (speed) {
            case 1 -> this.speed = this.SLOW;
            case 2 -> {
                this.speed = this.MEDIUM;
            }
            case 3 -> this.speed = this.FAST;
        }
        return this.speed;
    }

    public boolean isOn() {
        this.on = false;
        return this.on;
    }

    public double getRadius() {
        this.radius = 5;
        return this.radius;
    }

}
