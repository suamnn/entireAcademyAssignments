package com.entireAcademy.Day6.ObjectAndString;

public class Car extends CarEngine {
    private String model;
    private String color;
    private String make;

    public Car() {

    }

    public Car(String make, String model, String color) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String makeNoise() {
        return "Brom! Brom!";
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
