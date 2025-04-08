package estudo.projeto.terceiro;



public class contador {
    public  void main(String[] args) throws Exception{
        

        try {
         contar (20,60);
         System.out.println("tudo certo!" );
        } catch (InvalidoException e) {
            System.out.println("Erro o segundo parametro deve ser maior que o primeiro" );
        }

    }
    class InvalidoException extends Exception {
        public InvalidoException(String message) {
            super(message);
        }
    }

    void  contar (int parametroUm, int parametroDois) throws InvalidoException {
    int resultado = parametroDois - parametroUm;
    for (int i = parametroUm; i <= resultado; i++){

        System.out.println(i);
    }
    if (resultado<0 ){
        throw new InvalidoException("Resultado não pode ser negativo!");
    }
   }
}