package com.microservices.Leadservice.model;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class QuoteInfo {

    @Id
    @Column(name = "uid")
    String uid;
    @Column(name = "make")
    String make;
    @Column(name = "model")
    String model;
    @Column(name = "orderitem")
    String orderitem;
    @Column(name = "quantity")
    String quantity;

    public QuoteInfo() {}

    public QuoteInfo(String uid, String make, String model, String orderitem, String quantity) {
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
