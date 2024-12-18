package lista02.questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Departamento {
    private Scanner scan = new Scanner(System.in);
    private String nome;
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(2);

    public void setNome(){
        System.out.println("Forneça um nome para o departamento:");
        nome = scan.nextLine();
    }

    public String getNome(){
        return nome;
    }

    public void setPessoas(Pessoa[] pessoasParaAdicionar){
        for (Pessoa pessoa : pessoasParaAdicionar) {
            pessoas.add(pessoa);
        }
    }

    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }
}
