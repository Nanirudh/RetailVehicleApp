package com.microservices.Leadservice.dao;

import com.microservices.Leadservice.model.QuoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface LeadRepo extends JpaRepository<QuoteInfo, String>  {

    @Query(value = "INSERT INTO QuoteInfo values(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void inserttuple(String uid, String make, String model, String orderitem, String quantity);
}
