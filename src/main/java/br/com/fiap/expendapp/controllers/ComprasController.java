package br.com.fiap.expendapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.expendapp.models.Compras;
import br.com.fiap.expendapp.repository.ComprasRepository;
import br.com.fiap.expendapp.models.Produto;
import br.com.fiap.expendapp.repository.ProdutoRepository;


@RestController
@RequestMapping("/api/compras")
public class ComprasController {
    
    Logger log = LoggerFactory.getLogger(ComprasController.class);

    @Autowired
    ComprasController repository;

    @GetMapping
    public List<Compras>index(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Compras> create(@RequestBody Compras compras) {
        log.info("cadastrando produto" + compras);
        repository.save(compras);     
        return ResponseEntity.status(HttpStatus.CREATED).body(compras);

    }

    @GetMapping("{id}")
    public ResponseEntity<Compras> show(@PathVariable Long id) {
        log.info("buscar produto" + id);
        var produtoEncontrado = repository.findById(id);
        
        if (produtoEncontrado.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(produtoEncontrado.get());
      
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Produto> destroy(@PathVariable Long id) {
        log.info("apagando produto" + id);
        var produtoEncontrado = repository.findById(id);
        //early return
        if (produtoEncontrado.isEmpty()){  
            return ResponseEntity.notFound().build();
        }

        repository.delete(produtoEncontrado.get());
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto) {
        log.info("atualizando produto" + id);
        var produtoEncontrado = repository.findById(id);
        //early return
        if (produtoEncontrado.isEmpty()){  
            return ResponseEntity.notFound().build();
        }

        produto.setId(id);
        repository.save(produto);
    
        return ResponseEntity.ok(produto);
    }
}