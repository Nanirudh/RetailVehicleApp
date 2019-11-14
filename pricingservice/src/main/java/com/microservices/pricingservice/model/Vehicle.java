package com.microservices.pricingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

    @Id
    private String make;
    private String model;
    private int engine;
    private int steering;
    private int seats;
    private int battery;
    private int headlights;
    private int tyres;
    private int fueltank;
    private int body;
    private int gearbox;
    private int total;

    public Vehicle(String make, String model, int engine, int steering, int seats, int battery, int headlights, int tyres, int fueltank, int body, int gearbox, int total) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.steering = steering;
        this.seats = seats;
        this.battery = battery;
        this.headlights = headlights;
        this.tyres = tyres;
        this.fueltank = fueltank;
        this.body = body;
        this.gearbox = gearbox;
        this.total = total;
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

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getHeadlights() {
        return headlights;
    }

    public void setHeadlights(int headlights) {
        this.headlights = headlights;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public int getFueltank() {
        return fueltank;
    }

    public void setFueltank(int fueltank) {
        this.fueltank = fueltank;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getGearbox() {
        return gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }



}
