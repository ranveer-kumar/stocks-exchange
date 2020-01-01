package com.fondofit.stock.exchange.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fondofit.stock.exchnage.model.ExchangeBean;

@Repository
public interface ExchangeRepository extends MongoRepository<ExchangeBean, String> {

}
