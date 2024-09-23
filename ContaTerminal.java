import java.util.Scanner;

public class ContaTerminal{
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome");
        String nome = input.next();
        
        System.out.println("Por favor, digite seu sobrebome");
        String sobrenome = input.next();
        
        String nomeCliente = nome +" "+ sobrenome;
        
        System.out.println("Por favor, digite a agência");
        String agencia = input.next();
        
        System.out.println("Por favor, digite o número");
        int numero = input.nextInt();
        
        System.out.println("Por favor, digite o saldo");
        double saldo = input.nextDouble();
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque");
    }
}