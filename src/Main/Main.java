package Main;

import Model.CadastroProdutos;
import Model.ClienteFisico;
import Model.ClienteJuridico;
import Funcionarios.Funcionario;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        String nome = "";
        double preco = 0;

        Funcionario funcionario = new Funcionario(1020, "filipe", "supervisor", 1000);

        ClienteFisico clienteFisico = new ClienteFisico("Alexandre Bezerra","048.474.354-88","35554-7","PPD","58.900-000",
                "PB","Cajazeiras","Centro","Av.julio marques","S/C",true,"Possitivo");



        ClienteJuridico clienteJuridico = new ClienteJuridico(true,"POSSITIVO","10.102.741/0001-88","LUIZ FELIPE","CHURRASCARIA DO MOTOR",
                "4125526","7546255","58.900-000","PB","CAJAZEIRAS","OASIS","AV.JULIO MARQUES","S/C");

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

            int i = Integer.parseInt(JOptionPane.showInputDialog(cadastro));

            switch (i) {
                case 1 -> {



                    funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
                    funcionario.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Matricula: ")));
                    funcionario.setCargo(JOptionPane.showInputDialog("Digite seu Cargo: "));
                    funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: ")));

                    JOptionPane.showMessageDialog(null,funcionario);
                    funcionario.ReajustarSalario();
                    JOptionPane.showMessageDialog(null,"salario com reajuste: " + funcionario.getSalario());



                }
                case 2 -> {
                    clienteFisico.setNomeCompleto(JOptionPane.showInputDialog("DIGITE SEU NOME:"));
                    clienteFisico.setCpf(JOptionPane.showInputDialog("DIGITE SEU CPF:"));
                    clienteFisico.setRg(JOptionPane.showInputDialog("DIGITE SEU RG:"));
                    clienteFisico.setOrgaoEmissor(JOptionPane.showInputDialog("DIGITE SEU ORGAO EMISSOR:"));
                    clienteFisico.setCep(JOptionPane.showInputDialog("DIGITE SEU CEP:"));
                    clienteFisico.setUf(JOptionPane.showInputDialog("DIGITE SEU UF:"));
                    clienteFisico.setBairro(JOptionPane.showInputDialog("DIGITE SEU BAIRRO:"));
                    clienteFisico.setLogradouro(JOptionPane.showInputDialog("DIGITE SEU LOGRADOURO:"));
                    clienteFisico.setComplemento(JOptionPane.showInputDialog("DIGITE SEU COMPLEMENTO:"));

                    JOptionPane.showMessageDialog(null,clienteFisico);


                }
                case 3->{
                    clienteJuridico.setRazaoSocial(JOptionPane.showInputDialog("DIGITE SUA RAZAO SOCIAL: "));
                    clienteJuridico.setNomeFantasia(JOptionPane.showInputDialog("DIGITE O NOME FANTASIA DA EMPRESA : "));
                    clienteJuridico.setCnpj(JOptionPane.showInputDialog("DIGITE SEU CPNJ :"));
                    clienteJuridico.setInscricaoEstatual(JOptionPane.showInputDialog("DIGITE SUA INSCRICAO ESTATUAL: "));
                    clienteJuridico.setIscricaoMunicipal(JOptionPane.showInputDialog("DIGITE SUA INSCRICAO MUNICIPAL :"));
                    clienteJuridico.setLogradouro(JOptionPane.showInputDialog("DIGITE SEU ENDERECO :"));
                    clienteJuridico.setBairro(JOptionPane.showInputDialog("DIGITE O BAIRRO:"));
                    clienteJuridico.setCep(JOptionPane.showInputDialog("DIGITE O CEP :"));
                    clienteJuridico.setComplemento(JOptionPane.showInputDialog("DIGITE O COMPLEMENTO :"));
                    clienteJuridico.setCidade(JOptionPane.showInputDialog("DIGITE A CIDADE:"));
                    clienteJuridico.setCep(JOptionPane.showInputDialog("DIGITE O CEP : "));
                    clienteJuridico.setUf(JOptionPane.showInputDialog("DIGITE A UF :"));
                }
                case 4 -> JOptionPane.showMessageDialog(null,funcionario);
                case 5 -> JOptionPane.showMessageDialog(null,clienteFisico);
                case 6 -> JOptionPane.showMessageDialog(null,clienteJuridico);
                case 7 ->{

                    cadastroProdutos.setNome(JOptionPane.showInputDialog("NOME DO PRODUTO "+nome));
                    cadastroProdutos.setPreco(Double.parseDouble(JOptionPane.showInputDialog("PRECO" + preco)));

                   int r1 = Integer.parseInt(JOptionPane.showInputDialog("Cadastrar mais produtos?\n  1-Sim\n  0-Não"));
                   if (r1 == 1){

                       cadastroProdutos.setNome(JOptionPane.showInputDialog("NOME DO PRODUTO "+nome));
                       cadastroProdutos.setPreco(Double.parseDouble(JOptionPane.showInputDialog("PRECO" + preco)));


                   }

                }
                case 8 -> JOptionPane.showMessageDialog(null,cadastroProdutos.toString());

                case 9 -> {
                    JOptionPane.showMessageDialog(null, "ATE LOGO");
                    System.exit(0);
                }

                default -> JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
            }
        }while(!retorna);

    }
}
