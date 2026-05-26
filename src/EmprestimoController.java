import java.util.ArrayList;
import java.util.Scanner;

public class EmprestimoController { // Controller de emprestimos.

    private ArrayList<Emprestimo> emprestimos = new ArrayList<>(); // Lista de emprestimos.
    private Scanner scanner; // Scanner do sistema.
    private LivroController livroController; // Controller de livros.
    private LeitorController leitorController; // Controller de leitores.
    private int proximoCodigo = 1; // Proximo codigo.

    public EmprestimoController() { // Construtor padrao.
        this.scanner = new Scanner(System.in); // Cria Scanner proprio.
        this.livroController = new LivroController(scanner); // Cria controller de livros.
        this.leitorController = new LeitorController(scanner); // Cria controller de leitores.
    } // Fim do construtor padrao.

    public EmprestimoController(Scanner scanner, LivroController livroController, LeitorController leitorController) { // Construtor completo.
        this.scanner = scanner; // Usa o Scanner principal.
        this.livroController = livroController; // Usa os livros cadastrados.
        this.leitorController = leitorController; // Usa os leitores cadastrados.
    } // Fim do construtor completo.

    public void registrarEmprestimo() { // Registra um emprestimo.
        System.out.print("Digite o titulo do livro: "); // Pede o livro.
        String titulo = lerTextoObrigatorio("Titulo invalido. Digite o titulo do livro: "); // Le o titulo.
        Livro livro = livroController.buscarLivroPorTitulo(titulo); // Busca o livro.

        if(livro == null) { // Verifica se existe.
            System.out.println("Livro nao encontrado. Cadastre o livro antes do emprestimo."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        if(!livro.isDisponivel()) { // Verifica disponibilidade.
            System.out.println("Livro indisponivel para emprestimo."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        System.out.print("Digite o ID do leitor: "); // Pede o leitor.
        int idLeitor = lerNumero(); // Le o id.
        Leitor leitor = leitorController.buscarLeitorPorId(idLeitor); // Busca o leitor.

        if(leitor == null) { // Verifica se existe.
            System.out.println("Leitor nao encontrado. Cadastre o leitor antes do emprestimo."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        Emprestimo emprestimo = new Emprestimo(proximoCodigo, livro, leitor); // Cria emprestimo.
        emprestimos.add(emprestimo); // Salva na lista.
        proximoCodigo++; // Atualiza o codigo.

        System.out.println("Emprestimo registrado com sucesso."); // Mostra mensagem.
        System.out.println(emprestimo); // Mostra o emprestimo.
    } // Fim do registrarEmprestimo.

    public void listarEmprestimos() { // Lista emprestimos.
        if(emprestimos.isEmpty()) { // Verifica se a lista esta vazia.
            System.out.println("Nenhum emprestimo cadastrado."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        for(Emprestimo emprestimo : emprestimos) { // Percorre a lista.
            System.out.println(emprestimo); // Mostra o emprestimo.
        } // Fim do for.
    } // Fim do listarEmprestimos.

    public void renovarEmprestimo() { // Renova emprestimo.
        System.out.print("Digite o codigo do emprestimo: "); // Pede o codigo.
        int codigo = lerNumero(); // Le o codigo.
        Emprestimo emprestimo = buscarEmprestimoPorCodigo(codigo); // Busca o emprestimo.

        if(emprestimo == null) { // Verifica se existe.
            System.out.println("Emprestimo nao encontrado."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        emprestimo.renovarPrazo(7); // Renova por 7 dias.
    } // Fim do renovarEmprestimo.

    public void registrarDevolucao() { // Registra devolucao.
        System.out.print("Digite o codigo do emprestimo: "); // Pede o codigo.
        int codigo = lerNumero(); // Le o codigo.
        Emprestimo emprestimo = buscarEmprestimoPorCodigo(codigo); // Busca o emprestimo.

        if(emprestimo == null) { // Verifica se existe.
            System.out.println("Emprestimo nao encontrado."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        emprestimo.darBaixa(); // Da baixa.
    } // Fim do registrarDevolucao.

    public void listarEmprestimosAtivos() { // Lista ativos.
        boolean encontrou = false; // Controla se encontrou.

        for(Emprestimo emprestimo : emprestimos) { // Percorre a lista.
            if(emprestimo.isAtivo()) { // Verifica se esta ativo.
                System.out.println(emprestimo); // Mostra o emprestimo.
                encontrou = true; // Marca que encontrou.
            } // Fim do if.
        } // Fim do for.

        if(!encontrou) { // Verifica se nao achou.
            System.out.println("Nenhum emprestimo ativo."); // Mostra aviso.
        } // Fim do if.
    } // Fim do listarEmprestimosAtivos.

    private Emprestimo buscarEmprestimoPorCodigo(int codigo) { // Busca por codigo.
        for(Emprestimo emprestimo : emprestimos) { // Percorre a lista.
            if(emprestimo.getCodigo() == codigo) { // Compara codigo.
                return emprestimo; // Retorna encontrado.
            } // Fim do if.
        } // Fim do for.

        return null; // Retorna vazio.
    } // Fim do buscarEmprestimoPorCodigo.

    private int lerNumero() { // Le numero.
        while(true) { // Repete ate ser valido.
            try { // Tenta converter.
                return Integer.parseInt(scanner.nextLine()); // Retorna numero.
            } catch(NumberFormatException e) { // Trata erro.
                System.out.print("Valor invalido. Digite apenas numeros: "); // Pede novamente.
            } // Fim do try-catch.
        } // Fim do while.
    } // Fim do lerNumero.

    private String lerTextoObrigatorio(String mensagemErro) { // Le texto obrigatorio.
        String texto = scanner.nextLine(); // Le texto.

        while(texto.trim().isEmpty()) { // Verifica vazio.
            System.out.print(mensagemErro); // Mostra erro.
            texto = scanner.nextLine(); // Le novamente.
        } // Fim do while.

        return texto; // Retorna texto.
    } // Fim do lerTextoObrigatorio.
} // Fim da classe EmprestimoController.
