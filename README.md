# biblioteca-java-poo

Projeto final da disciplina de Programacao Orientada a Objetos.

## 1. Visao geral do projeto

Este repositorio contem o desenvolvimento de um sistema simples em Java com interface baseada em linha de comando.

O tema escolhido pelo grupo foi:

**Sistema de Gestao de Acervo e Emprestimos de Biblioteca**

A proposta do projeto e representar, de forma academica e funcional, uma rotina basica de biblioteca, permitindo o gerenciamento de livros, leitores e emprestimos por meio de menus exibidos no terminal.

O sistema foi pensado para ser:

- simples de entender
- organizado em responsabilidades
- compativel com o conteudo estudado em aula
- facil de evoluir em grupo

## 2. Contexto do trabalho

O trabalho pratico foi proposto com o objetivo de aplicar, em um projeto real de pequena escala, os conceitos fundamentais da disciplina.

Entre os principais pontos esperados no desenvolvimento estao:

- uso da linguagem Java
- aplicacao de Programacao Orientada a Objetos
- criacao de modulos com CRUD
- organizacao do codigo em classes
- interacao do usuario por interface CLI

Mais do que apenas exibir menus, o sistema precisa demonstrar estrutura, separacao de responsabilidades e coerencia entre os modulos que compoem o projeto.

## 3. Objetivo academico

Do ponto de vista da disciplina, este projeto tem como objetivo consolidar a pratica de:

- classes e objetos
- atributos e metodos
- encapsulamento
- abstracao
- heranca, quando aplicavel
- polimorfismo, quando aplicavel
- modularizacao do codigo
- navegacao por menus
- leitura de dados com `Scanner`

Assim, o sistema funciona nao apenas como um programa executavel, mas tambem como um exercicio de modelagem e organizacao de software em Java.

## 4. Objetivo do sistema

O sistema tem como finalidade controlar tres areas principais de uma biblioteca:

- cadastro e consulta de livros
- cadastro e consulta de leitores
- controle de emprestimos e devolucoes

Na versao final, o sistema deve permitir:

- cadastrar registros
- listar registros
- buscar registros
- atualizar registros
- excluir registros

No caso do modulo de emprestimos, tambem se espera:

- registrar um emprestimo
- renovar um emprestimo
- registrar devolucao
- listar emprestimos ativos

## 5. Tema escolhido

O tema biblioteca foi escolhido porque oferece uma estrutura clara de relacionamento entre entidades e permite aplicar os requisitos da disciplina de forma natural.

Dentro desse contexto:

- um `Livro` representa um item do acervo
- um `Leitor` representa a pessoa que utiliza o sistema
- um `Emprestimo` representa a relacao entre livro e leitor em uma operacao de retirada

Isso permite ao grupo trabalhar com modulos bem definidos e, ao mesmo tempo, conectados entre si.

## 6. Estrutura atual do repositorio

Atualmente, o repositorio foi mantido em uma estrutura inicial simples, para facilitar o entendimento, a apresentacao parcial do trabalho e a integracao entre os integrantes.

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
|   |-- Livro.java
|-- .gitignore
`-- README.md
```

## 7. Explicacao da estrutura

### `src/Main.java`

E o arquivo principal do sistema.

Nele estao concentradas, no momento, as responsabilidades de:

- iniciar o programa
- criar o menu principal
- criar os submenus
- controlar a navegacao no terminal
- ler as opcoes informadas pelo usuario
- chamar os metodos responsaveis por cada modulo

Tambem existe, neste momento, uma classe temporaria de controller dentro do mesmo arquivo.

Ainda existe, dentro do `Main.java`, o controller temporario de Livro.

Essas classes temporarias existem somente para:

- permitir a compilacao do projeto
- demonstrar o fluxo de navegacao
- testar a estrutura do menu
- manter o repositorio simples nesta fase inicial

Os controllers de Leitor e Emprestimo ja foram separados em arquivos proprios.

### `src/Leitor.java`

Representa o leitor da biblioteca.

Esse arquivo ja foi integrado ao projeto e contem:

- id do leitor
- nome do leitor
- email do leitor
- getters e setters
- metodo `toString()`

### `src/LeitorController.java`

Controla o CRUD de leitores.

Esse arquivo ja foi integrado ao projeto e contem:

- cadastro de leitor
- listagem de leitores
- busca por id
- atualizacao de leitor
- exclusao de leitor

### `src/Emprestimo.java`

Representa um emprestimo no sistema.

Esse arquivo ja foi integrado ao projeto e contem:

