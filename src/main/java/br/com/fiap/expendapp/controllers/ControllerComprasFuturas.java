package br.com.fiap.expendapp.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.ComprasFuturas;


@RestController
public class ControllerComprasFuturas {
    
    @GetMapping("/api/comprasfuturas")
    public ComprasFuturas show(){
        return new ComprasFuturas(
        ); 
    }
}