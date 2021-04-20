package Classes;


public class Contato {
    private int codigo;
    private String nome;
    private String telefone;
    
    public Contato(String nome2, String telefone2, int codigo2) {
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void add(Contato contato) {
    }
    
    @Override
    public String toString() {
        return "Contato codigo =" + getCodigo() + ", nome =" + getNome() + ", telefone =" + getTelefone();
    }
}


