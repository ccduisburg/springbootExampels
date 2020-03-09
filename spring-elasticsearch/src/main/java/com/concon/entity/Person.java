package com.concon.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Document(indexName="persons",type="person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private String id;
    @Field(name="vorname",type= FieldType.Text)
    private String vorname;
    @Field(name="nachname",type= FieldType.Text)
    private String nachname;
    @Field(name="adress",type= FieldType.Text)
    private String adress;
    @Field(name="geburtsdatum",type= FieldType.Date)
    private Date geburtsdatum;
}
