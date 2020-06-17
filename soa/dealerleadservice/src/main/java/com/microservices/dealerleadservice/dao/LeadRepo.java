package com.microservices.dealerleadservice.dao;
import com.microservices.dealerleadservice.model.QuoteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepo extends JpaRepository<QuoteInfo, String> {
    @Query(value = "INSERT INTO QuoteInfo values(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void inserttuple(String uid, String make, String model, String orderitem, String quantity);
}
