🏬 Sistema de Gestão de Estoque em Java
Este é um projeto simples de sistema de gestão de estoque, desenvolvido em Java. Ele simula as operações básicas de uma loja, como adicionar produtos, buscar itens por categoria ou ID e verificar o status do estoque.

O objetivo principal deste projeto foi aplicar conceitos de Programação Orientada a Objetos (POO) e recursos modernos do Java para criar um código limpo, seguro e de fácil manutenção.

💻 Funcionalidades
Adicionar Produtos: Permite incluir novos produtos no estoque da loja, com detalhes como nome, ID, preço, categoria e status.

Buscar por Categoria: Filtra e retorna todos os produtos de uma categoria específica (ex: SMARTPHONE, NOTEBOOK).

Buscar por ID: Encontra um produto individualmente a partir do seu número de identificação único.

Gerenciar Status: Define o status de um produto como DISPONIVEL ou INDISPONIVEL.

🚀 Tecnologias e Conceitos Utilizados
Java: Linguagem de programação principal.

Programação Orientada a Objetos (POO): O projeto é estruturado em classes como Loja e Produto e usa enums para representar categorias e status.

Java Streams: Utilizado para implementar a lógica de busca e filtragem de produtos de forma funcional e eficiente.

Optional: Essencial para lidar de forma segura com valores que podem não existir (como o resultado de uma busca por ID), evitando o temido NullPointerException.

Coleções (List e ArrayList): Usadas para armazenar e manipular os produtos em estoque.

⚙️ Como Executar o Projeto
Clone o repositório:

Bash

git clone [https://github.com/ArnaldoFelipe/Sistema-de-Gest-o-de-Estoque-em-Java]
Abra na sua IDE:
Importe o projeto para sua IDE de preferência (IntelliJ, Eclipse, VS Code).

Execute o Main:
Execute o método main na classe SistemaEstoque.Main. A saída do console mostrará os resultados dos testes dos métodos.

🧠 O que Aprendi
Este projeto foi uma oportunidade de aprofundar meus conhecimentos em:

Segurança do Código: Entendendo a importância de usar a classe Optional para escrever um código mais robusto e à prova de erros.

Programação Funcional em Java: Utilizando a API de Streams para escrever lógicas de coleção de forma mais concisa e legível.

Design de Código: Reforçando os princípios de POO ao organizar a aplicação com responsabilidades bem definidas para cada classe.
