public class EquipamentoFixo extends Equipamento {

    private String sala;

    public EquipamentoFixo(int codigo, String descricao, String sala) {
        super(codigo, descricao);
        this.sala = sala;
    }

    public EquipamentoFixo(int codigo, String descricao, Usuario usuario, String sala) {
        super(codigo, descricao, usuario);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void exibirDados() {
        System.out.println("\tUsuário: " + getUsuario().getNome() +
                "\n\tAlocado em: " + getUsuario().getSetor() + "\n" +
                "\n\tEquipamento: " + getDescricao() +
                "\n\tCódigo: " + getCodigo() +
                "\n\tSala: " + getSala());


    }
}
