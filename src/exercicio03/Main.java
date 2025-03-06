package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        // entrada de dados
        System.out.println("Informe as coordenadas do ponto 1:");
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();
        System.out.println("Informe as coordenadas do ponto 2:");
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        // impressão da distância entre os dois pontos
        System.out.println("distância do p1 para o p2: " + df.format(p1.calcularDistancia(p2)));
        System.out.println("distância do p2 para o p1: " + df.format(p2.calcularDistancia(p1)));

        // impressão da distância de cada ponto até a origem
        System.out.println();
        System.out.println("distância do p1 até a origem: " + df.format(p1.calcularDistanciaAteOrigem()));
        System.out.println("distância do p2 até a origem: " + df.format(p2.calcularDistanciaAteOrigem()));

        // impressão do ponto mais próximo da origem
        System.out.println();
        Ponto aux = Ponto.maisProximoDaOrigem(p1, p2);
        System.out.println("ponto mais próximo: " + aux.formatarPonto());
    }
}
