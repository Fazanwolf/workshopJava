package com.github.anthonyvienne.workshopjava.inheritance;

public class VehiculeTypeNotFound extends Exception {
    VehiculeTypeNotFound(String errorMsg)
    {
        super(errorMsg);
    }
}
