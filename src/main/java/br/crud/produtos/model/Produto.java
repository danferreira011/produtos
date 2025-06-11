package br.crud.produtos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Define que essa classe é uma entidade JPA (tabela no banco de dados)

@Data // Lombok gera automaticamente getters, setters, toString, equals, hashCode

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; //nome do produto
    private Double preco; // preço do produto
}
