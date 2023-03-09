package br.com.fiap.expendapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Configuracoes;

@RestController
public class ControllerConfiguracoes {

    @GetMapping("/api/confgerais")
    public Configuracoes show(){
        return new Configuracoes(
            (false),
            (false),
            (true)
        );
    }
}