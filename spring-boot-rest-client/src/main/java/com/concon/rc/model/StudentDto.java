package com.concon.rc.model;

import lombok.Data;

import java.util.List;
@Data
public class StudentDto {
        private Long id;
        private String vorname;
        private String nachname;
        private List<String> adresses;//adresDto olusturmamak icin String olarak yaptim

}
