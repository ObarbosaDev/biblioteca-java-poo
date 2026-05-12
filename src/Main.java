import java.util.Scanner; // Importa o Scanner.
import java.lang.reflect.Field; // Importa o Field.

public class Main { // Classe principal.

    private static LivroController livroController; // Controller de livros.
    private static LeitorController leitorController; // Controller de leitores.
    private static EmprestimoController emprestimoController; // Controller de emprestimos.
    private static Scanner scanner; // Scanner do sistema.

    public static void main(String[] args) { // Metodo principal.
        iniciarSistema(); // Inicia o sistema.
    } // Fim do main.

    public static void iniciarSistema() { // Inicia o sistema.
        scanner = new Scanner(System.in); // Cria o Scanner.
        livroController = new LivroController(); // Cria o controller de livros.
        leitorController = new LeitorController(); // Cria o controller de leitores.
        compartilharScanner(leitorController); // Compartilha o Scanner.
        emprestimoController = new EmprestimoController(); // Cria o controller de emprestimos.

        int opcao; // Guarda a opcao do menu.

        do { // Repete o menu principal.
            limparTela(); // Limpa a tela.
            exibirMenuPrincipal(); // Mostra o menu.
            opcao = lerOpcao(); // Le a opcao.

            switch (opcao) { // Verifica a opcao.
                case 1: // Opcao livros.
                    menuLivros(); // Abre menu de livros.
                    break; // Sai do case.
                case 2: // Opcao leitores.
                    menuLeitores(); // Abre menu de leitores.
                    break; // Sai do case.
                case 3: // Opcao emprestimos.
                    menuEmprestimos(); // Abre menu de emprestimos.
                    break; // Sai do case.
                case 4: // Opcao sobre.
                    exibirSobreSistema(); // Mostra a tela sobre.
                    break; // Sai do case.
                case 0: // Opcao sair.
                    exibirCabecalho("Encerrando Sistema"); // Mostra o titulo.
                    System.out.println("Sistema finalizado com sucesso."); // Mostra a mensagem final.
                    break; // Sai do case.
                default: // Opcao invalida.
                    System.out.println("Opcao invalida. Tente novamente."); // Mostra o aviso.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
            } // Fim do switch.
        } while (opcao != 0); // Continua ate sair.

        scanner.close(); // Fecha o Scanner.
    } // Fim do iniciarSistema.

    public static void exibirMenuPrincipal() { // Mostra o menu principal.
        exibirCabecalho("Sistema de Biblioteca"); // Mostra o titulo.
        System.out.println("1 - Gerenciar Livros"); // Opcao 1.
        System.out.println("2 - Gerenciar Leitores"); // Opcao 2.
        System.out.println("3 - Gerenciar Emprestimos"); // Opcao 3.
        System.out.println("4 - Sobre o Sistema"); // Opcao 4.
        System.out.println("0 - Sair"); // Opcao 0.
        System.out.print("Escolha uma opcao: "); // Pede a opcao.
    } // Fim do exibirMenuPrincipal.

