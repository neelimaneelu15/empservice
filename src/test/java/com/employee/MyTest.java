package com.employee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@SpringBootTest
public class MyTest {

	@Autowired

	 EmployeeRepository empRepository;

	@Autowired
    EmployeeService empService;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test

//void findAdminByIdTest() {
//		Optional<Employee> admin = empService.getEmployeeById(8);
//		Employee admin1 = admin.get();
//		assertEquals("ssss", admin1.getEmployeeName());
//	}
	//@Test
	//void getAllAdminTest() {
		//List<Employee> admins = empRepository.findAll();
		//assertEquals(0, admins.size());
		//Employee admin = admins.get(0);
		//assertEquals("Ravi",admin.getEmployeeName());
	//}

}