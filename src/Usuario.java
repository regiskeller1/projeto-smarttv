public class Usuario {
    public static void main (String [] args){

        SmartTv smartTv = new SmartTv();

        smartTv.ligarTv();
        System.out.println("TV esta ligada? " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("TV esta ligada? " + smartTv.ligada);

        smartTv.proximoCanal();
        System.out.println("Qual canal esta? " + smartTv.canal);

        smartTv.alterarCanal(23);
        System.out.println("Qual canal esta? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);
    }
}
