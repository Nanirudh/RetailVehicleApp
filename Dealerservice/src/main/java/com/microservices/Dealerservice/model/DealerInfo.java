package com.microservices.Dealerservice.model;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class DealerInfo {

    @Id
    private String dealer_id;
    private String dealer_name;
    private String country;
    private String city;
    private String details;


    public DealerInfo() {

    }





    public String getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(String dealer_id) {
        this.dealer_id = dealer_id;
    }

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "DealerInfo{" +
                "dealerId='" + dealer_id + '\'' +
                ", dealerName='" + dealer_name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
