package org.ymcasas.springboot.apieventmanager.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class Event {

    @Id
    private String id;
    private String title;
    private String description;
    @DBRef
    private List<Person> speakers;
    @DBRef
    private Place place;
    private List<String> categories;
    @DBRef
    private List<Comment> comments;
    private Date date;
    private List<String> organizingFaculties;
    private String organizingProgram;



}
