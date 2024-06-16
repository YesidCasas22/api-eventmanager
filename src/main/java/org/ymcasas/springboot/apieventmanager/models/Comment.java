package org.ymcasas.springboot.apieventmanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Comment {

    @Id
    private String id;
    private String text;
    @DBRef
    private Person user;
}
