package estudo.projeto.primeiro;

public class TvPrincipal {
   public static void main(String[] args) throws  Exception{
        SmartTv smartTv = new SmartTv();


        System.out.println("a tv está ligada? " + smartTv.ligada);
        System.out.println("volume da tv? " + smartTv.volume);
        System.out.println("qual o canal? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status: a tv está ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Status novo:volume da tv? " + smartTv.volume);

        smartTv.mudarCanal(40);
        System.out.println("qual o canal? " + smartTv.canal);
    }
}
