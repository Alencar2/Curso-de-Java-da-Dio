public class teste {
    public  void main(String[] args) throws Exception {
       try {
       contar (20, 100);
       System.out.println("Deu tudo certo");
           
       } catch (InvalidoException e) {
        System.out.println("Erro o segundo parametro deve ser maior que o primeiro" );
       }

    }
    class InvalidoException extends Exception {
        public InvalidoException(String message) {
            super(message);
        }
    }

    public  void contar(int parametroUm, int parametroDois) throws InvalidoException{  
        int resultado = parametroDois - parametroUm;

        for(int i = parametroUm; resultado >= i; i++){
            System.out.println(i);
        }if (resultado < 0 ){
            throw new InvalidoException("Resultado não pode ser negativo!");
        }
    }
}
