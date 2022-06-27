package com.github.anthonyvienne.workshop.test;

import com.github.anthonyvienne.workshopjava.inheritance.VehiculeType;
import com.github.anthonyvienne.workshopjava.inheritance.VehiculeTypeNotFound;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {
    @Test
    public void testVehiculeTypes() {
        assertEquals("Car", VehiculeType.CAR.getType());
        assertNotEquals("CAR", VehiculeType.CAR.getType());
        assertEquals("Plane", VehiculeType.PLANE.getType());
        assertNotEquals("PLANE", VehiculeType.PLANE.getType());
        assertEquals("Boat", VehiculeType.BOAT.getType());
        assertNotEquals("BOAT", VehiculeType.BOAT.getType());
    }

    @Test
    public void testFromType() throws VehiculeTypeNotFound {
        Exception eCar = assertThrows(VehiculeTypeNotFound.class, () -> VehiculeType.CAR.fromString("CAR"));
        Exception ePlane = assertThrows(VehiculeTypeNotFound.class, () -> VehiculeType.PLANE.fromString("PLANE"));
        Exception eBoat = assertThrows(VehiculeTypeNotFound.class, () -> VehiculeType.BOAT.fromString("BOAT"));
        assertEquals("Invalide vehicule type: CAR", eCar.getMessage());
        assertEquals("Invalide vehicule type: PLANE", ePlane.getMessage());
        assertEquals("Invalide vehicule type: BOAT", eBoat.getMessage());
        assertEquals(VehiculeType.CAR, VehiculeType.CAR.fromString("Car"));
        assertEquals(VehiculeType.PLANE, VehiculeType.CAR.fromString("Plane"));
        assertEquals(VehiculeType.BOAT, VehiculeType.CAR.fromString("Boat"));
    }

}
