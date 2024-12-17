// import java.util.ArrayList;

// import animalia.Animal;
// import animalia.Cat;
// import animalia.Tatu;
// import lista01.Questao03;
// import lista01.Questao04;
// import lista01.Questao05;
// import lista01.Questao06;
// import lista01.Agenda;
// import lista01.Contato;
import validadorCPF.CPF;

public class Main {
    public static void main(String[] args) throws Exception{
        CPF cpf = new CPF("13081262046");
        System.out.println(cpf.getCPF());
        
        // Cat cat = new Cat();
        // Tatu tatu = new Tatu();
        
        // ArrayList<Animal> lotsOfAnimals = new ArrayList<Animal>();
        // lotsOfAnimals.add(cat);
        // lotsOfAnimals.add(tatu);

        // for (Animal animal : lotsOfAnimals){
        //     animal.eating();
        //     animal.makeNoise();
        // }
        // int division = 50;
        
        // System.out.println("Questão 03:");
        // Questao03.maiorEntreEles(30, 29);
        // System.out.println("-".repeat(division));

        // System.out.println("Questão 04:");
        // Questao04.imprimeAteN(30);
        // System.out.println("-".repeat(division));

        // System.out.println("Questão 05:");
        // Questao05.somarNumerosImparesUmATrinta();
        // Questao05.multiplicarNumerosParesUmATrinta();
        // System.out.println("-".repeat(division));

        // System.out.println("Questão 06:");
        // Questao06 questao6 = new Questao06(10, 20, "abc", "cba");
        // questao6.trocarValorPrimitivasSemTemp();
        // questao6.trocarStringSemTemp();
        // System.out.println("-".repeat(division));

        // System.out.println("Questão 07:");
        // Contato contatoA = new Contato("Sávio", "savio@email.com");
        // Contato contatoB = new Contato("Reginaldo", "reginaldo@email.com");
        // Contato contatoC = new Contato("João", "joão@email.com");
        // Agenda agenda = new Agenda();
        // agenda.addContact(contatoA);
        // agenda.addContact(contatoB);
        // agenda.addContact(contatoC);
        // agenda.showAllContacts();
        // agenda.deleteContact(contatoC);
        // agenda.showAllContacts();
        // agenda.showContact(contatoA);
    }
}
