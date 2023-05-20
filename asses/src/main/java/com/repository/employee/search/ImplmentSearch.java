package com.repository.employee.search;

import com.asses.model.Employee;
import com.repository.employee.EmployeeRepo;
import com.repository.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImplmentSearch implements EmployeeService {

private EmployeeRepo employeeRepo;

    public ImplmentSearch(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;

    }

    @Override
    public List<Employee> searchEmployee(String query) {
        List<Employee>employees=employeeRepo.searchEmployee(query);
        return employees;
    }
}
