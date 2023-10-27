import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static HashMap<String, String> users = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Cadastre\n2. Login\nEscolha uma opção:");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            if (option == 1) {
                System.out.println("Digite o login:");
                String login = scanner.nextLine();
                System.out.println("Digite a senha:");
                String password = scanner.nextLine();
                users.put(login, password);
            } else if (option == 2) {
                System.out.println("Digite o login:");
                
                String login = scanner.nextLine();
                System.out.println("Digite a senha:");
                String password = scanner.nextLine();
                if (password.equals(users.get(login))) {
                    System.out.println("SUCESSO");
                } else {
                    System.out.println("FRACASSO");
                }
            }
        }
    }
}