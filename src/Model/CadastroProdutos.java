package Model;

import java.util.ArrayList;

public class CadastroProdutos {
    ArrayList cadastroProduto = new ArrayList();

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        cadastroProduto.add(nome);
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        cadastroProduto.add(preco);
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "\nLista de produtos =" + cadastroProduto +
                '}';
    }
}
