package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepository;
	

	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		return empRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long employeeId) throws Exception {
		Optional<Employee> e1=empRepository.findById(employeeId);
		return e1.get();
	}

	@Override
	public String deleteEmployee(Long employeeId) throws Exception {
		empRepository.deleteById(employeeId);
		return "Employee with id "+employeeId+"has deleted";
	}

	@Override
	public Employee updateEmployee(Employee employee) throws Exception {
		return empRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		return empRepository.findAll();
	}
	
	

}