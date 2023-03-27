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

import br.com.fiap.expendapp.models.Usuario;
import br.com.fiap.expendapp.repository.UsuarioRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/cadastro")
public class UsuarioController {
    
    Logger log = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    UsuarioRepository repository;

    @GetMapping
    public List<Usuario>index(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid Usuario usuario) {
        log.info("cadastrando usuario" + usuario);
        repository.save(usuario);     
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }

    @GetMapping("{id}")
    public ResponseEntity<Usuario> show(@PathVariable Long id) {
        log.info("detalhando usuario" + id);
        
        if (id==1) throw new ResponseStatusException(HttpStatus.FORBIDDEN, "não autorizado");

        var usuarioEncontrado = repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "usuario não encontrado"));

        return ResponseEntity.ok(usuarioEncontrado);
      
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Usuario> destroy(@PathVariable Long id) {
        log.info("apagando usuario" + id);
        var usuarioEncontrado = repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao apagar. Usuario não encontrado"));

        repository.delete(usuarioEncontrado);

        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuario) {
        log.info("atualizando usuario" + id);
        repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "usuario não encontrado"));

        usuario.setId(id);
        repository.save(usuario);
    
        return ResponseEntity.ok(usuario);
    }
}
