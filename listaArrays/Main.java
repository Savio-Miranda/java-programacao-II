package listaArrays;

public class Main {
    public static void main(String args[]){
        int toRepeat = 40;
        //--------------------------------------------
        System.out.println("-".repeat(toRepeat));
        System.out.println("Questão 1");
        BackwardNumber.invertNumber();
        
        //--------------------------------------------
        System.out.println("-".repeat(toRepeat));
        System.out.println("Questão 2");
        System.out.println(IntSeries.product(1, 2, 3, 4, 5));
        System.out.println(IntSeries.product(10, 2, 1, 3));
        System.out.println(IntSeries.product(0, 100, 10000, 100000, 100000));
        System.out.println(IntSeries.product(-1, 2, -3, 4, -5));
        
        // -------------------------------------------
        System.out.println("-".repeat(toRepeat));
        System.out.println("Questão 3");
        int[] v1 = {2, 6, 7, 2, 2, 3, 9};
        int[] v2 = {4, 6, 2, 1, 6, 9, 2, 22, 50, 513};
        
        int[] v3 = new int[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }

        for (int i = v1.length; i < v3.length; i++) {
            v3[i] = v2[i - v1.length];
        }
        
        v3 = Set.vectorize(v3);
        
        for(int i = 0; i < v3.length; i++){
            System.out.print(v3[i] + " ");
        }
        
        System.out.println();
    }
}
