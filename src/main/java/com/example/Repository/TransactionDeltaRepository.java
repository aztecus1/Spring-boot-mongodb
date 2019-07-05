package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.transactionDelta;

@Repository
public interface TransactionDeltaRepository extends MongoRepository<transactionDelta,String> {

}
