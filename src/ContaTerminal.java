import java.util.Scanner;

public class ContaTerminal {
    // Método para ler e retornar o número da conta como um inteiro
    public static int lerNumeroConta(Scanner scanner) {
        while (true) {
            System.out.println("Digite o número da conta: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número inteiro válido para o número da conta.");
            }
        }
    }

    // Método para ler e retornar a agência da conta como uma string
    public static String lerAgenciaConta(Scanner scanner) {
        System.out.println("Digite sua agência bancária: ");
        return scanner.nextLine();
    }

    // Método para ler e retornar o nome do usuário como uma string
    public static String lerNomeUsuario(Scanner scanner) {
        System.out.println("Digite seu nome: ");
        return scanner.nextLine();
    }

    // Método para ler e retornar o saldo inicial como um double
    public static double lerSaldoInicial(Scanner scanner) {
        System.out.println("Qual é seu saldo inicial? ");
        return Double.parseDouble(scanner.nextLine());
    }
}
