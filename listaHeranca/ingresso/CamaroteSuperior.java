package listaHeranca.ingresso;

public class CamaroteSuperior extends IngressoVIP {
    private String localizacao;

    // Construtor que recebe um IngressoVIP existente
    public CamaroteSuperior(IngressoVIP ingressoVIP) {
        super(ingressoVIP.getValor(), ingressoVIP.getPercentage()); // Reutiliza os valores do ingresso VIP
        this.localizacao = "Camarote Superior";
    }

    public String getLocalizacao() {
        return localizacao;
    }
}