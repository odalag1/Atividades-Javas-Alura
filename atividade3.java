import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        System.out.print("Digite um número para ver sua tabuada: ");
        numero = leitor.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        leitor.close();
    }
}
