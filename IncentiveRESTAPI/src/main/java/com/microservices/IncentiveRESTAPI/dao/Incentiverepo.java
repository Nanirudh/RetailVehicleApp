package com.microservices.IncentiveRESTAPI.dao;
import com.microservices.IncentiveRESTAPI.model.IncentiveModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.ArrayList;
import java.util.Optional;


public interface Incentiverepo extends MongoRepository<IncentiveModel, ObjectId> {

    @Query(value=" { Make: ?0, Model: { $regex: ?1 } }")
    public ArrayList<IncentiveModel> findByMakeModel(String make, String model);
}
