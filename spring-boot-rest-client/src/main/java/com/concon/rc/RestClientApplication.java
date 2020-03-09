package com.concon.rc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {
    //Birtane instance olusturmayi saglayacak,
    // @Bean anotation ise springboot init olduktansonra  RestTemplate methodunu cagiracak
    // ve bu method dan olusan nesneyi götürüp IOC container in icersiine koyacak
    // biz bu methodi ioc container icerisindeki instancesini @Autowird anotationu ile baglanip kullanabilecegiz
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class,args);
    }
}
