package com.marcelino.aprendendo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AprendendoSpringApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AprendendoSpringApplication.class, args);

        Usuario joao = new Usuario("Joao", "Joao@gmail.com", "asd123");

        System.out.println(joao.getEmail());

        joao.setEmail("jj@gmail.com");
        System.out.println(joao.getEmail());

    }

}
