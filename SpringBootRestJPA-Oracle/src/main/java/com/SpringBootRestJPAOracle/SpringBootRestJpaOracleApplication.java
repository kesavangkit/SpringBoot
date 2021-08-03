package com.SpringBootRestJPAOracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestJpaOracleApplication {//implements CommandLineRunner {

	
	/*
	 * @Autowired EmployeeDao employeeDao;
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestJpaOracleApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { List<Employee>
	 * students = (List<Employee>) employeeDao.findAll();
	 * students.forEach(System.out :: println); }
	 */
}
