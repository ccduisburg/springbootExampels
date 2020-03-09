package com.concon.rc.api;

import com.concon.rc.model.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
/*
* Proxy Api
* spring-datajpa-postgresql Api ye bu client Api üzerinden get ve post istegi gönderdik
* Tampon gibi kullandik.
* */
@Controller
@RequestMapping("/test")
public class RestClientController {
    private static final String webUrl="http://localhost:8086/student/students";
    private static final String webUrlPost="http://localhost:8086/student";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getPersonList(){
        ResponseEntity<List> result=restTemplate.getForEntity(webUrl,List.class);
        System.out.println(result);
        List<StudentDto> reponseBody=result.getBody();
        return ResponseEntity.ok(reponseBody);
    }
    @PostMapping
    public ResponseEntity<StudentDto> save(@RequestBody StudentDto studentDto){
        ResponseEntity<StudentDto> result= restTemplate.postForEntity(webUrlPost,studentDto,StudentDto.class);
        System.out.println(result);
        StudentDto reponseBody=result.getBody();
        return ResponseEntity.ok(reponseBody);
    }
}
