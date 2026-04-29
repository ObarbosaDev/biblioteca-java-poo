# biblioteca-java-poo

Projeto final da materia de Programacao Orientada a Objetos.

## Visao geral

Este projeto tem como objetivo desenvolver um sistema simples em Java usando Programacao Orientada a Objetos e interface CLI.

O tema escolhido pelo grupo foi:

**Sistema de Gestao de Acervo e Emprestimos de Biblioteca**

O sistema sera executado no terminal e deve permitir ao usuario navegar por menus numericos para gerenciar os principais modulos da biblioteca.

## Objetivo do trabalho

O trabalho foi pensado para praticar:

- organizacao de codigo em Java
- uso de classes e objetos
- separacao de responsabilidades
- estrutura de menu em terminal
- operacoes de CRUD
- aplicacao dos conceitos de POO

Na pratica, o sistema deve permitir o gerenciamento de:

- livros
- leitores
- emprestimos

Cada modulo deve ter operacoes de cadastro, listagem, busca, atualizacao e exclusao, quando aplicavel.

## Objetivo tecnico do projeto

No lado tecnico, o projeto foi dividido para ficar simples, funcional e compativel com o conteudo visto em aula.

A ideia nao e criar um sistema empresarial complexo.

A ideia e criar um sistema academico organizado, com:

- Java puro
- entrada de dados com `Scanner`
- menus com `switch-case`
- classes separadas por responsabilidade
- interacao pelo terminal
- dados em memoria

## Tema escolhido

O grupo escolheu o tema biblioteca porque ele permite trabalhar bem com 3 modulos principais:

- `Livro`
- `Leitor`
- `Emprestimo`

Esses modulos se relacionam de forma natural:

- um livro pode estar disponivel ou emprestado
- um leitor pode pegar livros emprestados
- um emprestimo relaciona um livro com um leitor

## Estrutura do projeto

```text
biblioteca-java-poo/
|-- docs/
|-- src/
|   `-- Main.java
`-- README.md
```

## Explicacao da estrutura

### `src/Main.java`

E o ponto de entrada do sistema.

Essa classe deve:

- iniciar o programa
- mostrar o menu principal
- mostrar os submenus
- ler as opcoes digitadas
- tratar opcoes invalidas
- chamar os metodos dos controllers

O `Main` nao deve concentrar a regra completa de livros, leitores e emprestimos.

Ele deve funcionar como organizador da navegacao.

### `docs/`

Pasta reservada para materiais do trabalho.

Pode guardar:

- roteiro da apresentacao
- observacoes do grupo
- topicos para a fala
- versao final do PowerPoint

## Divisao do grupo

O trabalho foi dividido entre 5 integrantes para separar as responsabilidades e facilitar a integracao final.

### Pessoa 1 - Estrutura principal e menu CLI

Responsabilidades:

- criar a classe `Main`
- montar o menu principal
- montar os submenus
- fazer a navegacao com opcoes numericas
- controlar a execucao geral do sistema
- integrar as chamadas para os controllers

Arquivos ligados a essa parte:

- `src/Main.java`

Resumo:

A Pessoa 1 cuida da estrutura principal do sistema. Ela nao precisa implementar toda a logica interna dos modulos, mas precisa deixar a navegacao funcionando para o restante do grupo conectar suas partes.

### Pessoa 2 - Modulo Livro

Responsabilidades:

- criar a classe `Livro`
- definir atributos, construtor, getters e setters
- implementar o CRUD de livros
- controlar status do livro, como disponivel ou emprestado

Arquivos ligados a essa parte:

- `Livro.java`
- `LivroController.java`

Resumo:

A Pessoa 2 cuida de tudo que estiver ligado ao modulo de livros.

### Pessoa 3 - Modulo Leitor

Responsabilidades:

- criar a classe `Leitor`
- definir atributos, construtor, getters e setters
- implementar o CRUD de leitores

Arquivos ligados a essa parte:

- `Leitor.java`
- `LeitorController.java`

Resumo:

A Pessoa 3 cuida de tudo que estiver ligado ao modulo de leitores.

### Pessoa 4 - Modulo Emprestimo

Responsabilidades:

- criar a classe `Emprestimo`
- relacionar livro, leitor e data
- implementar o CRUD de emprestimos
- registrar devolucao
- renovar prazo
- listar emprestimos ativos
- atualizar o status do livro ao emprestar e devolver

Arquivos ligados a essa parte:

- `Emprestimo.java`
- `EmprestimoController.java`

Resumo:

A Pessoa 4 cuida do modulo que liga os outros dois principais, por isso essa parte depende de alinhamento com Livro e Leitor.

### Pessoa 5 - Organizacao, POO e apresentacao

Responsabilidades:

- revisar o codigo inteiro
- padronizar nomes de classes, metodos e variaveis
- conferir o uso de POO
- ajudar na organizacao final do projeto
- montar a apresentacao
- preparar a fala do grupo

Arquivos ligados a essa parte:

- revisao geral de `src/`
- materiais em `docs/`

Resumo:

A Pessoa 5 faz a costura final do trabalho, ajudando a deixar tudo consistente antes da entrega.

## Como as partes se conectam

Para o projeto funcionar sem retrabalho, o grupo precisa seguir a mesma estrutura.

Fluxo esperado:

1. `Main.java` exibe os menus
2. o usuario escolhe uma opcao
3. o `Main` chama o controller correspondente
4. o controller executa a operacao
5. o controller usa as classes de modelo para trabalhar com os dados
6. a resposta volta para o terminal

