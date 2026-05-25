import java.util.ArrayList;
import java.util.Scanner;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<>();
    private Scanner scanner;

    public LivroController() {
        this.scanner = new Scanner(System.in);
    }

    public LivroController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void cadastrarLivro(){
        System.out.print("Digite o titulo do livro: ");
        String titulo=lerTextoObrigatorio("Titulo invalido. Digite o titulo do livro: ");
        Livro livro=new Livro(titulo);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for(Livro l:livros){
            System.out.println("Titulo: "+l.getTitulo());
        }
    }

    public void buscarLivro(){
        System.out.print("Digite o titulo: ");
        String titulo=lerTextoObrigatorio("Titulo invalido. Digite o titulo: ");
        for(Livro l:livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro encontrado: "+l.getTitulo());
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    public void atualizarLivro(){
        System.out.print("Digite o titulo atual: ");
        String titulo=lerTextoObrigatorio("Titulo invalido. Digite o titulo atual: ");
        for(Livro l:livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.print("Novo titulo: ");
                l.setTitulo(lerTextoObrigatorio("Titulo invalido. Digite o novo titulo: "));
                System.out.println("Livro atualizado.");
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    public void excluirLivro(){
        System.out.print("Digite o titulo: ");
        String titulo=lerTextoObrigatorio("Titulo invalido. Digite o titulo: ");
        for(Livro l:livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(l);
                System.out.println("Livro excluido.");
                return;
            }
        }
        System.out.println("Livro nao encontrado.");
    }

    private String lerTextoObrigatorio(String mensagemErro){
        String texto=scanner.nextLine();
        while(texto.trim().isEmpty()){
            System.out.print(mensagemErro);
            texto=scanner.nextLine();
        }
        return texto;
    }
}
