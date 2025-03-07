package exercicio04;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f;
        String nome, cargo;
        double salario, porcentagem;

        // entrada de dados e instanciação do funcionário
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Cargo: ");
        cargo = sc.next();
        System.out.print("Salário: ");
        salario = sc.nextDouble();
        f = new Funcionario(nome, cargo, salario);

        // aumento de salário de acordo com uma porcentagem
        System.out.print("\nPorcentagem de aumento do salário: ");
        porcentagem = sc.nextDouble();
        f.aumentarSalario(porcentagem);
        System.out.println("Salário R$ " + f.salario);
    }
}
