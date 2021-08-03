package com.SpringBootWebAppJPAOracle.Dao;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootWebAppJPAOracle.Entity.EmployeeEntity;

public interface IEmployeeDao extends CrudRepository<EmployeeEntity, Integer> {

}
