package estudo.projeto.primeiro;

public class SmartTv {
    boolean ligada = false;
    int volume = 1;
    int canal = 1;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
    }
    public void abaixarVolume(){
        volume --;
    }
}