package lista02.questao03;

import java.util.Scanner;

public class ControleRemoto {
    private final Televisao televisao = new Televisao(0, 0);
    private Scanner scan = new Scanner(System.in);

    int volumeMaximo = televisao.getVolumeMaximo();
    int totalDeCanais = televisao.getTotalDeCanais();

    public int getVolumeAtual(){
        return televisao.getVolumeAtual();
    }

    public int getCanalAtual(){
        return televisao.getCanalAtual();
    }

    public void aumentaVolume(){
        int volume = televisao.getVolumeAtual();
        if(televisao.getVolumeAtual() >= volumeMaximo){
            System.out.println("O volume já está no máximo!");
            return;
        }
        volume += 1;
        televisao.setVolumeAtual(volume);
    }

    public void diminuiVolume(){
        int volume = televisao.getVolumeAtual();
        if(televisao.getVolumeAtual() <=0){
            System.out.println("O volume já está no mudo!");
            return;
        }
        volume -= 1;
        televisao.setVolumeAtual(volume);
    }

    public void mudaDeCanalPositivamente(){
        int canal = televisao.getCanalAtual();
        if(televisao.getCanalAtual() >= totalDeCanais){
            televisao.setCanalAtual(0);
            return;
        }
        canal += 1;
        televisao.setCanalAtual(canal);
    }

    public void mudaDeCanalNegativametne(){
        int canal = televisao.getCanalAtual();
        if(televisao.getCanalAtual() < totalDeCanais){
            televisao.setCanalAtual(totalDeCanais);
            return;
        }
        canal -= 1;
        televisao.setCanalAtual(canal);
    }

    public void vaiParaCanalEspecifico(){
        int verificarCanal = scan.nextInt();
        if (verificarCanal > totalDeCanais || verificarCanal < 0){
            System.out.println("Este canal não está no catálogo de sua TV!");
            return;
        }
        televisao.setCanalAtual(verificarCanal);
    }
}