- livro relacionado ao emprestimo
- leitor relacionado ao emprestimo
- data do emprestimo
- data prevista de devolucao
- status ativo ou devolvido
- metodo para renovar prazo
- metodo para registrar devolucao

### `src/EmprestimoController.java`

Controla as chamadas do menu de emprestimos.

No momento, ele usa dados simples de exemplo para permitir que o fluxo funcione enquanto os modulos de Livro e Leitor ainda nao estao completos.

### `src/Livro.java`

Esse arquivo ainda existe de forma simples e temporaria para apoiar a parte de Emprestimo.

Ele sera ajustado depois pelo integrante responsavel pelo modulo de Livro.

### `docs/`

Esta pasta foi reservada para os materiais de apoio do trabalho.

Ela pode armazenar:

- roteiro da apresentacao
- observacoes do grupo
- estrutura da fala
- arquivo final do PowerPoint

### `README.md`

Este arquivo tem duas funcoes principais:

- documentar o projeto para leitura geral
- orientar tecnicamente o grupo sobre a divisao e a continuidade do desenvolvimento

## 8. Estado atual do projeto

No estado atual, o projeto ja possui a parte inicial da estrutura principal montada.

Isso significa que:

- o menu principal ja foi criado
- os submenus ja foram organizados
- a navegacao por opcoes numericas ja foi implementada
- a leitura de entradas ja foi tratada
- as chamadas dos modulos ja foram definidas
- a classe `Leitor` ja foi integrada
- o `LeitorController` ja esta separado em arquivo proprio
- a classe `Emprestimo` ja foi integrada
- o `EmprestimoController` ja esta separado em arquivo proprio

Por outro lado, o modulo final de Livro ainda sera implementado nas proximas etapas pelo integrante responsavel.

O modulo de Emprestimo ja tem uma primeira versao integrada, mas ainda podera ser evoluido quando Livro estiver completo.

## 9. Divisao do grupo

Para facilitar a producao do sistema e evitar sobrecarga em uma unica pessoa, o trabalho foi dividido em 5 partes.

### Pessoa 1 - Estrutura principal e menu CLI

Responsabilidades:

- criar a classe `Main`
- montar o menu principal
- montar os submenus
- controlar a navegacao por opcoes numericas
- organizar a execucao geral do sistema
- integrar as chamadas para os modulos

Resumo da funcao:

Essa parte e responsavel por garantir que o sistema tenha uma base funcional de interacao com o usuario, permitindo que os outros modulos sejam conectados depois.

### Pessoa 2 - Modulo Livro

Responsabilidades:

- criar a classe `Livro`
- definir atributos, construtor, getters e setters
- implementar o CRUD de livros
- controlar o status do livro, como disponivel ou emprestado

Resumo da funcao:

Essa parte cuida do acervo da biblioteca, ou seja, dos livros cadastrados no sistema.

### Pessoa 3 - Modulo Leitor

Responsabilidades:

- criar a classe `Leitor`
- definir atributos, construtor, getters e setters
- implementar o CRUD de leitores

Resumo da funcao:

Essa parte cuida dos usuarios da biblioteca que podem realizar emprestimos.

Status atual:

- a classe `Leitor` ja foi adicionada
- o `LeitorController` ja foi separado
- o fluxo do menu de leitores ja chama esse controller
- o CRUD de leitores ja funciona em memoria

### Pessoa 4 - Modulo Emprestimo

Responsabilidades:

- criar a classe `Emprestimo`
- relacionar livro, leitor e data
- implementar o CRUD de emprestimos
- registrar devolucao
- renovar prazo
- listar emprestimos ativos

Resumo da funcao:

Essa parte conecta os demais modulos e representa a operacao principal do sistema.

Status atual:

- a classe `Emprestimo` ja foi adicionada
- o `EmprestimoController` ja foi separado
- o fluxo do menu de emprestimos ja chama esse controller
- a integracao ainda usa `Livro` simples enquanto o modulo real de livros nao fica pronto

### Pessoa 5 - Revisao, padronizacao, POO e apresentacao

Responsabilidades:

- revisar o codigo completo
- padronizar nomes de classes, metodos e variaveis
- verificar a coerencia entre os modulos
- conferir a aplicacao dos conceitos de POO
- montar a apresentacao
- organizar a demonstracao final

Resumo da funcao:

Essa parte ajuda a dar unidade ao projeto e melhora a qualidade final antes da entrega.

## 10. Como o sistema foi pensado

