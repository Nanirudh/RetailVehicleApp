package com.microservices.pricingservice.repository;

import com.microservices.pricingservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    @Query(value = "SELECT * FROM price WHERE make = ?1 AND model = ?2", nativeQuery = true)
    Vehicle findByMakeAndModel(String make, String model);

}
