package com.github.anthonyvienne.workshopjava;

import com.github.anthonyvienne.workshopjava.inheritance.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main  {

    public static void showVehicule(AbstractVehicule vehicule)
    {
        System.out.println("Name: " + vehicule.getName());
        System.out.println("Color: " + vehicule.getColor());
        System.out.println("Speed: " + vehicule.getSpeed());
        System.out.println("Type: " + vehicule.getType());
    }

    public static int getNumberOf(ArrayList<AbstractVehicule> list, VehiculeType type)
    {
        int count = 0;

        for (AbstractVehicule v : list) {
            if (v.getType() == type)
                count++;
        }
        return (count);
    }

    public static void main(String[] args) {
        ArrayList<AbstractVehicule> vehicules = new ArrayList<AbstractVehicule>();

        vehicules.add(new Boat("A", 170, Color.BLACK));
        vehicules.add(new Car("B", 90, Color.YELLOW));
        vehicules.add(new Plane("C", 300, Color.RED));
        vehicules.add(new Boat("D", 170, Color.BLACK));
        vehicules.add(new Car("E", 90, Color.YELLOW));
        vehicules.add(new Plane("F", 300, Color.RED));
        vehicules.add(new Boat("G", 170, Color.BLACK));
        vehicules.add(new Car("H", 90, Color.YELLOW));
        vehicules.add(new Plane("I", 300, Color.RED));
        vehicules.add(new Boat("J", 170, Color.BLACK));
        vehicules.add(new Car("K", 90, Color.YELLOW));
        vehicules.add(new Plane("L", 300, Color.RED));

        for (AbstractVehicule vehicule : vehicules) {
            showVehicule(vehicule);
        }

        System.out.println("\nVehicules: " + vehicules.size());
        System.out.println("Cars: " + getNumberOf(vehicules, VehiculeType.CAR));
        System.out.println("Planes: " + getNumberOf(vehicules, VehiculeType.PLANE));
        System.out.println("Boats: " + getNumberOf(vehicules, VehiculeType.BOAT) + "\n");

        List<Car> cars = vehicules.stream().filter(v -> v instanceof Car).map(v -> (Car) v).collect(Collectors.toList());
        List<Plane> planes = vehicules.stream().filter(v -> v instanceof Plane).map(v -> (Plane) v).collect(Collectors.toList());
        List<Boat> boats = vehicules.stream().filter(v -> v instanceof Boat).map(v -> (Boat) v).collect(Collectors.toList());

        for (Car car : cars) {
            car.drive();
        }

        for (Plane plane : planes) {
            plane.fly();
        }

        for (Boat boat : boats) {
            boat.floaty();
        }

    }

}
