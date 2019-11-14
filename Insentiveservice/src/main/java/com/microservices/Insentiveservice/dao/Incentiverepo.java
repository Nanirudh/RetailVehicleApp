package com.microservices.Insentiveservice.dao;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.microservices.Insentiveservice.model.IncentiveModel;
import java.util.ArrayList;

public interface Incentiverepo extends MongoRepository<IncentiveModel, ObjectId> {

    @Query(value=" { Make: ?0, Model: { $regex: ?1 } }")
    public ArrayList<IncentiveModel> findByMakeModel(String make, String model);
}
