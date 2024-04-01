import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double n1, n2;

        do {
            System.out.println("Escolha a operação desejada: ");
            System.out.println("1. Soma ");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro número: ");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                n2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da Soma: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado da Subtração: " + (n1 - n2));
                        break;
                    case 3:
                        if (n2 != 0) {
                            System.out.println("Resultado da Divisão: " + (n1 / n2));
                        } else {
                            System.out.println("Erro: Divisão por zero.");
                        }
                        break;
                    case 4:
                        System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
