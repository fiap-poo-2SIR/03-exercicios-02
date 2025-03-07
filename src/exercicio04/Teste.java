package exercicio04;

public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        // instanciando 3 objetos do tipo Funcionario
        funcionarios[0] = new Funcionario("Patrícia", "professora", 32000);
        funcionarios[1] = new Funcionario("Age", "coordenador", 65000);
        funcionarios[2] = new Funcionario("Belizario", "professor", 25000);

        // dados armazenados no vetor
        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getDados());
            System.out.println();
        }

        // aplicando 10% de aumento em cada salário
        for(int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].aumentarSalario(10);
        }

        // impressão dos salários atualizados
        System.out.println();
        for(Funcionario f : funcionarios) {
            System.out.println(f.getDados());
        }

    }
}
