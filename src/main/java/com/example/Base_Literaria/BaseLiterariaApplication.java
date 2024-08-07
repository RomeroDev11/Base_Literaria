package com.example.Base_Literaria;

import com.example.Base_Literaria.principal.Principal;
import com.example.Base_Literaria.model.entity.autor.AutorRepository;
import com.example.Base_Literaria.model.entity.libro.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
    @Autowired
    LibroRepository libroRepository;
    @Autowired
    AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(libroRepository, autorRepository);
        principal.mostrarMenu();
    }
}

