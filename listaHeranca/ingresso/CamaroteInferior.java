package listaHeranca.ingresso;

public class CamaroteInferior extends IngressoVIP {
    private String localizacao;

    // Construtor que recebe um IngressoVIP existente
    public CamaroteInferior(IngressoVIP ingressoVIP) {
        super(ingressoVIP.getValor(), ingressoVIP.getPercentage()); // Reutiliza os valores do ingresso VIP
        this.localizacao = "Camarote Inferior";
    }

    public String getLocalizacao() {
        return localizacao;
    }
}