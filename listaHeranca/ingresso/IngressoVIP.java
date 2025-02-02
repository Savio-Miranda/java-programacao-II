package listaHeranca.ingresso;

public class IngressoVIP extends Ingresso{
    private float percentage;
    
    public IngressoVIP(float valor, float percentage) {
        super(valor);
        this.percentage = percentage;
    }

    @Override
    public float getValor(){
        return valor * (1 + percentage);
    }

    public float getPercentage(){
        return percentage;
    }

    public void setPercentage(float percentage){
        this.percentage = percentage;
    }

    @Override
    public String getTipoIngresso(){
        return "INGRESSO VIP";
    }
}
