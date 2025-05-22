import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        float lado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextFloat();

        float calculo = lado * lado;
        System.out.println("a área do quadrado é " + calculo);
    }
}
