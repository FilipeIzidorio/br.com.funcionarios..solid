package Model;

public class Cliente {
    boolean clienteAtivo;
    String cadastro;

    Endereco endereco;

    public Cliente(boolean clienteAtivo, String cadastro, Endereco endereco) {
        this.clienteAtivo = clienteAtivo;
        this.cadastro = cadastro;
        this.endereco = endereco;
    }

    public boolean isClienteAtivo() {
        return clienteAtivo;
    }

    public void setClienteAtivo(boolean clienteAtivo) {
        this.clienteAtivo = clienteAtivo;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\nclienteAtivo=" + clienteAtivo +
                ", cadastro='" + cadastro + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}