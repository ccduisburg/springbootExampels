package com.concon.repository;

import com.concon.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
//spring 2- dan sonro @Repository anotation yazmaya gerek yok. Interface implementatiton yaptigimiz icin
public interface UserRepository extends MongoRepository<User,String> {

}
