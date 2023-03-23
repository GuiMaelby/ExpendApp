package br.com.fiap.expendapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.expendapp.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}