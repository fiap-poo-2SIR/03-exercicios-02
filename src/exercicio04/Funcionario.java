package exercicio04;

import java.text.DecimalFormat;

public class Funcionario {
    // variáveis de instância
    String nome;
    String cargo;
    double salario;

    // método construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // método para aplicar um aumento com base em uma porcentagem
    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * porcentagem / 100;
    }
    // método para aplicar um aumento com base em uma porcentagem
    public void aumentarSalario(String cargo, double porcentagem) {
        if(this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * porcentagem / 100;
        }
    }

    // método para promover o funcionário
    public void promover(String novoCargo) {
        cargo = novoCargo;
    }

    // método para retornar os dados do objeto para impressão
    public String getDados() {
        DecimalFormat formato = new DecimalFormat("0.00");
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Cargo: " + cargo + "\n";
        aux += "Salário R$ : " + formato.format(salario) + "\n";
        return aux;
    }

}
