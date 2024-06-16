package org.ymcasas.springboot.apieventmanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class City {

    @Id
    private String id;
    private String name;
    private String departament;
    private String country;
}
