public class Estudo {
    public static void main(String[] args) throws  Exception{

        //exemplo de if e else só que resumido e mais prático
        int a,b ;
        a = 6;
        b = 6;
        String resultado = a == b ? "true" : "false";
        System.out.println(resultado); 
        
        boolean y = true;

        boolean simNao = a == b;
        System.out.println("A e B são iguais? " + !simNao);

        String teste = a == b ? "Esses numeros sao iguais" : "Esses numero nao sao iguais";
        System.out.println(teste);


        String nomeUm = "Alencar";
        String nomeDois = new String("Alencar");

        System.out.println(nomeUm.equals(nomeDois));   //o .equals ele analisa o conteudo dentro da string!


        if (simNao && y){
               System.out.println("As duas condições são verdadeiras");
        }
        if (simNao || y){
            System.out.println("Uma das duas é verdadeira");
        }
        System.out.println("fim");

    }
}