Exemplo:

1. usuario escolhe `1 - Gerenciar Livros`
2. entra no submenu de livros
3. escolhe `1 - Cadastrar livro`
4. o `Main` chama `livroController.cadastrarLivro();`
5. o controller executa o cadastro

## Padrao de nomes ja definido no Main

Para evitar erro de integracao, os nomes dos metodos dos controllers ja estao definidos.

### `LivroController`

- `cadastrarLivro()`
- `listarLivros()`
- `buscarLivro()`
- `atualizarLivro()`
- `excluirLivro()`

### `LeitorController`

- `cadastrarLeitor()`
- `listarLeitores()`
- `buscarLeitor()`
- `atualizarLeitor()`
- `excluirLeitor()`

### `EmprestimoController`

- `registrarEmprestimo()`
- `listarEmprestimos()`
- `renovarEmprestimo()`
- `registrarDevolucao()`
- `listarEmprestimosAtivos()`

Esses nomes devem ser mantidos.

Se algum integrante mudar esses nomes sem alinhar com o grupo, o `Main.java` deixa de funcionar corretamente.

## Onde cada integrante deve codar

### Pessoa 1

Editar:

- `src/Main.java`

### Pessoa 2

Criar depois:

- `Livro.java`
- `LivroController.java`

### Pessoa 3

Criar depois:

- `Leitor.java`
- `LeitorController.java`

### Pessoa 4

Criar depois:

- `Emprestimo.java`
- `EmprestimoController.java`

### Pessoa 5

Revisar:

- organizacao dos arquivos
- padrao dos nomes
- coerencia dos comentarios
- aplicacao de POO
- conteudo da apresentacao

## O que combinar antes de cada um codar

Antes de cada integrante avancar muito na propria parte, o grupo precisa alinhar:

- nomes dos atributos
- nomes dos metodos
- tipo dos dados
- formato das mensagens no terminal
- como o livro vai indicar se esta disponivel
- como o emprestimo vai se relacionar com livro e leitor

Esse alinhamento evita que cada pessoa faca uma parte incompatível com a outra.

## Orientacao tecnica por modulo

### Main

O `Main` deve ser simples e organizado.

Ele deve conter:

- `main()`
- `iniciarSistema()`
- `exibirMenuPrincipal()`
- `menuLivros()`
- `menuLeitores()`
- `menuEmprestimos()`
- `exibirSobreSistema()`
- `lerOpcao()`
- `pausar()`
- `exibirCabecalho(String titulo)`

### Livro

O modulo de livro pode conter informacoes como:

- codigo
- titulo
- autor
- ano
- disponibilidade

### Leitor

O modulo de leitor pode conter informacoes como:

- codigo
- nome
- cpf ou matricula
- telefone

### Emprestimo

O modulo de emprestimo pode conter informacoes como:

- codigo do emprestimo
- livro relacionado
- leitor relacionado
- data do emprestimo
- data da devolucao
- status

## Situacao atual do projeto

Atualmente, o projeto foi deixado de forma mais simples para facilitar o entendimento do grupo.

No momento:

- existe apenas o `src/Main.java`
- os controllers no fim do arquivo sao temporarios
- eles servem apenas para testar o menu
- os outros arquivos serao criados depois pelo grupo

Quando o grupo avancar:

- a Pessoa 2 cria `Livro.java` e `LivroController.java`
- a Pessoa 3 cria `Leitor.java` e `LeitorController.java`
- a Pessoa 4 cria `Emprestimo.java` e `EmprestimoController.java`

Depois, esses controllers temporarios do `Main.java` podem ser removidos.

## O que cada pessoa pode editar agora

### Pessoa 1

Pode continuar editando:

- `src/Main.java`

### Pessoa 2

Vai criar depois:

- `Livro.java`
- `LivroController.java`

### Pessoa 3

Vai criar depois:

- `Leitor.java`
- `LeitorController.java`

### Pessoa 4

Vai criar depois:

- `Emprestimo.java`
- `EmprestimoController.java`

### Pessoa 5

Pode revisar:

- todos os arquivos de `src/`
- materiais de `docs/`

## Regras para nao quebrar a integracao

Para o grupo conseguir subir as partes sem conflito, estas regras devem ser mantidas:

- nao mudar o nome das classes
- nao mudar o nome dos metodos chamados no `Main`
- combinar antes onde os novos arquivos vao ficar
- nao criar outra classe com o mesmo nome sem alinhar com o grupo

Se essas regras forem seguidas, cada pessoa consegue trabalhar na sua propria parte e depois integrar sem retrabalho.

## Como executar

Dentro da pasta do projeto, use:

```bash
javac src/Main.java
java -cp src Main
```

## Fluxo sugerido de desenvolvimento

1. Pessoa 1 finaliza o menu e a estrutura principal.
2. Pessoa 2 implementa `Livro` e `LivroController`.
3. Pessoa 3 implementa `Leitor` e `LeitorController`.
4. Pessoa 4 implementa `Emprestimo` e `EmprestimoController`.
5. Pessoa 5 revisa o projeto inteiro.
6. O grupo integra tudo e testa junto.
7. O grupo monta a apresentacao final.

## O que sera entregue

Ao final, o grupo deve entregar:

- codigo-fonte completo do sistema
- apresentacao em PowerPoint

## Observacao final

Este projeto foi organizado para manter um nivel compativel com faculdade:

- simples
- funcional
- bem dividido
- facil de entender

A prioridade e ter um sistema correto, organizado e apresentavel, sem complicar desnecessariamente.
