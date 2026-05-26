# biblioteca-java-poo

Projeto final da disciplina de Programação Orientada a Objetos.

## 1. Visão geral do projeto

Este repositório contém o desenvolvimento de um sistema simples em Java com interface baseada em linha de comando.

O tema escolhido pelo grupo foi:

**Sistema de Gestão de Acervo e Empréstimos de Biblioteca**

A proposta do projeto é representar, de forma acadêmica e funcional, uma rotina básica de biblioteca, permitindo o gerenciamento de livros, leitores e empréstimos por meio de menus exibidos no terminal.

O sistema foi pensado para ser:

- simples de entender;
- organizado em responsabilidades;
- compatível com o conteúdo estudado em aula;
- fácil de evoluir em grupo.

## 2. Contexto do trabalho

O trabalho prático foi proposto com o objetivo de aplicar, em um projeto real de pequena escala, os conceitos fundamentais da disciplina.

Entre os principais pontos esperados no desenvolvimento estão:

- uso da linguagem Java;
- aplicação de Programação Orientada a Objetos;
- criação de módulos com CRUD;
- organização do código em classes;
- interação do usuário por interface CLI.

Mais do que apenas exibir menus, o sistema precisa demonstrar estrutura, separação de responsabilidades e coerência entre os módulos que compõem o projeto.

## 3. Objetivo acadêmico

Do ponto de vista da disciplina, este projeto tem como objetivo consolidar a prática de:

- classes e objetos;
- atributos e métodos;
- encapsulamento;
- abstração;
- herança, quando aplicável;
- polimorfismo, quando aplicável;
- modularização do código;
- navegação por menus;
- leitura de dados com `Scanner`.

Assim, o sistema funciona não apenas como um programa executável, mas também como um exercício de modelagem e organização de software em Java.

## 4. Objetivo do sistema

O sistema tem como finalidade controlar três áreas principais de uma biblioteca:

- cadastro e consulta de livros;
- cadastro e consulta de leitores;
- controle de empréstimos e devoluções.

Na versão final, o sistema deve permitir:

- cadastrar registros;
- listar registros;
- buscar registros;
- atualizar registros;
- excluir registros.

No caso do módulo de empréstimos, também se espera:

- registrar um empréstimo;
- renovar um empréstimo;
- registrar devolução;
- listar empréstimos ativos.

## 5. Tema escolhido

O tema biblioteca foi escolhido porque oferece uma estrutura clara de relacionamento entre entidades e permite aplicar os requisitos da disciplina de forma natural.

Dentro desse contexto:

- um `Livro` representa um item do acervo;
- um `Leitor` representa a pessoa que utiliza o sistema;
- um `Emprestimo` representa a relação entre livro e leitor em uma operação de retirada.

Isso permite ao grupo trabalhar com módulos bem definidos e, ao mesmo tempo, conectados entre si.

## 6. Estrutura atual do repositório

Atualmente, o repositório possui uma estrutura simples, para facilitar o entendimento, a apresentação do trabalho e a integração entre os integrantes.

```text
biblioteca-java-poo/
|-- docs/
|   `-- README.md
|-- src/
|   |-- Main.java
|   |-- Emprestimo.java
|   |-- EmprestimoController.java
|   |-- LeitorController.java
|   |-- Leitor.java
|   |-- LivroController.java
|   |-- Livro.java
|-- .gitignore
`-- README.md
```

## 7. Explicação da estrutura

### `src/Main.java`

É o arquivo principal do sistema.

Nele estão concentradas, no momento, as responsabilidades de:

- iniciar o programa;
- criar o menu principal;
- criar os submenus;
- controlar a navegação no terminal;
- ler as opções informadas pelo usuário;
- chamar os métodos responsáveis por cada módulo.

Os controllers dos módulos já foram separados em arquivos próprios.

### `src/Leitor.java`

Representa o leitor da biblioteca.

Esse arquivo já foi integrado ao projeto e contém:

- id do leitor;
- nome do leitor;
- e-mail do leitor;
- getters e setters;
- método `toString()`.

### `src/LeitorController.java`

Controla o CRUD de leitores.

Esse arquivo já foi integrado ao projeto e contém:

- cadastro de leitor;
- listagem de leitores;
- busca por id;
- atualização de leitor;
- exclusão de leitor.

### `src/Emprestimo.java`

Representa um empréstimo no sistema.

Esse arquivo já foi integrado ao projeto e contém:

- livro relacionado ao empréstimo;
- leitor relacionado ao empréstimo;
- data do empréstimo;
- data prevista de devolução;
- status ativo ou devolvido;
- método para renovar prazo;
- método para registrar devolução.

### `src/EmprestimoController.java`

Controla as chamadas do menu de empréstimos.

Ele usa os livros e leitores cadastrados no sistema para registrar empréstimos.

### `src/Livro.java`

Representa o livro da biblioteca.

Esse arquivo contém:

- título do livro;
- status de disponibilidade;
- getters e setters.

### `src/LivroController.java`

Controla o CRUD de livros.

Esse arquivo já foi integrado ao projeto e contém:

- cadastro de livro;
- listagem de livros;
- busca por título;
- atualização de título;
- exclusão de livro.

### `docs/`

Esta pasta foi reservada para os materiais de apoio do trabalho.

Ela pode armazenar:

- roteiro da apresentação;
- observações do grupo;
- estrutura da fala;
- arquivo final do PowerPoint.

### `README.md`

Este arquivo tem duas funções principais:

- documentar o projeto para leitura geral;
- orientar tecnicamente o grupo sobre a divisão e a continuidade do desenvolvimento.

## 8. Estado atual do projeto

No estado atual, o projeto já possui a estrutura principal montada.

Isso significa que:

- o menu principal já foi criado;
- os submenus já foram organizados;
- a navegação por opções numéricas já foi implementada;
- a leitura de entradas já foi tratada;
- as chamadas dos módulos já foram definidas;
- a classe `Livro` já foi integrada;
- o `LivroController` já está separado em arquivo próprio;
- a classe `Leitor` já foi integrada;
- o `LeitorController` já está separado em arquivo próprio;
- a classe `Emprestimo` já foi integrada;
- o `EmprestimoController` já está separado em arquivo próprio.

Os três módulos principais já possuem arquivos integrados ao menu.

## 9. Divisão do grupo

Para facilitar a produção do sistema e evitar sobrecarga em uma única pessoa, o trabalho foi dividido em 5 partes.

### Pessoa 1 - Estrutura principal e menu CLI

Responsabilidades:

- criar a classe `Main`;
- montar o menu principal;
- montar os submenus;
- controlar a navegação por opções numéricas;
- organizar a execução geral do sistema;
- integrar as chamadas para os módulos.

Resumo da função:

Essa parte é responsável por garantir que o sistema tenha uma base funcional de interação com o usuário, permitindo que os outros módulos sejam conectados.

### Pessoa 2 - Módulo Livro

Responsabilidades:

- criar a classe `Livro`;
- definir atributos, construtor, getters e setters;
- implementar o CRUD de livros;
- controlar o status do livro, como disponível ou emprestado.

Resumo da função:

Essa parte cuida do acervo da biblioteca, ou seja, dos livros cadastrados no sistema.

Status atual:

- a classe `Livro` já foi adicionada;
- o `LivroController` já foi separado;
- o fluxo do menu de livros já chama esse controller;
- o CRUD de livros já funciona em memória.

### Pessoa 3 - Módulo Leitor

Responsabilidades:

- criar a classe `Leitor`;
- definir atributos, construtor, getters e setters;
- implementar o CRUD de leitores.

Resumo da função:

Essa parte cuida dos usuários da biblioteca que podem realizar empréstimos.

Status atual:

- a classe `Leitor` já foi adicionada;
- o `LeitorController` já foi separado;
- o fluxo do menu de leitores já chama esse controller;
- o CRUD de leitores já funciona em memória.

### Pessoa 4 - Módulo Empréstimo

Responsabilidades:

- criar a classe `Emprestimo`;
- relacionar livro, leitor e data;
- implementar o CRUD de empréstimos;
- registrar devolução;
- renovar prazo;
- listar empréstimos ativos.

Resumo da função:

Essa parte conecta os demais módulos e representa a operação principal do sistema.

Status atual:

- a classe `Emprestimo` já foi adicionada;
- o `EmprestimoController` já foi separado;
- o fluxo do menu de empréstimos já chama esse controller;
- o fluxo de empréstimos já utiliza livros e leitores cadastrados.

### Pessoa 5 - Revisão, padronização, POO e apresentação

Responsabilidades:

- revisar o código completo;
- padronizar nomes de classes, métodos e variáveis;
- verificar a coerência entre os módulos;
- conferir a aplicação dos conceitos de POO;
- montar a apresentação;
- organizar a demonstração final.

Resumo da função:

Essa parte ajuda a dar unidade ao projeto e melhora a qualidade final antes da entrega.

