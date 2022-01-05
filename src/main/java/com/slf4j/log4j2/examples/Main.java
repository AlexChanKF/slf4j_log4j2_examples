package com.slf4j.log4j2.examples;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Car car = new Car((int) (Math.random() * 100));
            car.printId();
        }
    }

}