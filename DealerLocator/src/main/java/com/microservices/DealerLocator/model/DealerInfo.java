package com.microservices.DealerLocator.model;
import org.springframework.data.annotation.Id;

public class DealerInfo {

    @Id
    private String dealerId;
    private String dealerName;
    private String country;
    private String city;
    private String details;


    public DealerInfo() {

    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
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
                "dealerId='" + dealerId + '\'' +
                ", dealerName='" + dealerName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
