package com.microservices.pricingincentiveservice.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.microservices.pricingincentiveservice.model.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface Pricingrepo extends CrudRepository<Vehicle, Integer> {

    @Query(value = "SELECT * FROM price WHERE make = ?1 AND model = ?2", nativeQuery = true)
    Vehicle findByMakeAndModel(String make, String model);
}
