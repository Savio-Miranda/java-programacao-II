package listaArrays;

public class Set {
    public static boolean findRepeated(int[] vector, int n){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int[] vectorize(int[] v1){
        int[] aux = new int[v1.length];
        int count = 0;
        for (int i = 0; i < v1.length; i++) {
            if (!findRepeated(aux, v1[i])) {
                aux[i - count] = v1[i];
            } else {
                count += 1;
            }
        }
        int[] v3 = new int[aux.length - count];

        for (int i = 0; i < aux.length - count; i++) {
            v3[i] = aux[i];
        }
        return v3;
    }
}
