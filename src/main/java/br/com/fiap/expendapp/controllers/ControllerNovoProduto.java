package br.com.fiap.expendapp.controllers;

import java.time.LocalDate;
import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.expendapp.models.NovoProduto;



@RestController
public class ControllerNovoProduto {
    
    @GetMapping("/api/novoproduto")
    public NovoProduto show(){
        return new NovoProduto (
            new String("Fones de Ouvido Bluetooth"),
            new BigDecimal (129.00),
            LocalDate.now(),
            (1),
            new String ("Crédito")
        );
    }
}
