package com.kejiny.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kejiny.model.Honey;

@Repository
public interface HoneyRepository extends MongoRepository<Honey, String>{

}
