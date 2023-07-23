package com.neo4j.neo4jdemo.Service;

import com.neo4j.neo4jdemo.Model.Employee;
import com.neo4j.neo4jdemo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public Logger logger;

    public Collection<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public String saveEmployee(Employee employee) {
        if(!employee.equals(null)){
            employeeRepository.save(employee);
            return "Employee with Id :" +employee.getId() + "has been saved";
        }
        else{
            return "Could not save employee";
        }

    }

    public Collection<Employee> getAll(){
        return employeeRepository.getAll();
    }
}
