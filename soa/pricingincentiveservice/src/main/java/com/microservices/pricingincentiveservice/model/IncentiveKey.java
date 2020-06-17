package com.microservices.pricingincentiveservice.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class IncentiveKey implements Serializable {

    String make;
    String model;
    String dealerid;
    String incentiveid;

    public IncentiveKey() {}

    public IncentiveKey(String make, String model, String dealerid, String incentiveid) {
        this.make = make;
        this.model = model;
        this.dealerid = dealerid;
        this.incentiveid = incentiveid;
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

    public String getDealerid() {
        return dealerid;
    }

    public void setDealerid(String dealerid) {
        this.dealerid = dealerid;
    }

    public String getIncentiveid() {
        return incentiveid;
    }

    public void setIncentiveid(String incentiveid) {
        this.incentiveid = incentiveid;
    }
}
