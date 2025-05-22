import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 - Baby Steps
        String Planeta = "Plutão";
        System.out.println(Planeta);

        // 2 -  Hello Clarice
        String nome = "Exemplo";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o seu nome: ");
        nome = entrada.next();

        // 3 - A Bit of Information
        int idade;
        System.out.println("Qual é o sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Olá, "+ nome + ", sua idade é "+ idade);
    }
}