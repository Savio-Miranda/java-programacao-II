package listaControle;

import listaControle.library.Library;

public class Main {
    public static void main(String[] args) {
        Week.returnsWeekDay();
        Month.monthBelongsToSemester();
        Operations.operate();
        Euler.getEuler();
        Library library = new Library();
        library.addBook("O Hobbit", "J. R. R. Tolkien", 1937);
        library.addBook("As Crônicas de Gelo e Fogo: O Festim dos Corvos", "G. R. R. Martin");
        library.addBook("Irmã Morte");
        library.showCollection();
    }
}
