package lista02.questao01;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String email;
    String telefone;
    Scanner scan = new Scanner(System.in);

    public Pessoa(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
