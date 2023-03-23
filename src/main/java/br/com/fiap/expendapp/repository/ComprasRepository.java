package br.com.fiap.expendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.expendapp.models.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Long> {

}