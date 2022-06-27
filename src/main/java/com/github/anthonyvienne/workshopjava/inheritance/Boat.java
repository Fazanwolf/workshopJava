package com.github.anthonyvienne.workshopjava.inheritance;

import com.github.anthonyvienne.workshopjava.inheritance.floaty.IFloatyable;

import java.awt.Color;

public class Boat extends AbstractVehicule implements IFloatyable {

    public Boat(String name, double speed, Color color)
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
        return (VehiculeType.BOAT);
    }

    @Override
    public void floaty() {
        System.out.println("Floating");
    }
}
