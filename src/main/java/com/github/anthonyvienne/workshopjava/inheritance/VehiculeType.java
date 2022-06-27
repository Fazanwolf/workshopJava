package com.github.anthonyvienne.workshopjava.inheritance;

public enum VehiculeType {

    CAR("Car"),
    PLANE("Plane"),
    BOAT("Boat");

    public String getType() {
        return type;
    }

    public final String type;

    private VehiculeType(String type) {
        this.type = type;
    }

    public static VehiculeType fromString(String type) throws VehiculeTypeNotFound {
        for (VehiculeType value : values()) {
            if (value.getType().equals(type))
                return (value);
        }
        throw new VehiculeTypeNotFound("Invalid vehicule type: " + type);
    }

}
