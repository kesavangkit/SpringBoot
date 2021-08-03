package com.SpringBootRestJPAOracle.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootRestJPAOracle.Dao.IEmployeeDao;
import com.SpringBootRestJPAOracle.Entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeDao employeeDao;

	@RequestMapping(path="/employees", produces = "application/xml")
	public List<Employee> getAllEmplyees() {
		return employeeDao.findAll(Sort.by(getSortList()));
	}

	private List<Order> getSortList() {
		List<Order> listOrder = new ArrayList<>();
		listOrder.add(new Order(Direction.ASC, "name"));
		listOrder.add(new Order(Direction.ASC, "dept"));
		return listOrder;
	}

	@GetMapping(path="/employee/{id}")
	public Employee employee(@PathVariable("id") int employeedId) {
		return employeeDao.findById(employeedId).orElse(null);
	}

	@PostMapping("employee")
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@PutMapping("employee")
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@DeleteMapping(path="/employee/{id}") 
	public String removeEmployee(@PathVariable("id") int employeedId) {
		Employee employee = employeeDao.getById(employeedId);
		if(employee == null) {
			return "Employee record not found.";
		}else {
			employeeDao.delete(employee);
		}
		return "Deleted Successfully...";
	}
}