    public static void menuLivros() { // Controla o menu de livros.
        int opcao; // Guarda a opcao.

        do { // Repete o submenu.
            limparTela(); // Limpa a tela.
            exibirCabecalho("Gerenciar Livros"); // Mostra o titulo.
            System.out.println("1 - Cadastrar livro"); // Opcao 1.
            System.out.println("2 - Listar livros"); // Opcao 2.
            System.out.println("3 - Buscar livro"); // Opcao 3.
            System.out.println("4 - Atualizar livro"); // Opcao 4.
            System.out.println("5 - Excluir livro"); // Opcao 5.
            System.out.println("0 - Voltar"); // Opcao 0.
            System.out.print("Escolha uma opcao: "); // Pede a opcao.
            opcao = lerOpcao(); // Le a opcao.

            switch (opcao) { // Verifica a opcao.
                case 1: // Cadastrar livro.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Cadastrar Livro"); // Mostra o titulo.
                    livroController.cadastrarLivro(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 2: // Listar livros.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Listar Livros"); // Mostra o titulo.
                    livroController.listarLivros(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 3: // Buscar livro.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Buscar Livro"); // Mostra o titulo.
                    livroController.buscarLivro(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 4: // Atualizar livro.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Atualizar Livro"); // Mostra o titulo.
                    livroController.atualizarLivro(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 5: // Excluir livro.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Excluir Livro"); // Mostra o titulo.
                    livroController.excluirLivro(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 0: // Voltar.
                    System.out.println("Retornando ao menu principal..."); // Mostra a mensagem.
                    break; // Sai do case.
                default: // Opcao invalida.
                    System.out.println("Opcao invalida. Tente novamente."); // Mostra o aviso.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
            } // Fim do switch.
        } while (opcao != 0); // Continua ate voltar.
    } // Fim do menuLivros.

    public static void menuLeitores() { // Controla o menu de leitores.
        int opcao; // Guarda a opcao.

        do { // Repete o submenu.
            limparTela(); // Limpa a tela.
            exibirCabecalho("Gerenciar Leitores"); // Mostra o titulo.
            System.out.println("1 - Cadastrar leitor"); // Opcao 1.
            System.out.println("2 - Listar leitores"); // Opcao 2.
            System.out.println("3 - Buscar leitor"); // Opcao 3.
            System.out.println("4 - Atualizar leitor"); // Opcao 4.
            System.out.println("5 - Excluir leitor"); // Opcao 5.
            System.out.println("0 - Voltar"); // Opcao 0.
            System.out.print("Escolha uma opcao: "); // Pede a opcao.
            opcao = lerOpcao(); // Le a opcao.

            switch (opcao) { // Verifica a opcao.
                case 1: // Cadastrar leitor.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Cadastrar Leitor"); // Mostra o titulo.
                    leitorController.cadastrarLeitor(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 2: // Listar leitores.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Listar Leitores"); // Mostra o titulo.
                    leitorController.listarLeitores(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 3: // Buscar leitor.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Buscar Leitor"); // Mostra o titulo.
                    leitorController.buscarLeitor(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 4: // Atualizar leitor.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Atualizar Leitor"); // Mostra o titulo.
                    leitorController.atualizarLeitor(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 5: // Excluir leitor.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Excluir Leitor"); // Mostra o titulo.
                    leitorController.excluirLeitor(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 0: // Voltar.
                    System.out.println("Retornando ao menu principal..."); // Mostra a mensagem.
                    break; // Sai do case.
                default: // Opcao invalida.
                    System.out.println("Opcao invalida. Tente novamente."); // Mostra o aviso.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
            } // Fim do switch.
        } while (opcao != 0); // Continua ate voltar.
    } // Fim do menuLeitores.

    public static void menuEmprestimos() { // Controla o menu de emprestimos.
        int opcao; // Guarda a opcao.

        do { // Repete o submenu.
            limparTela(); // Limpa a tela.
            exibirCabecalho("Gerenciar Emprestimos"); // Mostra o titulo.
            System.out.println("1 - Registrar emprestimo"); // Opcao 1.
            System.out.println("2 - Listar emprestimos"); // Opcao 2.
            System.out.println("3 - Renovar emprestimo"); // Opcao 3.
            System.out.println("4 - Registrar devolucao"); // Opcao 4.
            System.out.println("5 - Listar emprestimos ativos"); // Opcao 5.
            System.out.println("0 - Voltar"); // Opcao 0.
            System.out.print("Escolha uma opcao: "); // Pede a opcao.
            opcao = lerOpcao(); // Le a opcao.

            switch (opcao) { // Verifica a opcao.
                case 1: // Registrar emprestimo.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Registrar Emprestimo"); // Mostra o titulo.
                    emprestimoController.registrarEmprestimo(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 2: // Listar emprestimos.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Listar Emprestimos"); // Mostra o titulo.
                    emprestimoController.listarEmprestimos(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 3: // Renovar emprestimo.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Renovar Emprestimo"); // Mostra o titulo.
                    emprestimoController.renovarEmprestimo(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 4: // Registrar devolucao.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Registrar Devolucao"); // Mostra o titulo.
                    emprestimoController.registrarDevolucao(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 5: // Listar ativos.
                    limparTela(); // Limpa a tela.
                    exibirCabecalho("Emprestimos Ativos"); // Mostra o titulo.
                    emprestimoController.listarEmprestimosAtivos(); // Chama o metodo.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
                case 0: // Voltar.
                    System.out.println("Retornando ao menu principal..."); // Mostra a mensagem.
                    break; // Sai do case.
                default: // Opcao invalida.
                    System.out.println("Opcao invalida. Tente novamente."); // Mostra o aviso.
                    pausar(); // Espera o usuario.
                    break; // Sai do case.
            } // Fim do switch.
        } while (opcao != 0); // Continua ate voltar.
    } // Fim do menuEmprestimos.

    public static void exibirSobreSistema() { // Mostra a tela sobre.
        limparTela(); // Limpa a tela.
        exibirCabecalho("Sobre o Sistema"); // Mostra o titulo.
        System.out.println("Sistema de Gestao de Acervo e Emprestimos."); // Mostra a descricao.
        System.out.println("Projeto academico desenvolvido em Java."); // Mostra a finalidade.
        System.out.println("Modulos: Livros, Leitores e Emprestimos."); // Mostra os modulos.
        pausar(); // Espera o usuario.
    } // Fim do exibirSobreSistema.

    public static int lerOpcao() { // Le a opcao.
        while (true) { // Repete ate dar certo.
            String entrada = scanner.nextLine(); // Le a entrada.

            try { // Tenta converter.
                return Integer.parseInt(entrada); // Retorna o numero.
            } catch (NumberFormatException e) { // Se der erro.
                System.out.print("Entrada invalida. Digite um numero: "); // Pede de novo.
            } // Fim do try-catch.
        } // Fim do while.
    } // Fim do lerOpcao.

    public static void pausar() { // Pausa o sistema.
        System.out.println(); // Pula uma linha.
        System.out.print("Pressione Enter para continuar..."); // Mostra a mensagem.
        scanner.nextLine(); // Espera o Enter.
    } // Fim do pausar.

    public static void exibirCabecalho(String titulo) { // Mostra um cabecalho.
        System.out.println("========================================"); // Linha de cima.
        System.out.println(titulo); // Titulo da tela.
        System.out.println("========================================"); // Linha de baixo.
    } // Fim do exibirCabecalho.

    public static void limparTela() { // Limpa a tela.
        for (int i = 0; i < 20; i++) { // Repete as linhas.
            System.out.println(); // Mostra linha vazia.
        } // Fim do for.
    } // Fim do limparTela.

    public static void compartilharScanner(Object controller) { // Compartilha o Scanner.
        try { // Tenta acessar o campo.
            Field campoScanner = controller.getClass().getDeclaredField("scanner"); // Busca o campo.
            campoScanner.setAccessible(true); // Libera o acesso.
            campoScanner.set(controller, scanner); // Usa o mesmo Scanner.
        } catch (NoSuchFieldException e) { // Se nao tiver campo.
            return; // Nao faz nada.
        } catch (IllegalAccessException e) { // Se nao conseguir acessar.
            return; // Nao faz nada.
        } // Fim do try-catch.
    } // Fim do compartilharScanner.
} // Fim da classe Main.

class LivroController { // Controller temporario de livros.

    public void cadastrarLivro() { // Metodo temporario.
        System.out.println("Cadastrar livro em construcao."); // Mostra aviso.
    } // Fim do cadastrarLivro.

    public void listarLivros() { // Metodo temporario.
        System.out.println("Listar livros em construcao."); // Mostra aviso.
    } // Fim do listarLivros.

    public void buscarLivro() { // Metodo temporario.
        System.out.println("Buscar livro em construcao."); // Mostra aviso.
    } // Fim do buscarLivro.

    public void atualizarLivro() { // Metodo temporario.
        System.out.println("Atualizar livro em construcao."); // Mostra aviso.
    } // Fim do atualizarLivro.

    public void excluirLivro() { // Metodo temporario.
        System.out.println("Excluir livro em construcao."); // Mostra aviso.
    } // Fim do excluirLivro.
} // Fim da classe LivroController.
