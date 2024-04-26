import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solicitaremos algumas informações para armazenar sua conta.");

        // Solicitar e armazenar número da conta usando método de ContaTerminal
        int numeroConta = ContaTerminal.lerNumeroConta(scanner);

        // Solicitar e armazenar agência da conta usando método de ContaTerminal
        String agenciaConta = ContaTerminal.lerAgenciaConta(scanner);

        // Solicitar e armazenar nome do usuário usando método de ContaTerminal
        String nomeUsuario = ContaTerminal.lerNomeUsuario(scanner);

        // Solicitar e armazenar saldo inicial usando método de ContaTerminal
        double saldoInicial = ContaTerminal.lerSaldoInicial(scanner);

        // Exibir mensagem personalizada com os dados fornecidos
        System.out.println("\nOlá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoInicial + " já está disponível para saque.");

        scanner.close();
    }
}
