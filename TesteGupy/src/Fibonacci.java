public class Fibonacci {
    // Função que calcula se um número está na sequência de Fibonacci
    public static boolean fibonacci(int numeros) {
        if (numeros == 0 || numeros == 1) {
            return true;
        }

        int prev = 0, current = 1, next;

        // Gera os números da sequência de Fibonacci até encontrar o número ou ultrapassá-lo
        while (current < numeros) {
            next = prev + current;
            prev = current;
            current = next;
        }

        // Se o número gerado for igual ao número informado, ele pertence à sequência
        return current == numeros;
    }
}