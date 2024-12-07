package lista01;
import java.util.ArrayList;

public class Agenda{
    private ArrayList<Contato> contacts = new ArrayList<Contato>();
    
    public void addContact(Contato contact){
        contacts.add(contact);
    }

    public void deleteContact(Contato contact){
        contacts.remove(contact);
        System.out.println("O contato " + contact + "foi removido!");
    }
    
    public void showContact(Contato contact){
        System.out.println("Nome: " + contact.getName() + " - email: " + contact.getEmail());
    }

    public void showAllContacts(){
        for (Contato contact : contacts) {
            showContact(contact);
        }
    }
}