package lista01;

// Escreva um método que receba dois números inteiros e imprima o maior entre eles.

public class Questao03 {
    public static void maiorEntreEles(int a, int b){
        if(a > b){
            System.out.println(a + " é o maior dentre " + a + " e " + b);
        } if (a < b){
            System.out.println(b + " é o maior dentre " + a + " e " + b);
        } else{
            System.out.println(a + " e " + b + " são iguais");
        }
    }
}
