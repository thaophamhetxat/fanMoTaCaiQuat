package com.codegym;

public class Main {

    public static void main(String[] args) {
	Fan fan = new Fan();
        System.out.println("speed: "+fan.getSpeed(1));
        System.out.println("status: "+fan.isOn());
        System.out.println("radius: "+fan.getRadius());
        System.out.println("color "+fan.getColor());
    }
}
