package Model;


import java.util.ArrayList;

public class ClienteJuridico extends Cliente {
    ArrayList listClienteJuridica = new ArrayList();
    String cnpj;
    String razaoSocial;
    String nomeFantasia;

    String inscricaoEstatual;
    String inscricaoMunicipal;

    public ClienteJuridico(boolean clienteAtivo, String cadastro, Endereco endereco, String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstatual, String inscricaoMunicipal) {
        super(clienteAtivo, cadastro, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstatual = inscricaoEstatual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        listClienteJuridica.add(cnpj);
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        listClienteJuridica.add(razaoSocial);
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        listClienteJuridica.add(nomeFantasia);
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(String inscricaoEstatual) {
        listClienteJuridica.add(inscricaoEstatual);
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        listClienteJuridica.add(inscricaoMunicipal);
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", inscricaoEstatual='" + inscricaoEstatual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastro='" + cadastro + '\''+
                '}' +
                "\n" + endereco +
                "\n\nLista De Clientes Fisicos =" + listClienteJuridica +"\n"
                ;
    }

}