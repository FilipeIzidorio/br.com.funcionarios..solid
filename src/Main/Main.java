package Main;

import Model.CadastroProdutos;
import Model.ClienteFisico;
import Funcionarios.Funcionario;
import Model.ClienteJuridico;
import Model.Endereco;


import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        String nome = "";
        double preco = 0;

        Funcionario funcionario = new Funcionario(1020, "filipe", "supervisor", 1000);

        Endereco enderecofisico = new Endereco("58.900-000",
                "PB","Cajazeiras","Centro","Av.julio marques","S/C");


        ClienteFisico clienteFisico = new ClienteFisico(true,"Possitivo",enderecofisico,"Alexandre Bezerra","048.474.354-88","35554-7","PPD");

        Endereco enderecoJuridico = new Endereco("58.900-000",
                "PB","Cajazeiras","Centro","Av.julio marques","S/C");

        ClienteJuridico clienteJuridico = new ClienteJuridico(true,"POSSITIVO",enderecoJuridico,"10.102.741/0001-88","LUIZ FELIPE","CHURRASCARIA DO MOTOR", "4125526","7546255");

        boolean retorna = false;
        do {
            String cadastro =
                    """
                                    MENU PRINCIPAL
                                    
                                   
                             1 - CADASTRAR FUNCIONARIO
                             2 - CADASTRAR CLIENTE FISICO
                             3 - CADASTRAR CLIENTE JURIDICO
                             4 - LISTAR FUNCIONARIOS
                             5 - LISTAR CLIENTE FISICO
                             6 - LISTAR CLIENTE JURIDICO
                             7 - CADASTRAR PRODUTOS
                             8 - LISTRA PRODUTOS
                             9 - SAIR
                            """;
            int i = 0;
            try {
                i = Integer.parseInt(JOptionPane.showInputDialog(cadastro));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "DIGITE O NUMERO INTEIRO");
            }


            switch (i) {
                case 1 -> {


                    funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
                    funcionario.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Matricula: ")));
                    funcionario.setCargo(JOptionPane.showInputDialog("Digite seu Cargo: "));
                    funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: ")));

                    JOptionPane.showMessageDialog(null, funcionario);
                    funcionario.ReajustarSalario();
                    JOptionPane.showMessageDialog(null, "salario com reajuste: " + funcionario.getSalario());
                    JOptionPane.showMessageDialog(null,funcionario.getHorario());


                }
                case 2 -> {
                    clienteFisico.setNomeCompleto(JOptionPane.showInputDialog("DIGITE SEU NOME:"));
                    clienteFisico.setCpf(JOptionPane.showInputDialog("DIGITE SEU CPF:"));
                    clienteFisico.setRg(JOptionPane.showInputDialog("DIGITE SEU RG:"));
                    clienteFisico.setOrgaoEmissor(JOptionPane.showInputDialog("DIGITE SEU ORGAO EMISSOR:"));
                    enderecofisico.setCidade(JOptionPane.showInputDialog("DIGITE O NOME DA SUA CIDADE: "));
                    enderecofisico.setCep(JOptionPane.showInputDialog("DIGITE SEU CEP:"));
                    enderecofisico.setUf(JOptionPane.showInputDialog("DIGITE SEU UF:"));
                    enderecofisico.setBairro(JOptionPane.showInputDialog("DIGITE SEU BAIRRO:"));
                    enderecofisico.setLogradouro(JOptionPane.showInputDialog("DIGITE SEU LOGRADOURO:"));
                    enderecofisico.setComplemento(JOptionPane.showInputDialog("DIGITE SEU COMPLEMENTO:"));

                    JOptionPane.showMessageDialog(null, clienteFisico);



                }
                case 3 -> {
                    clienteJuridico.setRazaoSocial(JOptionPane.showInputDialog("DIGITE SUA RAZAO SOCIAL: "));
                    clienteJuridico.setNomeFantasia(JOptionPane.showInputDialog("DIGITE O NOME FANTASIA DA EMPRESA : "));
                    clienteJuridico.setCnpj(JOptionPane.showInputDialog("DIGITE SEU CPNJ :"));
                    clienteJuridico.setInscricaoEstatual(JOptionPane.showInputDialog("DIGITE SUA INSCRICAO ESTATUAL: "));
                    clienteJuridico.setInscricaoMunicipal(JOptionPane.showInputDialog("DIGITE SUA INSCRICAO MUNICIPAL :"));
                    enderecoJuridico.setLogradouro(JOptionPane.showInputDialog("DIGITE SEU ENDERECO :"));
                    enderecoJuridico.setBairro(JOptionPane.showInputDialog("DIGITE O BAIRRO:"));
                    enderecoJuridico.setCep(JOptionPane.showInputDialog("DIGITE O CEP :"));
                    enderecoJuridico.setComplemento(JOptionPane.showInputDialog("DIGITE O COMPLEMENTO :"));
                    enderecoJuridico.setCidade(JOptionPane.showInputDialog("DIGITE A CIDADE:"));
                    enderecoJuridico.setCep(JOptionPane.showInputDialog("DIGITE O CEP : "));
                    enderecoJuridico.setUf(JOptionPane.showInputDialog("DIGITE A UF :"));
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, funcionario);
                    JOptionPane.showMessageDialog(null, funcionario.getHorario());
                }
                case 5 -> JOptionPane.showMessageDialog(null, clienteFisico.toString());
                case 6 -> JOptionPane.showMessageDialog(null, clienteJuridico.toString());

                case 7 -> {

                    cadastroProdutos.setNome(JOptionPane.showInputDialog("NOME DO PRODUTO " + nome));
                    cadastroProdutos.setPreco(Double.parseDouble(JOptionPane.showInputDialog("PRECO" + preco)));

                    int r1 = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar mais produtos?\n  1-Sim\n  0-Não"));
                    if (r1 == 1) {

                        cadastroProdutos.setNome(JOptionPane.showInputDialog("NOME DO PRODUTO " + nome));
                        cadastroProdutos.setPreco(Double.parseDouble(JOptionPane.showInputDialog("PRECO" + preco)));


                    }

                }
                case 8 -> JOptionPane.showMessageDialog(null, cadastroProdutos.toString());

                case 9 -> {
                    JOptionPane.showMessageDialog(null, "ATE LOGO");
                    System.exit(0);
                }

                default -> JOptionPane.showMessageDialog(null, "OPCAO INVALIDA"+"\n"+"DIGITE UMA OPCAO VALIDA");
            }
        }while(!retorna);

    }
}
