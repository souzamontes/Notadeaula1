import java.util.Scanner

public class Escola{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua Primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.println("Informe a sua Segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.println("Informe a sua Terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media > 70) {
            System.out.println("Aprovado");
        } else if (media < 40) {
            System.out.println("Reprovado");

        }else {
            System.out.println("Final");
        }

    }


}