public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    //Metodo para LIGAR TV
    public void ligar(){
        ligada = true;
    }

    //Metodo para DESLIGAR TV
    public void desligar(){
        ligada = false;
    }

    //Metodo para AUMENTAR Volume
    public void aumentarVolume(){
        volume++;
    }

    //Metodo para DIMINUIR Volume
    public void dominuirVolume(){
        volume--;
    }

    //Metodo para AUMENTAR Canal
    public void aumentarCanal(){
        canal++;
    }

    //Metodo para DIMINUIR Canal
    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
