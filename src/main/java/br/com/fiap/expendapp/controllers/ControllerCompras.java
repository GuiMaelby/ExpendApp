package br.com.fiap.expendapp.controllers;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.Compras;

@RestController
public class ControllerCompras {
    
    @GetMapping("/api/comprasmes")
    public Compras show(){
        return new Compras(
            new String ("Mouse Gamer"),
            new BigDecimal ("250.59"),
            LocalDate.now(),
            new String ("Março"),
            (1),
            new String ("Débito")
            );
        }
    }
