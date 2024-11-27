import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        System.out.print("Digite o numero para saber se ele é impar ou par: ");
        numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + "é par");
        } else {
            System.out.println("O numero " + numero + "é impar");
        }
        leitor.close();
    }
}
