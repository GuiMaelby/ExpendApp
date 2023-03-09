package br.com.fiap.expendapp.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.FuturaCompra;

@RestController
public class ControllerFuturaCompra {
    
    @GetMapping("/api/futuracompra")
    public FuturaCompra show(){
        return new FuturaCompra (
            new String("Controle"),
            new BigDecimal (100.00),
            new String("Agosto"),
            (1),
            new String ("Dinheiro")
        );
    }
}