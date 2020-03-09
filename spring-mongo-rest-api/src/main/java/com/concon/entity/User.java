package com.concon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
@Document//mongo collection oldugunu belirtmek icin kullaniyoruz
public class User {
    @Id
    private String id;
    private String vorname;
    private String nachname;
    private HashMap specification;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public HashMap getSpecification() {
        return specification;
    }

    public void setSpecification(HashMap specification) {
        this.specification = specification;
    }

    public User() {
    }
}
