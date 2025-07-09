# 📚 API de Gestão Escolar

Este projeto é uma API REST desenvolvida com **Java 17** e **Spring Boot 3**, que permite gerenciar **alunos**, **cursos** e **matrículas** em uma instituição de ensino. A aplicação foi containerizada com **Docker**, e conta com uma **pipeline CI/CD automatizada com GitHub Actions** e **deploy na nuvem usando o Google Cloud**.

---

## 🚀 Funcionalidades

- ✅ Cadastro, edição, listagem e exclusão de alunos
- ✅ Cadastro, edição, listagem e exclusão de cursos
- ✅ Matrícula de alunos em cursos
- ✅ Listagem de matrículas
- ✅ Integração com banco de dados **Hibernate**
- ✅ Testes via **Swagger UI**
- ✅ Containerização com Docker
- ✅ Pipeline automatizada com GitHub Actions
- ✅ Deploy contínuo no **Google Cloud Run**

---

## 🛠️ Tecnologias e Ferramentas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- Maven
- Docker
- Swagger / SpringDoc OpenAPI
- GitHub Actions (CI/CD)
- Google Cloud Platform (Cloud Run)

---

## 📦 Estrutura do Projeto

```bash
escola/
├── src/
│   ├── main/java/com/example/escola/
│   │   ├── controller/
│   │   ├── dto/
│   │   ├── entity/
│   │   ├── repository/
│   │   ├── service/
│   │   └── config/
│   └── resources/
│       └── application.properties
├── pom.xml
├── Dockerfile
└── README.md

## 🧪 Como executar o projeto localmente
- Java 17
- Maven
- Docker (opcional)

## 🐳 Docker
- Criar imagem
bash
docker build -t escola-api .

- Executar container
bash
docker run -p 8080:8080 escola-api

## ⚙️ CI/CD com GitHub Actions
A pipeline foi configurada para:
- Build da aplicação
- Criação e push da imagem Docker
- Deploy automático no Google Cloud Run

Essa estrutura foi desenvolvida durante uma imersão da Alura, onde aprendi a:
- Estruturar pipelines eficientes com GitHub Actions
- Aplicar boas práticas de automação
- Escalar aplicações com agilidade usando Docker
- Publicar projetos reais com deploy na nuvem
