package org.ymcasas.springboot.apieventmanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Place {

    @Id
    private String id;
    private String name;
    private String address;
    private City city;
}
