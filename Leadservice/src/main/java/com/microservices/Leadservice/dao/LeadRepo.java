package com.microservices.Leadservice.dao;

import com.microservices.Leadservice.model.QuoteInfo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LeadRepo extends CrudRepository<QuoteInfo, String>  {

    @Query(value = "insert ?")
    public saveDetails();
}
