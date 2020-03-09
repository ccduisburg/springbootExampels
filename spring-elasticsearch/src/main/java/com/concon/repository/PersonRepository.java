package com.concon.repository;

import com.concon.entity.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface  PersonRepository extends ElasticsearchRepository<Person,String> {
    @Query("{\"bool\": {\"must\":[{\"match\": {\"vorname\":\"?0\"}}]}}")
    List<Person> getCustomQuery(String search);

  List<Person>  findByVornameLikeOrNachnameLike(String vorname,String nachname);
}
