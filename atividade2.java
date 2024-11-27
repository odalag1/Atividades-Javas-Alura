import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println(
                "Qual área você deseja calcular? Digite 1 para calcular a área do círculo ou 2 para calcular a área do quadrado");
        numero = leitor.nextInt();

        if (numero == 1) {
            float pi = 0;
            float raio = 0;
            System.out.println("Área do círculo");
            System.out.print("Digite o valor adotado de pi: ");
            pi = leitor.nextFloat();
            System.out.print("Digite o valor do raio: ");
            raio = leitor.nextFloat();
            float areaDoCirculo = pi * (raio * raio);
            System.out.println("A área do círculo é: " + areaDoCirculo);
        } else if (numero == 2) {
            float lado = 0;
            System.out.println("Área do quadrado");
            System.out.print("Digite o lado do quadrado: ");
            lado = leitor.nextFloat();
            float areaDoQuadrado = lado * lado;
            System.out.println("A área do quadrado é: " + areaDoQuadrado);
        } else {
            System.out.println("Opção inválida! Por favor, escolha 1 para círculo ou 2 para quadrado.");
        }

        leitor.close();
    }
}
