package com.neo4j.neo4jdemo.Repository;

import com.neo4j.neo4jdemo.Model.Employee;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {

    @Query("MATCH (e:Employee)<- [w:WORKS_IN]-(c:Company) RETURN e,w,r")
    Collection<Employee> getAll();
}
