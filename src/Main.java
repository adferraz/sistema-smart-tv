public class Main {
    public static void main(String[] args) {


        SmartTv smartTv = new SmartTv();

        //Estado atual da TV
        System.out.println("TV LIGADA?: " + smartTv.ligada);
        System.out.println("CANAL ATUAL: " + smartTv.canal);
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
        System.out.println();

        //Funcao para ligar TV
        smartTv.ligar();
        System.out.println("TV LIGADA?: " + smartTv.ligada);
        System.out.println();

        //Funcao para aumentar e diminuir volume
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
        smartTv.dominuirVolume();
        System.out.println("DIMINUIU VOLUME: " + smartTv.volume);
        smartTv.dominuirVolume();
        System.out.println("DIMINUIU VOLUME: " + smartTv.volume);
        smartTv.dominuirVolume();
        System.out.println("DIMINUIU VOLUME: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
        System.out.println();

        //Funcao para mudar canal
        System.out.println("CANAL ATUAL: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("MUDOU CANAL: " + smartTv.canal);
    }

}