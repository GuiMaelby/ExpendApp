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

import br.com.fiap.expendapp.models.Produto;
import br.com.fiap.expendapp.repository.ContaRepository;
import br.com.fiap.expendapp.repository.ProdutoRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    
    Logger log = LoggerFactory.getLogger(ProdutoController.class);

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ContaRepository contaRepository;

    @GetMapping
    public List<Produto>index(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid Produto produto) {
        log.info("cadastrando produto" + produto);
        produtoRepository.save(produto); 
        produto.setConta(contaRepository.findById(produto.getConta().getId()).get());    
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);

    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id) {
        log.info("detalhando produto" + id);
        
        if (id==1) throw new ResponseStatusException(HttpStatus.FORBIDDEN, "não autorizado");

        var produtoEncontrado = produtoRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "produto não encontrado"));

        return ResponseEntity.ok(produtoEncontrado);
      
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Produto> destroy(@PathVariable Long id) {
        log.info("apagando produto" + id);
        var produtoEncontrado = produtoRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao apagar. Produto não encontrado"));

        produtoRepository.delete(produtoEncontrado);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        log.info("atualizando produto" + id);
        produtoRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "produto não encontrado"));

        produto.setId(id);
        produtoRepository.save(produto);
    
        return ResponseEntity.ok(produto);
    }
}