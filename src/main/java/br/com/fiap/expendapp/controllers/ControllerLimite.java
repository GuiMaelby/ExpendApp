package br.com.fiap.expendapp.controllers;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Limite;

@RestController
public class ControllerLimite {
    @GetMapping("/api/limite")
    public Limite show() {
        return new Limite(
            new BigDecimal (2500.00)
        );
    }
}