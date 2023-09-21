package br.com.fiap.expendapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.expendapp.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    //@Query("SELECT p FROM Produto p WHERE p.produto LIKE %?1% ") //JPQL
    Page<Produto> findByProdutoContaining(String busca, Pageable pageable);

    //@Query("SELECT p FROM Produto p ORDER BY p.id LIMIT ?1 OFFSET ?2")
    //List<Produto> buscarPaginado(int tamanho, int offset);

    
}
