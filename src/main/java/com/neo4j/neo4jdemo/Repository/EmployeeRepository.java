package com.neo4j.neo4jdemo.Repository;

import com.neo4j.neo4jdemo.Model.Employee;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
}
