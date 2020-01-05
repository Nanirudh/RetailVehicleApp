package com.microservices.partservice.model;

import javax.persistence.*;
import java.io.Serializable;

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
    private String dealerid;


    public String getDealerid() {
        return dealerid;
    }

    public void setDealerid(String dealerid) {
        this.dealerid = dealerid;
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
