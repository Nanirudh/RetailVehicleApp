package com.microservices.dealerleadservice.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.microservices.dealerleadservice.model.DealerInfo;

import java.util.List;

@Repository
public interface DealerRepo extends CrudRepository<DealerInfo, String> {

    @Query(value = "select dealer_id, dealer_name, country, city, details from dealerinfo d where d.country=?1 and d.city=?2",nativeQuery = true)
    public List<DealerInfo> findByCountryAndCity(String country, String city);

    @Query(value = "select dealer_id, dealer_name, country, city, details from dealerinfo d where d.country=?1",nativeQuery = true)
    public List<DealerInfo> findByCountry(String country);
}
