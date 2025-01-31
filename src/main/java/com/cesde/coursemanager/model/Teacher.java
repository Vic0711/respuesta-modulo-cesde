
package com.cesde.coursemanager.model;

import jakarta.persistence.*;


@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String document;
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
