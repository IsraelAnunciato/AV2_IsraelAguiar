import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("caminho/para/seu/arquivo.txt"));
            int[][] matrix1 = new int[3][3];
            int[][] matrix2 = new int[3][3];
            
            // Lendo as matrizes do arquivo
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (scanner.hasNextInt()) {
                        matrix1[i][j] = scanner.nextInt();
                    }
                }
                
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (scanner.hasNextInt()) {
                        matrix2[i][j] = scanner.nextInt();
                    }
                }
            }
            
         // Imprimindo o resultado
            System.out.println("Resultado da multiplicação das matrizes:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}