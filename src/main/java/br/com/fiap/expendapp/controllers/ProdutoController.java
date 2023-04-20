package br.com.fiap.expendapp.controllers;

import java.util.List;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.expendapp.models.Produto;
import br.com.fiap.expendapp.repository.ContaRepository;
import br.com.fiap.expendapp.repository.ProdutoRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api/produto")
@Slf4j
public class ProdutoController {
    
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ContaRepository contaRepository;

    @GetMapping
    public Page<Produto>index(@RequestParam(required = false) String busca, @PageableDefault(size = 5) Pageable pageable){
        //Pageable pageable = Pageable.ofSize(tamanho).withPage(pagina);
        if (busca == null) 
            return produtoRepository.findAll(pageable);
        return produtoRepository.findByProdutoContaining(busca, pageable);
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