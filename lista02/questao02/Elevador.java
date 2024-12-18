package lista02.questao02;
/*
Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no
prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:

*/

import java.util.Scanner;

public class Elevador {
    private int ultimoAndar;
    private int capacidadeMaxima;
    private int andarAtual = 0;
    private int capacidadeAtual = 0;
    private Scanner scan = new Scanner(System.in);

    public void entra(){
        if(capacidadeAtual >= capacidadeMaxima){
            System.out.println("Desculpe, senhor(a)! Não há mais capacidade no elevador!");
            return;
        }
        capacidadeAtual += 1;
    }

    public void sai(){
        if(capacidadeAtual <= 0){
            System.out.println("Não há mais ninguém no elevador...");
            return;
        }
        capacidadeAtual -= 1;
    }

    public void sobe(){
        if(andarAtual >= ultimoAndar){
            System.out.println("Já estamos no topo...");
        }
        System.out.println("Subindo...");
        andarAtual += 1;
    }

    public void desce(){
        if(andarAtual <= 0){
            System.out.println("Já estamos no térreo...");
            return;
        }
        System.out.println("Descendo...");
        andarAtual -= 1;
    }

    public void setAndarMaisAlto(){
        System.out.print("Quantidade total de andares (exceto térreo): ");
        ultimoAndar = scan.nextInt();
        while (ultimoAndar < 1) {
            System.out.print("O último andar precisa ser no mínimo 1. Tente novamente: ");
            ultimoAndar = scan.nextInt();
        }

    }
    
    public int getAndarMaisAlto(){
        return ultimoAndar;
    }

    public void setCapacidadeMaxima(){
        System.out.print("Capacidade máxima do elevador: ");
        capacidadeMaxima = scan.nextInt();
    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }

    public void setAndarAtual(){
        System.out.print("Ir para qual andar? (0 = térreo, " + ultimoAndar + " = último andar): ");
        int andar = scan.nextInt();
        if(andar > andarAtual){
            for (int i = andarAtual; i < andar ; i++) {
                sobe();
            }
        } if (andar < andarAtual) {
            for (int i = andarAtual; i > andar; i--) {
                desce();
            }
        } else {
            System.out.println("Já estamos neste andar...");
        }
    }
    
    public int getAndarAtual(){
        return andarAtual;
    }

    public void setCapacidadeAtual(){
        System.out.println("Quantas pessoas entram de uma vez?");
        capacidadeAtual = scan.nextInt();
        for (int i = 1; i < capacidadeMaxima; i++) {
            entra();
        }
    }
    
    public int getCapacidadeAtual(){
        return capacidadeAtual;
    }
}
