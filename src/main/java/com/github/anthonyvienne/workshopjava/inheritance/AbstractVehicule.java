package com.github.anthonyvienne.workshopjava.inheritance;

import java.awt.Color;

public abstract class AbstractVehicule {

    private final String name;

    private Color color;

    public String getName() {
        return name;
    }

    protected AbstractVehicule(String name) {
        this.name = name;
    }

    protected AbstractVehicule(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getSpeed();

    public abstract void move();

    public abstract VehiculeType getType();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return ("AbstractVehicule: {name: " + this.name + ", speed: 0, color: " + this.color.toString() + "}");
    }

}
