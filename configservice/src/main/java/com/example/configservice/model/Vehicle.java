package com.example.configservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

    private String make;
    @Id
    private String model;
    private String enginecapacity;
    private String enginepower;
    private String fueltype;
    private int numgears;
    private int numdoors;
    private String topspeed;
    private String dimensions;


    public Vehicle(String make, String model, String enginecapacity, String enginepower, String fueltype, int numgears, int numdoors, String topspeed, String dimensions) {
        this.make = make;
        this.model = model;
        this.enginecapacity = enginecapacity;
        this.enginepower = enginepower;
        this.fueltype = fueltype;
        this.numgears = numgears;
        this.numdoors = numdoors;
        this.topspeed = topspeed;
        this.dimensions = dimensions;
    }


    public Vehicle() {

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEnginecapacity() {
        return enginecapacity;
    }

    public void setEnginecapacity(String enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    public String getEnginepower() {
        return enginepower;
    }

    public void setEnginepower(String enginepower) {
        this.enginepower = enginepower;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public int getNumgears() {
        return numgears;
    }

    public void setNumgears(int numgears) {
        this.numgears = numgears;
    }

    public int getNumdoors() {
        return numdoors;
    }

    public void setNumdoors(int numdoors) {
        this.numdoors = numdoors;
    }

    public String getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(String topspeed) {
        this.topspeed = topspeed;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

}
