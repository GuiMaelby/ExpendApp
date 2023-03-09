package br.com.fiap.expendapp.controllers;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.fiap.expendapp.models.Cadastro;

@RestController
public class ControllerCadastro {

    @GetMapping("/api/cadastro")
    public Cadastro show() {
        return new Cadastro(
            new String ("Guilherme"),
            new String ("guilherme@email.com"),
            new String ("senha123"),
            LocalDate.of (1990, 3, 8)
        );  
    }
}