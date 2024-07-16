public class SmartTv {
    boolean ligada = false;
    int canal = 1;  // primeiramente estou colocando as características da minha Tv
    int volume = 25;  // como canal, volume e o estado de estar ligado
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1        
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        //volume = volume - 1
        
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        //canal = canal + 1;
        canal++;
    }

    public void descerCanal(){
        //canal = canal - 1;
        canal--;
    }
    
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}