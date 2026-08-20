# Clientes API 👥

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)](https://spring.io/projects/spring-boot)

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento completo de cadastro de clientes (CRUD). Este projeto foi desenvolvido como um desafio prático de consolidação de conhecimentos do curso de Java e Spring Boot do instrutor Nélio Alves.

---

## 📌 Funcionalidades

- **CRUD Completo de Clientes:**
  - `GET /clients` — Busca paginada de clientes.
  - `GET /clients/{id}` — Busca de cliente por ID.
  - `POST /clients` — Cadastro de novo cliente com validações de dados.
  - `PUT /clients/{id}` — Atualização de dados de um cliente existente.
  - `DELETE /clients/{id}` — Remoção de cliente por ID.
- **Validação de Dados:** Garantia de integridade das requisições usando Bean Validation (ex: campos obrigatórios, datas no passado, valores não negativos).
- **Tratamento Global de Exceções:** Respostas HTTP padronizadas e descritivas para recursos não encontrados (`404 Not Found`) e erros de validação (`422 Unprocessable Entity`).
- **Mapeamento de Dados (DTO Pattern):** Separação clara entre a camada de domínio (entidades) e a camada de transferência de dados (DTOs).
- **Massa de Dados de Teste:** Carga inicial automatizada via `import.sql` para testes no banco de dados H2 em memória.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 17+
- **Framework Principal:** Spring Boot 3
- **Acesso a Dados / ORM:** Spring Data JPA / Hibernate
- **Banco de Dados:** H2 Database (Ambiente de desenvolvimento e testes em memória)
- **Validação:** Bean Validation (Hibernate Validator)
- **Gerenciador de Dependências:** Maven

---

## 📐 Arquitetura da Aplicação

A API segue o padrão arquitetural em camadas recomendado para aplicações Spring Boot:

- **Controller Layer:** Trata as requisições HTTP, valida os dados de entrada e retorna as respostas adequadas.
- **Service Layer:** Contém as regras de negócio, controle transacional e conversão entre Entidades e DTOs.
- **Repository Layer:** Interface responsável pela comunicação direta com o banco de dados via Spring Data JPA.
- **Database (H2):** Banco de dados relacional em memória para desenvolvimento e testes rápidos.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Java JDK 17** ou superior instalado.
- **Git** instalado.

### Passo a Passo

1. **Clonar o repositório:**
   git clone https://github.com/fabriciobzrr/clientes-api.git
   cd clientes-api

2. **Executar a aplicação via Maven Wrapper:**
   - Linux/macOS: `./mvnw spring-boot:run`
   - Windows (CMD/PowerShell): `mvnw spring-boot:run`

3. **Acessar a aplicação:**
   A API estará disponível em `http://localhost:8080`.

4. **Acessar o Console do Banco de Dados H2:**
   - **URL:** `http://localhost:8080/h2-console`
   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **User:** `sa`
   - **Password:** *(deixe em branco)*

---

## 🌐 Endpoints da API

| Método | Endpoint | Descrição | Status de Sucesso |
| :--- | :--- | :--- | :--- |
| `GET` | `/clients` | Retorna lista paginada de clientes | `200 OK` |
| `GET` | `/clients/{id}` | Retorna um cliente específico por ID | `200 OK` |
| `POST` | `/clients` | Cria um novo cliente | `201 Created` |
| `PUT` | `/clients/{id}` | Atualiza um cliente existente por ID | `200 OK` |
| `DELETE` | `/clients/{id}` | Deleta um cliente por ID | `204 No Content` |

### Exemplo de JSON (POST / PUT)

`{ "name": "Maria Silva", "cpf": "12345678901", "income": 4500.00, "birthDate": "1995-04-12", "children": 2 }`

---

## ✍️ Autor

Desenvolvido por **Fabricio Bezerra**  
- **GitHub:** [github.com/fabriciobzrr](https://github.com/fabriciobzrr)  
- **LinkedIn:** [linkedin.com/in/fabriciobzrr](https://www.linkedin.com/in/fabriciobzrr/)