package com.SpringBootWebAppJPAOracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebAppJpaOracleApplication/* implements CommandLineRunner */ {

//	@Autowired
//	StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppJpaOracleApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { List<Student>
	 * students = (List<Student>) studentDao.findAll(); students.forEach(System.out
	 * :: println); }
	 */
}