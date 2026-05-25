

import java.util.ArrayList;
import java.util.Scanner;

public class LeitorController {

    private ArrayList<Leitor> leitores = new ArrayList<>();
    private Scanner scanner;

    public LeitorController() {
        this.scanner = new Scanner(System.in);
    }

    public LeitorController(Scanner scanner) {
        this.scanner = scanner;
    }

    // CADASTRAR LEITOR
    public void cadastrarLeitor() {

        System.out.print("Digite o ID do leitor: ");
        int id = lerId();

        System.out.print("Digite o nome do leitor: ");
        String nome = lerTextoObrigatorio("Nome invalido. Digite o nome do leitor: ");

        System.out.print("Digite o email do leitor: ");
        String email = lerTextoObrigatorio("Email invalido. Digite o email do leitor: ");

        Leitor leitor = new Leitor(id, nome, email);

        leitores.add(leitor);

        System.out.println("Leitor cadastrado com sucesso!");
    }

    // LISTAR LEITORES
    public void listarLeitores() {

        if(leitores.isEmpty()) {

            System.out.println("Nenhum leitor cadastrado.");
            return;
        }

        for(Leitor leitor : leitores) {

            System.out.println(leitor);
        }
    }

    // BUSCAR LEITOR
    public void buscarLeitor() {

        System.out.print("Digite o ID do leitor: ");
        int id = lerId();

        for(Leitor leitor : leitores) {

            if(leitor.getId() == id) {

                System.out.println(leitor);
                return;
            }
        }

        System.out.println("Leitor nao encontrado.");
    }

    // ATUALIZAR LEITOR
    public void atualizarLeitor() {

        System.out.print("Digite o ID do leitor: ");
        int id = lerId();

        for(Leitor leitor : leitores) {

            if(leitor.getId() == id) {

                System.out.print("Novo nome: ");
                String nome = lerTextoObrigatorio("Nome invalido. Digite o novo nome: ");

                System.out.print("Novo email: ");
                String email = lerTextoObrigatorio("Email invalido. Digite o novo email: ");

                leitor.setNome(nome);
                leitor.setEmail(email);

                System.out.println("Leitor atualizado!");
                return;
            }
        }

        System.out.println("Leitor nao encontrado.");
    }

    // EXCLUIR LEITOR
    public void excluirLeitor() {

        System.out.print("Digite o ID do leitor: ");
        int id = lerId();

        for(Leitor leitor : leitores) {

            if(leitor.getId() == id) {

                leitores.remove(leitor);

                System.out.println("Leitor removido!");
                return;
            }
        }

        System.out.println("Leitor nao encontrado.");
    }

    private int lerId() {

        while(true) {

            try {

                return Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e) {

                System.out.print("ID invalido. Digite apenas numeros: ");
            }
        }
    }

    private String lerTextoObrigatorio(String mensagemErro) {

        String texto = scanner.nextLine();

        while(texto.trim().isEmpty()) {

            System.out.print(mensagemErro);
            texto = scanner.nextLine();
        }

        return texto;
    }
}
