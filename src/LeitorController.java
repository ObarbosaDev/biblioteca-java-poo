

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
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o nome do leitor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do leitor: ");
        String email = scanner.nextLine();

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
        int id = Integer.parseInt(scanner.nextLine());

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
        int id = Integer.parseInt(scanner.nextLine());

        for(Leitor leitor : leitores) {

            if(leitor.getId() == id) {

                System.out.print("Novo nome: ");
                String nome = scanner.nextLine();

                System.out.print("Novo email: ");
                String email = scanner.nextLine();

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
        int id = Integer.parseInt(scanner.nextLine());

        for(Leitor leitor : leitores) {

            if(leitor.getId() == id) {

                leitores.remove(leitor);

                System.out.println("Leitor removido!");
                return;
            }
        }

        System.out.println("Leitor nao encontrado.");
    }
}
