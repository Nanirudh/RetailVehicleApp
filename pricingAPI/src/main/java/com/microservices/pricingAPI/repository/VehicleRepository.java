package com.microservices.pricingAPI.repository;

import com.microservices.pricingAPI.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query(value = "SELECT * FROM price WHERE Make = ?1 AND Model = ?2", nativeQuery = true)
    Vehicle findByMakeAndModel(String make, String model);

}
