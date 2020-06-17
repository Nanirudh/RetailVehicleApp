package com.microservices.Insentiveservice.model;

import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

@Entity
public class IncentiveModel {

   @EmbeddedId private IncentiveKey key;
    String incentive;

    public IncentiveModel() {}

    public IncentiveKey getKey() {
        return key;
    }

    public void setKey(IncentiveKey key) {
        this.key = key;
    }

    public String getIncentive() {
        return incentive;
    }

    public void setIncentive(String incentive) {
        this.incentive = incentive;
    }

    @Override
    public String toString() {
        return "IncentiveModel{" +
                "key=" + key +
                ", incentive='" + incentive + '\'' +
                '}';
    }
}

