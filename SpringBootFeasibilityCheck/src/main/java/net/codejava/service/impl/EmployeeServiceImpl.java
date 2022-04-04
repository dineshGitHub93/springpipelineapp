package net.codejava.service.impl;


import org.springframework.stereotype.Service;

import net.codejava.entity.Employee;
import net.codejava.repository.EmployeeRepository;
import net.codejava.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
 
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
