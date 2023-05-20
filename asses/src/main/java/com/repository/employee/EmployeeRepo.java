package com.repository.employee;

import com.asses.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Long>{

     @Query( "SELECT e from Employee e Where "+
     "e.firstName like concat('%',:query,'%')"+
             "Or e.lastName like concat('%',:query,'%')"+
             "Or e.email like concat('%',:query,'%')"

     )
     List<Employee> searchEmployee(String query);
}
