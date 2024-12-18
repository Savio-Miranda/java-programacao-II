package lista02;

import java.util.ArrayList;

import lista02.questao01.Departamento;
import lista02.questao01.Pessoa;
import lista02.questao01.Universidade;
import lista02.questao02.Elevador;
import lista02.questao03.ControleRemoto;

public class Main {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano", "fulano@email.com", "9190000-0000");
        Pessoa ciclano = new Pessoa("Ciclano", "ciclano@email.com", "9191111-1111");
        Pessoa gerson = new Pessoa("Gerson", "gerson@email.com", "9192222-2222");
        Pessoa clodoaldo = new Pessoa("Clodoaldo", "clodoaldo@email.com", "9193333-3333");
        Pessoa patricia = new Pessoa("Patricia", "patricia@email.com", "9194444-4444");
        Pessoa jessica = new Pessoa("Jessica", "jessica@email.com", "9195555-5555");

        Pessoa[] depart01 = {fulano, ciclano};
        Pessoa[] depart02 = {gerson, clodoaldo};
        Pessoa[] depart03 = {patricia, jessica};
        
        ArrayList<Pessoa[]> pessoasAInserir = new ArrayList<Pessoa[]>();
        pessoasAInserir.add(depart01);
        pessoasAInserir.add(depart02);
        pessoasAInserir.add(depart03);
        
        Universidade universidade = new Universidade();
        universidade.setNome();
        for (int i = 0; i < 3; i++) {
            Departamento departamento = new Departamento();
            departamento.setNome();
            departamento.setPessoas(pessoasAInserir.get(i));
            universidade.setDepartamentos(departamento);
        }


        Elevador elevador = new Elevador();
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        elevador.desce(); // gerar erro
        elevador.sobe(); // Primeiro andar
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        elevador.setAndarMaisAlto(); // usuário dita qual o maior andar possível (último andar > 1)
        elevador.getAndarMaisAlto(); // verifica quantos andares possui
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        elevador.entra();
        System.out.println("Capacidade atual: " + elevador.getCapacidadeAtual());
        elevador.sai();
        elevador.sai(); // gerar erro

        System.out.println("_".repeat(30)); // separador no console

        ControleRemoto controleRemoto = new ControleRemoto();
        System.out.println("Volume atual: " + controleRemoto.getVolumeAtual());
        System.out.println("Canal atual: " + controleRemoto.getVolumeAtual());
        controleRemoto.aumentaVolume();
        controleRemoto.vaiParaCanalEspecifico();
        System.out.println("Canal atual: " + controleRemoto.getVolumeAtual());
        for (int i = 0; i < 30; i++) {
            controleRemoto.aumentaVolume();
        }
        System.out.println("Volume atual: " + controleRemoto.getVolumeAtual());
        for (int i = 10; i > 0; i--) {
            controleRemoto.diminuiVolume();
        }


    }
}
