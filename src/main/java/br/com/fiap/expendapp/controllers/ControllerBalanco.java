package br.com.fiap.expendapp.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Balanco;

@RestController
public class ControllerBalanco {
    @GetMapping("/api/balancodecontas")
    public Balanco show(){
        return new Balanco(
            (1),
            new BigDecimal (1200.00),
            new BigDecimal (2000.00),
            new BigDecimal (800.00),
            new String("Crédito"),
            new String("Abaixo")
        );
    }   
}
