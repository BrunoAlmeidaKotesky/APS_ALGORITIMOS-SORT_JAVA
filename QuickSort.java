
public class QuickSort {
    private static SortUtils utils = new SortUtils();

    public QuickSort(int[] array) {
        QuickSort.sort(array, 0, array.length - 1);
        utils.imprimir("Quick Sort");
    }

    public static void sort(int[] arr, int low, int high) {
        if (utils.comparaMenor(low, high)) {
            int pivot = dividir(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    private static int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];
        while (pontEsq <= pontDir) {
            utils.comparacoes++;

            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                utils.comparacoes++;
                pontEsq++;
            }

            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                utils.comparacoes++;
                pontDir--;
            }

            if (pontEsq < pontDir) {
                utils.comparacoes++;
                utils.troca(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        utils.troca(vetor, inicio, pontDir);
        return pontDir;
    }

}
