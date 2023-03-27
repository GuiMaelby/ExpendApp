package br.com.fiap.expendapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.expendapp.models.Compras;
import br.com.fiap.expendapp.repository.ComprasRepository;
import br.com.fiap.expendapp.models.Produto;
import br.com.fiap.expendapp.repository.ProdutoRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/compras")
public class ComprasController {
    
    Logger log = LoggerFactory.getLogger(ComprasRepository.class);

    @Autowired
    ComprasRepository repository;

    @GetMapping
    public List<Compras>index(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid Produto produto) {
        log.info("cadastrando produto" + produto);
        repository.save(produto);     
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);

    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id) {
        log.info("detalhando produto" + id);
        
        if (id==1) throw new ResponseStatusException(HttpStatus.FORBIDDEN, "não autorizado");

        var produtoEncontrado = repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "produto não encontrado"));

        return ResponseEntity.ok(produtoEncontrado);
      
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Produto> destroy(@PathVariable Long id) {
        log.info("apagando produto" + id);
        var produtoEncontrado = repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao apagar. Produto não encontrado"));

        repository.delete(produtoEncontrado);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        log.info("atualizando produto" + id);
        repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "produto não encontrado"));

        produto.setId(id);
        repository.save(produto);
    
        return ResponseEntity.ok(produto);
    }
}