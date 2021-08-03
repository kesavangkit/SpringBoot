package com.SpringBootRestJPAOracle.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootRestJPAOracle.Entity.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}
