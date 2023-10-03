import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;
        String agencia = "067-8";
        
        System.out.print("Por favor, digite o número da Agência:");
        int numero = sc.nextInt();           
    
        if (numero == 1021 ) {
                String nome = "MARIO ANDRADE";
                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        } else {
                System.out.println("Olá, infelizmente não encontramos sua conta.");

        }
          
    }
}
