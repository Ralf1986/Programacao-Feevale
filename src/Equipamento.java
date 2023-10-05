public class Equipamento {
    private int codigo;
    private String descricao;
    private Usuario usuario;

    public Equipamento() {

    }

    public Equipamento(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Equipamento(int codigo, String descricao, Usuario usuario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void exibirDados() {
        System.out.println("\tUsuário: " + getUsuario().getNome() +
                "\n\tAlocado em: " + getUsuario().getSetor() + "\n" +
                "\n\tEquipamento: " + getDescricao() +
                "\n\tCódigo: " + getCodigo());

    }
}
