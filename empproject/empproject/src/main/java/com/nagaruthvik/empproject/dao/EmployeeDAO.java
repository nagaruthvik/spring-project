package com.nagaruthvik.empproject.dao;

import com.nagaruthvik.empproject.model.EmployeeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeDAO extends MongoRepository<EmployeeModel, Long> {

}
