package Questao02;
import java.util.Scanner;

public class VerificarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário uma string
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();
        
        // Variável para contar quantas vezes a letra 'a' ou 'A' aparece
        int contador = 0;
        
        // Itera sobre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            
            // Verifica se o caractere é 'a' ou 'A'
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }
        
        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}
