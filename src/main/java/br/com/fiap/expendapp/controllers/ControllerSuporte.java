package br.com.fiap.expendapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Suporte;

@RestController
public class ControllerSuporte {

    @GetMapping("/api/suporteonline")
    public Suporte show() {
        return new Suporte(
                new String("1199112222"));
    }
}