O funcionamento geral do sistema foi planejado de forma simples:

1. o programa e iniciado pelo `Main`
2. o menu principal e exibido
3. o usuario escolhe o modulo desejado
4. o sistema abre o submenu correspondente
5. o `Main` chama o metodo do controller ligado a opcao escolhida
6. o controller executa a operacao do modulo

Esse fluxo foi definido para deixar o sistema facil de compreender e tambem para evitar concentrar toda a logica em um unico bloco de codigo.

## 11. Fluxo de integracao entre as partes

Quando os colegas concluirem seus modulos, a integracao esperada sera:

1. o `Main.java` chamara os controllers reais
2. os controllers executarao as operacoes de cada modulo
3. as classes de modelo representarao os dados do sistema
4. o resultado das operacoes sera mostrado no terminal

Exemplo esperado:

1. usuario escolhe `1 - Gerenciar Livros`
2. usuario escolhe `1 - Cadastrar livro`
3. o `Main` chama `livroController.cadastrarLivro();`
4. o controller executa o cadastro
5. a resposta e exibida para o usuario

## 12. Padrao de metodos ja definido no Main

Para que o grupo trabalhe com compatibilidade, o `Main.java` ja define os nomes dos metodos que deverao existir nos controllers.

### Metodos esperados em `LivroController`

- `cadastrarLivro()`
- `listarLivros()`
- `buscarLivro()`
- `atualizarLivro()`
- `excluirLivro()`

### Metodos esperados em `LeitorController`

- `cadastrarLeitor()`
- `listarLeitores()`
- `buscarLeitor()`
- `atualizarLeitor()`
- `excluirLeitor()`

### Metodos esperados em `EmprestimoController`

- `registrarEmprestimo()`
- `listarEmprestimos()`
- `renovarEmprestimo()`
- `registrarDevolucao()`
- `listarEmprestimosAtivos()`

Esses nomes devem ser mantidos para evitar erro de integracao entre o menu e os modulos.

## 13. Arquivos previstos para as proximas etapas

Nas proximas fases do projeto, ainda deverao ser criados ou finalizados:

- `Livro.java`
- `LivroController.java`

Os arquivos `Leitor.java`, `LeitorController.java`, `Emprestimo.java` e `EmprestimoController.java` ja existem, mas podem receber ajustes de integracao final caso o grupo combine.

## 14. O que cada modulo deve representar

### Livro

Pode conter informacoes como:

- codigo
- titulo
- autor
- ano
- disponibilidade

### Leitor

Pode conter informacoes como:

- codigo
- nome
- matricula ou cpf
- telefone

### Emprestimo

Pode conter informacoes como:

- codigo do emprestimo
- livro relacionado
- leitor relacionado
- data do emprestimo
- data prevista de devolucao
- status do emprestimo

## 15. Decisao de simplicidade da estrutura atual

Mesmo sendo possivel criar uma estrutura com varios arquivos e pastas desde o inicio, nesta fase o repositorio foi mantido com uma organizacao mais simples.

Essa decisao foi tomada para:

- evitar confusao para integrantes iniciantes
- facilitar a leitura do professor
- permitir uma primeira versao funcional do menu
- reduzir erros de organizacao antes da etapa de integracao final

Assim, a estrutura atual privilegia clareza e compreensao, sem impedir a evolucao posterior do projeto.

## 16. Tecnologias e abordagem utilizada

O projeto foi planejado com base em uma abordagem propositalmente simples, sem o uso de frameworks ou banco de dados.

Foram adotados:

- Java puro
- `Scanner` para entrada de dados
- `switch-case` para navegacao dos menus
- metodos separados para cada responsabilidade
- interface em terminal

Essa escolha foi feita para manter o trabalho alinhado com o escopo academico da disciplina.

## 17. Como executar

Para compilar e executar a versao atual do sistema, utilize:

```bash
javac src/*.java
java -cp src Main
```

## 18. Entrega final esperada

Ao final do desenvolvimento, o grupo devera entregar:

- codigo-fonte completo do sistema
- apresentacao em PowerPoint

## 19. Consideracoes finais

Este repositorio foi organizado para servir a dois objetivos ao mesmo tempo:

1. apresentar ao professor uma visao clara do projeto, do tema escolhido e da divisao das responsabilidades
2. orientar o grupo no desenvolvimento das proximas etapas do sistema

Portanto, a proposta atual do projeto e manter uma base simples, funcional e bem documentada, permitindo que o trabalho evolua de forma organizada ate a versao final.
