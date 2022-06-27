package com.github.anthonyvienne.workshopjava.inheritance;

import com.github.anthonyvienne.workshopjava.inheritance.fly.IFlyable;

import java.awt.Color;

public class Plane extends AbstractVehicule implements IFlyable {

    public Plane(String name, double speed, Color color)
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
        return (VehiculeType.PLANE);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
