package br.com.example.restspringbootudemy;

import br.com.example.restspringbootudemy.domain.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestSpringBootUdemyApplication {

    public static void main(String[] args) {
        Greeting gre = new Greeting(1, "teste");
        SpringApplication.run(RestSpringBootUdemyApplication.class, args);
    }

}
