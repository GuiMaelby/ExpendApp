package br.com.fiap.expendapp.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.expendapp.models.Conta;
import br.com.fiap.expendapp.repository.ContaRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/contas")
public class ContaController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ContaRepository contaRepository;

    @GetMapping
    public List<Conta>index(){
        return contaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Conta> create(@RequestBody @Valid Conta conta) {
        log.info("cadastrando conta" + conta);
        contaRepository.save(conta);     
        return ResponseEntity.status(HttpStatus.CREATED).body(conta);

    }

    @GetMapping("{id}")
    public ResponseEntity<Conta> show(@PathVariable Long id) {
        log.info("detalhando conta" + id);
        return ResponseEntity.ok(getConta(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Conta> destroy(@PathVariable Long id) {
        log.info("apagando conta" + id);
        contaRepository.delete(getConta(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Conta> update(@PathVariable Long id, @RequestBody Conta conta) {
        log.info("atualizando conta" + id);
        getConta(id);
        conta.setId(id);
        contaRepository.save(conta);
        return ResponseEntity.ok(conta);
    }

    private void getConta(Long id) {
    }

  
}
    

