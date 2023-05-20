package com.employee.controllers;

import com.asses.model.Employee;
import com.repository.employee.EmployeeRepo;
import com.repository.employee.EmployeeService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Database saved in Employee";
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> empList = new ArrayList<>();
        employeeRepo.findAll().forEach(empList::add);
        return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
    }
@Autowired
    private EmployeeService empservice;

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchEmployee(@RequestParam("query") String query) {
        return ResponseEntity.ok(empservice.searchEmployee(query));

    }

    @PutMapping ("/employee/{empid}")
    public String updateEmployee(@PathVariable long empid, @RequestBody Employee employee) {
        Optional<Employee> emp = employeeRepo.findById(empid);
        if (emp.isPresent()) {
            Employee existEmp = emp.get();
            existEmp.setFirstName(employee.getFirstName());
            existEmp.setLastName(employee.getLastName());
            existEmp.setEmail(employee.getEmail());
            existEmp.setPhoneNumber(employee.getPhoneNumber());
            employeeRepo.save(existEmp);
            return "Employee details updated";
        } else
            return "Employee details not found";

    }
    @DeleteMapping("/employee/{empid}")
    public String deleteEmployeebyId(@PathVariable long empid)
    {
        employeeRepo.deleteById(empid);
        return "Empolyee data has been Deleted";
    }
}
