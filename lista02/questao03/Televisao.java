package lista02.questao03;

public class Televisao implements TelevisaoInterface {
    private int volume;
    private int canal;
    private int volumeMaximo;
    private int totalDeCanais;

    public Televisao(int volume, int canal){
        this.volume = volume;
        this.canal = canal;
        this.volumeMaximo = 100;
        this.totalDeCanais = 15;

    }

    @Override
    public int getVolumeAtual(){
        return volume;
    }

    @Override
    public void setVolumeAtual(int volumeAInserir){
        volume = volumeAInserir;
    }
    
    @Override
    public int getCanalAtual(){
        return canal;
    }

    @Override
    public void setCanalAtual(int canalAInserir){
        canal += canalAInserir;
    }

    @Override
    public int getVolumeMaximo(){
        return volumeMaximo;
    }

    @Override
    public int getTotalDeCanais(){
        return totalDeCanais;
    }
}
