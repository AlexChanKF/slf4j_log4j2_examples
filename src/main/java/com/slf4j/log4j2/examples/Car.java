package com.slf4j.log4j2.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

    private Logger logger = LoggerFactory.getLogger(Car.class);
    private int id;

    public Car(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printId() {
        logger.info("CarId: " + getId());
    }

}