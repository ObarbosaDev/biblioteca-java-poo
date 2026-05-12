public class Leitor {

    private int id;
    private String nome;
    private String email;

    // Construtor
    public Leitor(int id, String nome, String email) {

        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    // Getter do ID
    public int getId() {
        return id;
    }

    // Setter do ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Setter do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do email
    public String getEmail() {
        return email;
    }

    // Setter do email
    public void setEmail(String email) {
        this.email = email;
    }

    // Mostrar informações
    @Override
    public String toString() {

        return "\nID: " + id +
               "\nNome: " + nome +
               "\nEmail: " + email + "\n";
    }
}