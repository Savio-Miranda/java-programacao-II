package listaArrays;
/*
2) Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados para
método product utilizando uma lista de argumentos de comprimento variável. Teste seu
método com várias chamadas, cada uma com um número diferente de argumentos.
*/

public class IntSeries {
    public static float product(int... series) {
        float p = 1;
        for (int i = 0; i < series.length; i++) {
            p *= series[i];
        }
        return p;
    }    
}
