package com.neo4j.neo4jdemo.Model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Getter
@Setter
public class Employee {
    @GraphId
    private Long id;
    private String name;
    private Integer age;
    private String branch;
}
