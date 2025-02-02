package listaHeranca.ingresso;

public class Ingresso {
    protected float valor;

    public Ingresso(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public String getTipoIngresso(){
        return "INGRESSO NORMAL";
    }
}
