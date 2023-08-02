public class SmartTv {
    boolean ligada = false;
    int canal = 2;
    int volume = 25;

    public void ligarTv(){

        this.ligada = true;
    }

    public void desligarTv(){

        this.ligada = false;
    }

    public void proximoCanal(){

        this.canal++;
    }

    public void aumentarVolume(){

        this.volume++;
    }

    public void diminuirVolume(){

        this.volume--;
    }

    public void alterarCanal(int canal){

        this.canal = canal;
    }

}
