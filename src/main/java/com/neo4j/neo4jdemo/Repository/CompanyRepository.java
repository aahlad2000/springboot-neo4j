package com.neo4j.neo4jdemo.Repository;

import com.neo4j.neo4jdemo.Model.Company;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CompanyRepository extends Neo4jRepository<Company, Long> {


}
