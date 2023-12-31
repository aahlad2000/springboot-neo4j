package com.neo4j.neo4jdemo.Model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Getter
@Setter
public class Employee {
    @Id
    @Generated
    private Long id;
    private String name;
    private Integer age;
    private String branch;
}