## 10. Como o sistema foi pensado

O funcionamento geral do sistema foi planejado de forma simples:

1. o programa é iniciado pelo `Main`;
2. o menu principal é exibido;
3. o usuário escolhe o módulo desejado;
4. o sistema abre o submenu correspondente;
5. o `Main` chama o método do controller ligado à opção escolhida;
6. o controller executa a operação do módulo.

Esse fluxo foi definido para deixar o sistema fácil de compreender e também para evitar concentrar toda a lógica em um único bloco de código.

## 11. Fluxo de integração entre as partes

Na integração atual:

1. o `Main.java` chama os controllers;
2. os controllers executam as operações de cada módulo;
3. as classes de modelo representam os dados do sistema;
4. o resultado das operações é mostrado no terminal.

Exemplo:

1. usuário escolhe `1 - Gerenciar Livros`;
2. usuário escolhe `1 - Cadastrar livro`;
3. o `Main` chama `livroController.cadastrarLivro();`;
4. o controller executa o cadastro;
5. a resposta é exibida para o usuário.

## 12. Padrão de métodos definido no Main

Para que o grupo trabalhe com compatibilidade, o `Main.java` define os nomes dos métodos que devem existir nos controllers.

### Métodos esperados em `LivroController`

- `cadastrarLivro()`;
- `listarLivros()`;
- `buscarLivro()`;
- `atualizarLivro()`;
- `excluirLivro()`.

### Métodos esperados em `LeitorController`

- `cadastrarLeitor()`;
- `listarLeitores()`;
- `buscarLeitor()`;
- `atualizarLeitor()`;
- `excluirLeitor()`.

### Métodos esperados em `EmprestimoController`

- `registrarEmprestimo()`;
- `listarEmprestimos()`;
- `renovarEmprestimo()`;
- `registrarDevolucao()`;
- `listarEmprestimosAtivos()`.

Esses nomes devem ser mantidos para evitar erro de integração entre o menu e os módulos.

## 13. Situação dos arquivos principais

Os principais arquivos do sistema já estão presentes:

- `Livro.java`;
- `LivroController.java`;
- `Leitor.java`;
- `LeitorController.java`;
- `Emprestimo.java`;
- `EmprestimoController.java`;
- `Main.java`.

Ainda podem ocorrer ajustes finais de apresentação e padronização, mas os principais arquivos do sistema já estão integrados.

## 14. O que cada módulo representa

### Livro

Pode conter informações como:

- código;
- título;
- autor;
- ano;
- disponibilidade.

### Leitor

Pode conter informações como:

- código;
- nome;
- matrícula ou CPF;
- telefone.

### Empréstimo

Pode conter informações como:

- código do empréstimo;
- livro relacionado;
- leitor relacionado;
- data do empréstimo;
- data prevista de devolução;
- status do empréstimo.

## 15. Decisão de simplicidade da estrutura atual

Mesmo sendo possível criar uma estrutura com vários arquivos e pastas desde o início, o repositório foi mantido com uma organização simples.

Essa decisão foi tomada para:

- evitar confusão para integrantes iniciantes;
- facilitar a leitura do professor;
- permitir uma versão funcional do menu;
- reduzir erros de organização antes da integração final.

Assim, a estrutura atual privilegia clareza e compreensão, sem impedir a evolução posterior do projeto.

## 16. Tecnologias e abordagem utilizada

O projeto foi planejado com base em uma abordagem propositalmente simples, sem o uso de frameworks ou banco de dados.

Foram adotados:

- Java puro;
- `Scanner` para entrada de dados;
- `switch-case` para navegação dos menus;
- métodos separados para cada responsabilidade;
- interface em terminal.

Essa escolha foi feita para manter o trabalho alinhado com o escopo acadêmico da disciplina.

## 17. Como executar

Para compilar e executar a versão atual do sistema, utilize:

```bash
javac src/*.java
java -cp src Main
```

## 18. Entrega final esperada

Ao final do desenvolvimento, o grupo deverá entregar:

- código-fonte completo do sistema;
- apresentação em PowerPoint.

## 19. Considerações finais

Este repositório foi organizado para servir a dois objetivos ao mesmo tempo:

1. apresentar ao professor uma visão clara do projeto, do tema escolhido e da divisão das responsabilidades;
2. orientar o grupo no desenvolvimento das próximas etapas do sistema.

Portanto, a proposta atual do projeto é manter uma base simples, funcional e bem documentada, permitindo que o trabalho evolua de forma organizada até a versão final.
