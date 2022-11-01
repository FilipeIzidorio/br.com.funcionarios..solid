package Model;

import Interfaces.IAutenticavel;

import java.util.UUID;

public class Cliente extends Endereco{


    UUID id;
    boolean clienteAtivo;
    String cadastro;



    public Cliente(String cep, String uf, String cidade, String bairro, String logradouro, String complemento,boolean clienteAtivo,String cadastro) {
        super();
        this.id = UUID.randomUUID();
        this.clienteAtivo = clienteAtivo;
        this.cadastro = cadastro;
    }

    public UUID getId() {
        return id;
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

    @Override
    public String toString() {
        return "\nCliente{" +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastro=" + cadastro +
                '}'+super.toString();
    }
}