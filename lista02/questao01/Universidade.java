package lista02.questao01;

import java.util.ArrayList;
import java.util.Scanner;

/*
Fazer um programa com as seguintes características:
◦ Faça com que haja uma associação entre Universidade e Departamento (Universidade
“contém” Departamento).
◦ Fazer com que uma Universidade possa ter 10 Departamentos.
◦ Criar, pelo menos, 3 departamentos e 2 pessoas por departamento
 */
public class Universidade {
    private Scanner scan = new Scanner(System.in);
    private String nome;
    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>(10);

    public void setNome(){
        this.nome = scan.nextLine();
    }

    public String getNome(){
        return nome;
    }
    
    public void setDepartamentos(Departamento departamento){
        if(departamentos.size() >= 10){
            System.out.println("A universidade está com o número máximo de departamentos!");
            return;
        }
        departamentos.add(departamento);
    }

    public ArrayList<Departamento> getDepartamento(){
        return departamentos;
    }

}
