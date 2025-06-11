package br.crud.produtos.service;

import br.crud.produtos.model.Produto;
import br.crud.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marca a classe como componente de serviço do Spring

public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

     // Salva ou atualiza um produto no banco
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

     // Retorna todos os produtos cadastrados

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    // Busca um produto pelo ID
    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Remove um produto pelo ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
