import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        int numero;
        String agencia;
        String nome_Cliente;
        float saldo = random.nextFloat() * 100;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();
        System.out.println("Digite o nome do Cliente!");
        nome_Cliente = scanner.next();
        System.out.println("Digite o número da Conta!");
        agencia = scanner.next();
        

        System.out.println("Olá " + nome_Cliente + " , obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " , conta "+ numero + " e seu saldo "+ saldo + " já está disponível para saque.");
        scanner.close();
    }
}
