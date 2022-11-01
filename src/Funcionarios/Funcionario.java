package Funcionarios;

import Interfaces.IAutenticavel;

public class Funcionario {
    private int Matricula;
    private String Nome;
    private String cargo;
    private double salario;

    public Funcionario(int matricula, String nome, String cargo, double salario) {
        Matricula = matricula;
        Nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public  void ReajustarSalario(){
        if (this.cargo.equalsIgnoreCase("supervisor")){
            this.salario = this.salario * 1.10;
        } else if (this.cargo.equalsIgnoreCase("gerente")){
            this.salario = this.salario *1.05;
        }  else {
            this.salario = this.salario *1.01;

        }

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Matricula=" + Matricula +
                ", Nome='" + Nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }


}
