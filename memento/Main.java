package memento;

public class Main {
    public static void main(String[] args) {
        String[] sheat = new String[10];
        TextEditor textEditor = new TextEditor(sheat);
        textEditor.writeOnSheat("Arroz é  muito bom.");
        textEditor.writeOnSheat("Feijão também.");
        textEditor.writeOnSheat("Arroz carreteiro é muito superior.");
        textEditor.showSheat();
        textEditor.mementoZ(); // Não é.
        textEditor.showSheat();

        textEditor.writeOnSheat(5, "Nujabes só tem música ruim.");
        textEditor.writeOnSheat(8, "Que loucura esse cara tá escrevendo...");
        textEditor.showSheat();
        textEditor.mementoZ();
        textEditor.mementoZ();
        textEditor.showSheat();
        
        textEditor.writeOnSheat("Nujabes é a origem do Lo-fi.");
        textEditor.showSheat();
    }
}
