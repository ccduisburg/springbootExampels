package com.concon.controller;

import com.concon.entity.User;
import com.concon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void   init(){
        User user=new User();
        user.setVorname("cc");
        user.setNachname("dd");
        userRepository.save(user);
    }


    @PostMapping//tek post oldugu source icin adres eklemeye gerek yok
    public ResponseEntity<User> add(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
@GetMapping("/users")
    public ResponseEntity<List<User>> users(User user){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
