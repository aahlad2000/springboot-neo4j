package com.neo4j.neo4jdemo.Controller;

import com.neo4j.neo4jdemo.Model.Employee;
import com.neo4j.neo4jdemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("neo4j/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    @GetMapping("getAll")
//    public Collection<Employee> getAll(){
//        return employeeService.getAll();
//    }

    @GetMapping("all")
    public Collection<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("findById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
}
