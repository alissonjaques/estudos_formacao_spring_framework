# Estudos Formação Spring Framework
Repositório contendo os projetos que fiz ao estudar a formação Spring Boot da Alura.

# 1° Projeto: Aplicação que simula um controlador web (como o Spring Framework e VRaptor).

Nesta aplicação tem-se o resultado de um projeto de dois cursos da alura, referentes à servlets, realizados por mim. É uma aplicação que simula a criação de um controlador web, utilizando o protocolo http, filtros, jsp, padrão MVC e padrão Command (cada classe encapsula uma ação). A aplicação foi construída utilizando-se o Tomcat 9.0.60, logo, será necessário ter essa ferramenta e adicionar o projeto nela, para o mesmo funcionar.

# 2° Projeto: Aplicação que representa uma loja virtual, com o CRUD completo de produtos e suas categorias. 

A aplicação utiliza o modelo de camadas MVC e DAO, além de usuar o padrão Factory para gerar objetos que representam conexões, as requisições e transações no banco de dados são controlodas pelo pool de conexões.

# 3° Projeto: Introdução ao JPA com Hibernate 

Todas as dependências dessa aplicação foram gerenciadas pelo Maven. A aplicação foi desenvolvida nos modelos de camadas MVC e DAO. Ela representa o CRUD completo de produtos e suas categorias utilizando JPA (Java Persistente API) tendo o Hibernate como implementação. Fica claro com esse projeto o desacoplamento entre o banco de dados da aplicação e as classes da mesma, além disso temos aqui um código mais limpo, menos verboso e mais dinâmico que facilita a sua leitura e manutenção, o que geralmente é muito complicado em aplicações que utilizam JDBC.
