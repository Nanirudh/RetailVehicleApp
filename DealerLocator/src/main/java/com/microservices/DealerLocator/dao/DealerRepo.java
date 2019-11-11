package com.microservices.DealerLocator.dao;

import org.springframework.data.repository.CrudRepository;
import com.microservices.DealerLocator.model.DealerInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealerRepo extends CrudRepository<DealerInfo, String> {

  public List<DealerInfo> findByCountryCity(String country, String city);

  public List<DealerInfo> findByCountry(String country);
}
