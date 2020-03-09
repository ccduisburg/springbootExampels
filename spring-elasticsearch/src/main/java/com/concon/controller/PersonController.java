package com.concon.controller;

import com.concon.entity.Person;
import com.concon.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor//Anotationlarin hepsini kendisi olusturuyor
@RestController
@RequestMapping("/person")
public class PersonController {
  //  @Autowired
     private final PersonRepository personRepository;

//    public PersonController(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    @PostConstruct
     public void init(){
         Person person=new Person();
         person.setVorname("cemil");
         person.setNachname("kk");
         person.setAdress("ffff");
         person.setId("P0001");
         person.setGeburtsdatum(Calendar.getInstance().getTime());
         personRepository.save(person);

     }

     @GetMapping("/{search}")
     public ResponseEntity<List<Person>> getPersons(@PathVariable String search){
         List<Person> persons=personRepository.findByVornameLikeOrNachnameLike(search,search);
         return ResponseEntity.ok(persons);
     }
}
