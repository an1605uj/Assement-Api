package com.repository.employee;

import com.asses.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> searchEmployee(String query);
}
