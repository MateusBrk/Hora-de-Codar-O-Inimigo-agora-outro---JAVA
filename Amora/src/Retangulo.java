import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        int base;
        float altura;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        base = entrada.nextInt();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        altura = entrada1.nextFloat();

        float calculo = base * altura;
        System.out.println("a área do retângulo é " + calculo);
    }
}
