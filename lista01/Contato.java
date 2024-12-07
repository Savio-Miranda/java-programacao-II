package lista01;

// /*Crie uma classe “Contato” que possui dois atributos: nome e e-mail do tipo String. Crie
// outra classe, chamada “Agenda”, que possui um atributo contatos do tipo vetor de
// “Contato”. A classe “Agenda” deve conter um método para adicionar um novo contato em
// uma posição vazia do vetor, outro método para buscar um contato (retorna uma instância de
// “Contato”) através do nome e, por fim, um método para excluir um contato através do nome*/

public class Contato {
    String nome, email;
    public Contato(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public String getName(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
}

