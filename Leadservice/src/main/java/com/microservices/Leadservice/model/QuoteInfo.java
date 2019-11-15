package com.microservices.Leadservice.model;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class QuoteInfo {

    @Id
    String uid;
    String make;
    String model;
    String orderitem;
    Integer quantity;

    public QuoteInfo() {}

    public QuoteInfo(String uid, String make, String model, String orderitem, Integer quantity) {
        this.uid = uid;
        this.make = make;
        this.model = model;
        this.orderitem = orderitem;
        this.quantity = quantity;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(String orderitem) {
        this.orderitem = orderitem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
