
public class SortUtils {
    public int comparacoes = 0;
    public int trocas = 0;

    public boolean comparaMenor(int left, int right) {
        comparacoes++;
        return left < right;
    }

    public boolean comparaMaior(int left, int right) {
        comparacoes++;
        return left > right;
    }

    public void troca(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        trocas++;
    }

    public void imprimir(String sortType) {
        System.out.println("\n" + sortType + ":");
        System.out.print(": Trocas = ");
        System.out.print(trocas);
        System.out.print(" Comparações = ");
        System.out.println(comparacoes);
    }
}
