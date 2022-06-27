package com.github.anthonyvienne.workshopjava.inheritance;

import com.github.anthonyvienne.workshopjava.inheritance.drive.IDriveable;

import java.awt.Color;

public class Car extends AbstractVehicule implements IDriveable {

    public Car(String name, double speed, Color color)
    {
        super(name, color);
        this.speed = speed;
    }

    protected double speed;
    public Color color;

    @Override
    public double getSpeed() {
        return (this.speed);
    }

    @Override
    public void move() {
        System.out.println("Moved");
    }

    @Override
    public VehiculeType getType() {
        return (VehiculeType.CAR);
    }

    @Override
    public void drive() {
        System.out.println("Driving");
    }

}
