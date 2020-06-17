package com.microservices.partproductservice.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.microservices.partproductservice.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

    @Query(value = "SELECT * FROM cardata WHERE make = ?1 AND model = ?2", nativeQuery = true)
    Vehicle findByMakeAndModel(String make, String model);


    @Query(value = "SELECT * FROM cardata WHERE dealerid = ?1", nativeQuery = true)
    List<Vehicle> findBydealerid(String did);

    @Query(value = "SELECT model FROM cardata WHERE Make = ?1", nativeQuery = true)
    List<String> findByMake(String make);

}
