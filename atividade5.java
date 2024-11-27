import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número que você deseja saber o fatorial:");
        int numero = leitor.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            int resultado = 1;

            // Calcula o fatorial
            for (int i = 1; i <= numero; i++) {
                resultado *= i; 
            }

            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        leitor.close();
    }
}