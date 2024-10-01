import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Informe um numero para ser verificado se faz parte da sequencia de fibonacci ");
        int numero = scanner.nextInt();
        
        // Chama o método fibonacci e exibe o resultado
        if (Fibonacci.fibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}