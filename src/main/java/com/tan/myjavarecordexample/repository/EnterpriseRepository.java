package com.tan.myjavarecordexample.repository;

import com.tan.myjavarecordexample.entity.EnterpriseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends MongoRepository<EnterpriseEntity, String> {
}
