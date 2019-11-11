package com.microservices.IncentiveRESTAPI.model;


import java.util.List;
import java.util.Optional;

public class IncentiveInfoResponseModel {


    private List<IncentiveModel> response;

    public IncentiveInfoResponseModel() {}

    public IncentiveInfoResponseModel(List<IncentiveModel> response) {
        this.response = response;
    }

    public List<IncentiveModel> getResponse() {
        return response;
    }

    public void setResponse(List<IncentiveModel> response) {
        this.response = response;
    }
}
