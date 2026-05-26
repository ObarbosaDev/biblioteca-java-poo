import java.time.LocalDate; // Importa a data.

public class Emprestimo { // Classe de emprestimo.

    private int codigo; // Codigo do emprestimo.
    private Livro livro; // Livro emprestado.
    private Leitor leitor; // Leitor do emprestimo.
    private LocalDate dataEmprestimo; // Data do emprestimo.
    private LocalDate dataDevolucaoPrevista; // Data prevista.
    private boolean ativo; // Status do emprestimo.

    public Emprestimo(int codigo, Livro livro, Leitor leitor) { // Construtor.
        this.codigo = codigo; // Salva o codigo.
        this.livro = livro; // Salva o livro.
        this.leitor = leitor; // Salva o leitor.
        this.dataEmprestimo = LocalDate.now(); // Define a data atual.
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7); // Define o prazo.
        this.ativo = true; // Marca como ativo.
        this.livro.setDisponivel(false); // Marca o livro como emprestado.
    } // Fim do construtor.

    public int getCodigo() { // Retorna o codigo.
        return codigo; // Devolve o codigo.
    } // Fim do getCodigo.

    public void renovarPrazo(int diasExtras) { // Renova o prazo.
        if (ativo) { // Verifica se esta ativo.
            dataDevolucaoPrevista = dataDevolucaoPrevista.plusDays(diasExtras); // Soma os dias.
            System.out.println("Prazo renovado. Nova data: " + dataDevolucaoPrevista); // Mostra a data.
        } else { // Caso esteja finalizado.
            System.out.println("Nao e possivel renovar um emprestimo finalizado."); // Mostra aviso.
        } // Fim do if.
    } // Fim do renovarPrazo.

    public void darBaixa() { // Registra a devolucao.
        if(!ativo) { // Verifica se ja foi devolvido.
            System.out.println("Este emprestimo ja foi devolvido."); // Mostra aviso.
            return; // Para o metodo.
        } // Fim do if.

        ativo = false; // Finaliza o emprestimo.
        livro.setDisponivel(true); // Libera o livro.
        System.out.println("Devolucao registrada com sucesso."); // Mostra mensagem.
    } // Fim do darBaixa.

    public boolean isAtivo() { // Retorna o status.
        return ativo; // Devolve o status.
    } // Fim do isAtivo.

    public Livro getLivro() { // Retorna o livro.
        return livro; // Devolve o livro.
    } // Fim do getLivro.

    public Leitor getLeitor() { // Retorna o leitor.
        return leitor; // Devolve o leitor.
    } // Fim do getLeitor.

    public LocalDate getDataEmprestimo() { // Retorna a data inicial.
        return dataEmprestimo; // Devolve a data.
    } // Fim do getDataEmprestimo.

    public LocalDate getDataDevolucaoPrevista() { // Retorna a data prevista.
        return dataDevolucaoPrevista; // Devolve a data.
    } // Fim do getDataDevolucaoPrevista.

    @Override // Sobrescreve o metodo.
    public String toString() { // Monta o texto do emprestimo.
        return "Codigo: " + codigo
                + " | Livro: " + livro.getTitulo()
                + " | Leitor: " + leitor.getNome()
                + " | Emprestimo: " + dataEmprestimo
                + " | Devolucao: " + dataDevolucaoPrevista
                + " | Status: " + (ativo ? "Ativo" : "Devolvido"); // Retorna o texto.
    } // Fim do toString.
} // Fim da classe Emprestimo.
