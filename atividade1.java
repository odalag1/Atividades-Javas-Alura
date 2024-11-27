import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        if (numero == numero2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.print("Os números são diferentes. ");

            if (numero > numero2) {
                System.out.println("O número " + numero + " é maior que o número " + numero2 + ".");
            } else {
                System.out.println("O número " + numero2 + " é maior que o número " + numero + ".");
            }
        }

        leitor.close();
    }
}