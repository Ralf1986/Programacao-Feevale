public class Usuario {
    String nome;
    String setor;

    public Usuario(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void exibirDados() {

        System.out.println("\tNome do usuario: " + getNome());
        System.out.println("\tSetor: " + getSetor());
        System.out.println("\n");
    }
}
