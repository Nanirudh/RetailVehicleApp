package com.microservices.compareservice.repository;

import com.microservices.compareservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query(value = "SELECT model FROM cardata WHERE Make = ?1", nativeQuery = true)
    List<String> findByMake(String make);

}
