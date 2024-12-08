package lista01;

//Escreva um programa que imprima na tela a soma dos números ímpares entre 1 e 30 e a
//multiplicação dos números pares entre 1 e 30.

public class Questao05{
    public static void somarNumerosImparesUmATrinta(){
        int contador = 0;
        for (int i = 1; i < 31; i++) {
            if(i%2 != 0){
                contador += i;
            }

        }
        System.out.println("Números ímpares somados: " + contador);
    }

    public static void multiplicarNumerosParesUmATrinta(){
        double contador = 1;
        for (double i = 1; i < 31; i++) {
            if(i%2 == 0){
                contador *= i;
            }
        }
        System.out.println("Números pares multiplicados: " +contador);
    }
}