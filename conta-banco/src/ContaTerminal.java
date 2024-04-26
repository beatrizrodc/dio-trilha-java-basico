import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scan.next();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scan.next();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.print("Digite o seu saldo: ");
        float saldo = scan.nextFloat();

        //Imprime a mensagem no terminal
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e o seu saldo de " + saldo + " já está disponível para saque.");
        
        scan.close();
    }
}
