import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        float baseMaior;
        float baseMenor;
        float altura;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base maior do trapézio: ");
        baseMaior = entrada.nextFloat();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a base menor do trapézio: ");
        baseMenor = entrada1.nextFloat();

        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite a base menor do trapézio: ");
        altura = entrada1.nextFloat();

        float calculo = ((baseMenor + baseMaior) * altura) / 2;
        System.out.println("a área do trapézio é " + calculo);
    }
}
