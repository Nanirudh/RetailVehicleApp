package com.microservices.pricingincentiveservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.microservices.pricingincentiveservice.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Incentiverepo extends JpaRepository<IncentiveModel, IncentiveKey> {

    @Query(value = "SELECT * FROM incentive_info WHERE make=?1 and model=?2", nativeQuery = true)
    List<IncentiveModel> findByMakeModel(String make, String model);
}
