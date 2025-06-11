package br.crud.produtos.repository;

import br.crud.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que fornece métodos prontos para CRUD com JPA

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    // Não é necessário implementar nada, o Spring Data JPA cuida disso
}
