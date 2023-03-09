package br.com.fiap.expendapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.fiap.expendapp.models.Login;

@RestController
public class ControllerLogin {

    @GetMapping("/api/login")
    public Login show() {
        return new Login(
            new String ("email@hotmail.com"),
            new String ("senha123")
        );  
    }
}