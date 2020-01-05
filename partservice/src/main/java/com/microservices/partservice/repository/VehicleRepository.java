package com.microservices.partservice.repository;

import com.microservices.partservice.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @Query(value = "SELECT * FROM cardata WHERE make = ?1 AND model = ?2", nativeQuery = true)
    Vehicle findByMakeAndModel(String make, String model);

    @Query(value = "SELECT * FROM cardata WHERE dealerid = 1", nativeQuery = true)
    List<Vehicle>findBydealerid(String did);

}
