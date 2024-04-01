import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair;
        do {
            System.out.println("Bases do funcionário :");

            System.out.println("Matrícula: ");
            int matricula = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nome completo: ");
            String nome = scanner.nextLine();

            System.out.println("Salário bruto: ");
            double salarioBruto = scanner.nextDouble();

            double descontoINSS = salarioBruto * 0.15;
            double salarioLiquido = salarioBruto - descontoINSS;

            System.out.println("Matrícula:" + matricula);
            System.out.println("Nome completo:" + nome);
            System.out.println("Salário Bruto: R$" + salarioBruto);
            System.out.println("Dedução INSS: R$" + descontoINSS);
            System.out.println(" Salário Líquido: R$" + salarioLiquido);

            System.out.println("Insira 0 para repetir:");
            sair = scanner.nextInt();
        }while (sair == 0);
        System.out.println("Programa finalizado");
    }
}