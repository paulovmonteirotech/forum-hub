# ForumHub - API REST com Spring Boot

## Descrição
O ForumHub é uma API REST desenvolvida com Spring Boot que permite a gestão de tópicos. Os usuários podem criar, visualizar, atualizar e excluir tópicos através da API. A autenticação é realizada com tokens JWT para garantir a segurança das operações.

## Funcionalidades
- Cadastro de novos tópicos
- Listagem de todos os tópicos
- Consulta de tópicos por ID
- Atualização de tópicos existentes
- Exclusão de tópicos

## Tecnologias Utilizadas
- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL 8
- Spring Security com JWT para autenticação

## Configuração

### Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas antes de prosseguir:
- Java JDK 17 ou superior
- Maven 4 ou superior
- MySQL 8 (ou versão compatível)

### Passos para Configuração

1. **Clone o Repositório**
   ```bash
   git clone https://github.com/seu-usuario/forumhub.git
   cd forumhub
Configuração do Banco de Dados

Configure seu banco de dados MySQL local com as credenciais fornecidas.
Crie um banco de dados chamado seu_banco_de_dados.
Configuração do Projeto

Abra o arquivo src/main/resources/application.properties e configure as seguintes propriedades:
properties
Copy code
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/seu_banco_de_dados?useSSL=false&serverTimezone=UTC
spring.datasource.username=PAULO_MONTEIRO
spring.datasource.password=Lara@ivone42
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

jwt.secret=SuaChaveSecretaSuperSegura
jwt.expiration=86400000
Substitua seu_banco_de_dados pelo nome do seu banco de dados e ajuste a chave secreta JWT conforme necessário.
Execução

Compile e execute o projeto usando Maven:
bash
Copy code
mvn spring-boot:run
Teste da API

Use ferramentas como Postman ou Insomnia para enviar requisições para a API nos endpoints fornecidos.
Endpoints da API
Cadastro de Novos Tópicos
POST /topicos
Cria um novo tópico com os dados fornecidos no corpo da requisição.
Listagem de Todos os Tópicos
GET /topicos
Retorna uma lista de todos os tópicos cadastrados.
Consulta de Tópicos por ID
GET /topicos/{id}
Retorna os detalhes de um tópico específico baseado no ID fornecido na URL.
Atualização de Tópicos
PUT /topicos/{id}
Atualiza os dados de um tópico existente com base no ID fornecido na URL e nos dados fornecidos no corpo da requisição.
Exclusão de Tópicos
DELETE /topicos/{id}
Remove um tópico específico com base no ID fornecido na URL.
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto e enviar suas melhorias através de pull requests.
