public class EmprestimoController { // Controller de emprestimos.

    private Emprestimo emprestimo; // Guarda um emprestimo simples.

    public void registrarEmprestimo() { // Registra um emprestimo.
        Livro livro = new Livro("Livro de exemplo"); 
        Leitor leitor = new Leitor(
    1,
    "pedro",
    "pedrocborges@gmail.com"
);
        emprestimo = new Emprestimo(livro, leitor); // Cria o emprestimo.
        System.out.println("Emprestimo registrado com sucesso."); // Mostra mensagem.
        System.out.println(emprestimo); // Mostra o emprestimo.
    } // Fim do registrarEmprestimo.

    public void listarEmprestimos() { // Lista emprestimos.
        if (emprestimo == null) { // Verifica se nao existe.
            System.out.println("Nenhum emprestimo cadastrado."); // Mostra aviso.
        } else { // Caso exista.
            System.out.println(emprestimo); // Mostra o emprestimo.
        } // Fim do if.
    } // Fim do listarEmprestimos.

    public void renovarEmprestimo() { // Renova emprestimo.
        if (emprestimo == null) { // Verifica se nao existe.
            System.out.println("Nenhum emprestimo para renovar."); // Mostra aviso.
        } else { // Caso exista.
            emprestimo.renovarPrazo(7); // Renova por 7 dias.
        } // Fim do if.
    } // Fim do renovarEmprestimo.

    public void registrarDevolucao() { // Registra devolucao.
        if (emprestimo == null) { // Verifica se nao existe.
            System.out.println("Nenhum emprestimo para devolver."); // Mostra aviso.
        } else { // Caso exista.
            emprestimo.darBaixa(); // Da baixa.
        } // Fim do if.
    } // Fim do registrarDevolucao.

    public void listarEmprestimosAtivos() { // Lista ativos.
        if (emprestimo != null && emprestimo.isAtivo()) { // Verifica se esta ativo.
            System.out.println(emprestimo); // Mostra o emprestimo.
        } else { // Caso nao tenha ativo.
            System.out.println("Nenhum emprestimo ativo."); // Mostra aviso.
        } // Fim do if.
    } // Fim do listarEmprestimosAtivos.
} // Fim da classe EmprestimoController.
