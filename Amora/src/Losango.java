import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        float diagonalMaior;
        float diagonalMenor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a diagonal maior do losango: ");
        diagonalMaior = entrada.nextFloat();

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite a diagonal menor do losango: ");
        diagonalMenor = entrada1.nextFloat();

        float calculo = (diagonalMenor * diagonalMaior) / 2;
        System.out.println("a área do losango é " + calculo);
    }
}
