package Model;


import java.util.ArrayList;

public class ClienteFisico extends Cliente {

    ArrayList listClienteFisico = new ArrayList();

    String nomeCompleto;
    String cpf;
    String rg;
    String orgaoEmissor;

    public ClienteFisico(boolean clienteAtivo, String cadastro, Endereco endereco, String nomeCompleto, String cpf, String rg, String orgaoEmissor) {
        super(clienteAtivo, cadastro, endereco);
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        listClienteFisico.add(nomeCompleto);
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        listClienteFisico.add(cpf);
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        listClienteFisico.add(rg);
        this.rg = rg;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        listClienteFisico.add(orgaoEmissor);
        this.orgaoEmissor = orgaoEmissor;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                " nomeCompleto='" + nomeCompleto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastro='" + cadastro + '\'' +
                '}'+
                "\n" + endereco +
                "\n\nLista De Clientes Fisicos =" + listClienteFisico +"\n"
                ;
    }
}

