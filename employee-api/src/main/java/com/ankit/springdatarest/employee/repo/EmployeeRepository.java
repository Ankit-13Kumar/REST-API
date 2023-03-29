package com.ankit.springdatarest.employee.repo;

import org.springframework.data.repository.CrudRepository;

import com.ankit.springdatarest.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
