public class EquipamentoMovel extends Equipamento {
    double peso;
    String seguro;

    public EquipamentoMovel(int codigo, String descricao, double peso, String seguro) {
        super(codigo, descricao);
        this.peso = peso;
        this.seguro = seguro;
    }

    public EquipamentoMovel(int codigo, String descricao, Usuario usuario, double peso, String seguro) {
        super(codigo, descricao, usuario);
        this.peso = peso;
        this.seguro = seguro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {

        }
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void exibirDados() {
        System.out.println("\tUsuário: " + getUsuario().getNome() +
                "\n\tAlocado em: " + getUsuario().getSetor() + "\n" +
                "\n\tEquipamento: " + getDescricao() +
                "\n\tCódigo: " + getCodigo());
        if (getSeguro().equals("S")) {
            System.out.println("Seguro: Sim");

        } else {
            System.out.println("Seguro: Não");
        }


    }
}
