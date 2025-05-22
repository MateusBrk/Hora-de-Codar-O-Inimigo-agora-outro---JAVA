import java.util.Scanner;

public class Paralelograma {
    public static void main(String[] args) {
        float base;
        float altura;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base do paralelograma: ");
        base = entrada.nextFloat();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a altura do paralelograma: ");
        altura = entrada1.nextFloat();

        float calculo = base * altura;
        System.out.println("a área do paralelograma é " + calculo);
    }
}
