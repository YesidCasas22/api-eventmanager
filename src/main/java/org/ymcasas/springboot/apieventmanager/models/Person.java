package org.ymcasas.springboot.apieventmanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Person {

    @Id
    private String id;
    private String username;
    private String fullName;
    private String typeRelationship;
    private String email;
    private City city;
}
