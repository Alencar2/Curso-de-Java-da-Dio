package alencar.PrimeiraSemana;
public class App {
    public static void main(String[] args) throws Exception{
        

        final String BR = "Brasil";
        int ano = 2021;
        ano = 2022;
        int eita = 22;
        System.out.println(BR);
        System.out.print(ano);
        System.out.print("   ");
        System.out.println ( ano + eita);

        String primeiroNome = "Alencar";
        String segundoNome = "Borges";
               //variavel       método
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);

        int primeiroNumero = 20;
        int segundoNumero = 50;

        int somar = somar(primeiroNumero, segundoNumero);
        System.out.println(somar);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    public static int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
}            
// Esquema de como funciona as classes

