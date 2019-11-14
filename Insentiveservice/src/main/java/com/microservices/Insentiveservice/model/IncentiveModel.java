package com.microservices.Insentiveservice.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;

@Document(collection = "IncentiveModel")
public class IncentiveModel {

    @Id
    public ObjectId _id;

    public String make;
    public String model;
    public String dealerId;
    public String[] incentives;

    public IncentiveModel() {
    }

    public IncentiveModel(ObjectId _id, String make, String model, String[] incentives) {
        this._id = _id;
        this.make = make;
        this.model = model;
        this.incentives = incentives;
    }

    @Override
    public String toString() {
        return "IncentiveModel{" +
                "_id=" + _id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", incentives=" + Arrays.toString(incentives) +
                '}';
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String[] getIncentives() {
        return incentives;
    }

    public void setIncentives(String[] incentives) {
        this.incentives = incentives;
    }
}

