# produtos
Sistema CRUD java 

# 🛒 Sistema de Cadastro de Produtos

Projeto CRUD simples desenvolvido com **Java**, **Spring Boot**, **JPA** e **MySQL**, com front-end em **HTML + JavaScript**. Ideal para portfólio de desenvolvedor back-end.

---

## 🚀 Funcionalidades

- ✅ Cadastro de produtos com nome e preço
- ✅ Listagem de produtos cadastrados
- ✅ Edição de produto existente
- ✅ Exclusão de produto
- ✅ Integração com banco de dados MySQL
- ✅ Consumo da API REST com JavaScript puro (fetch)

---

## 🧰 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- HTML5 + JavaScript (fetch)
- Lombok
- Maven
- Visual Studio Code

---

## 🔧 Como rodar o projeto localmente

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/produtos-springboot-crud.git
cd produtos-springboot-crud

Configure o banco de dados MySQL
Crie o banco no MySQL:

CREATE DATABASE produtosdb;

Atualize o arquivo src/main/resources/application.properties com seu usuário e senha:

spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

Acesse a aplicação
Abra no navegador:

http://localhost:8080/index.html

🖼️ Interface do sistema
Tela simples com formulário de cadastro + tabela de produtos:

Campo: Nome

Campo: Preço

Botão: Cadastrar / Atualizar

Grid com: ID, Nome, Preço, Ações (Editar, Excluir)

📁 Organização do código
model/ → Entidade JPA Produto

repository/ → Interface ProdutoRepository

service/ → Lógica de negócio ProdutoService

controller/ → API REST ProdutoController

resources/static/index.html → Interface HTML + JS

