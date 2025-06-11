package br.crud.produtos.controller;

import br.crud.produtos.model.Produto;
import br.crud.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController // Indica que esta classe é um controlador REST

@RequestMapping("/api/produtos") // Define o prefixo das rotas (ex: /api/produtos)

@CrossOrigin(origins = "*") // Permite que o front-end faça requisições de qualquer origem
public class ProdutoController {

    @Autowired
    private ProdutoService service;

      // GET /api/produtos → retorna todos os produtos
    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

    // POST /api/produtos → cadastra um novo produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

     // PUT /api/produtos/{id} → atualiza os dados de um produto existente
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        Produto produto = service.buscarPorId(id).orElseThrow();
        produto.setNome(produtoAtualizado.getNome());
        produto.setPreco(produtoAtualizado.getPreco());
        return service.salvar(produto);
    }

    // DELETE /api/produtos/{id} → deleta um produto pelo ID
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
