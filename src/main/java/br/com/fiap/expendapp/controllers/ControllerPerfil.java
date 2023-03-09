package br.com.fiap.expendapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Perfil;

@RestController
public class ControllerPerfil {

    @GetMapping("/api/perfilusuario/")
    public Perfil show(){
        return new Perfil(
        new String ("Felipe")
        );
    }
}
