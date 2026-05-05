public class Livro { // Classe simples de livro.

    private String titulo; // Titulo do livro.
    private boolean disponivel; // Status do livro.

    public Livro(String titulo) { // Construtor.
        this.titulo = titulo; // Salva o titulo.
        this.disponivel = true; // Comeca disponivel.
    } // Fim do construtor.

    public String getTitulo() { // Retorna o titulo.
        return titulo; // Devolve o titulo.
    } // Fim do getTitulo.

    public void setTitulo(String titulo) { // Altera o titulo.
        this.titulo = titulo; // Salva o titulo.
    } // Fim do setTitulo.

    public boolean isDisponivel() { // Retorna o status.
        return disponivel; // Devolve o status.
    } // Fim do isDisponivel.

    public void setDisponivel(boolean disponivel) { // Altera o status.
        this.disponivel = disponivel; // Salva o status.
    } // Fim do setDisponivel.
} // Fim da classe Livro.
