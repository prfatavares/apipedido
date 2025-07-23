package br.com.atavares.apipedido.repository;

import br.com.atavares.apipedido.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> findByNome(String nome);
}
