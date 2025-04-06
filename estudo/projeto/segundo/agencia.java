package estudo.projeto.segundo;

import java.util.Scanner;

public class agencia {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da agencia");
        String numeroAgencia = scanner.nextLine();
        
        if (isInteger(numeroAgencia)) {
            System.out.println("Digite o numero da conta: ");
        } else {
            System.out.println("Houve algum erro!");
        }
        String numero = scanner.nextLine();

        if(isInteger(numero)){
            System.out.println("Digite o nome do cliente:");
        } else {
            System.out.println("Houve um erro!");
        }

       String nomeCliente;

        while (true){
            
            nomeCliente = scanner.nextLine();
            if (noInteger(nomeCliente)) {
                System.out.println("houve um erro!");
          } else {
             System.out.println("Digite seu saldo:");
             break;
          }
  
         }
       

         String saldo = scanner.nextLine();
         if (isInteger(saldo)){
            System.out.println("numero da agência: " + numeroAgencia);
            System.out.println("numero da conta: " + numero);
            System.out.println("nome do cliente: " + nomeCliente);
            System.out.println("Saldo: " + saldo);

         }
    }
    public static Boolean isInteger(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }   
    }

    public static Boolean noInteger(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
}