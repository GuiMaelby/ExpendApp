package br.com.fiap.expendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.expendapp.models.Conta;

public interface ContaRepository extends JpaRepository <Conta, Long> {
 
    
}
