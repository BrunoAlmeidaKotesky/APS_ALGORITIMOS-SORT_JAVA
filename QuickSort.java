
public class QuickSort {
    private static SortUtils utils = new SortUtils();
    public QuickSort(int[] array) {
        QuickSort.sort(array, 0, array.length - 1);
        utils.imprimir("Quick Sort");
    }
    
    public static void sort(int[] arr, int low, int high) {
        if (utils.comparaMenor(low, high)) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                utils.comparacoes++;
                i++;
                utils.troca(arr, i, j);
            }
        }
        utils.troca(arr, i + 1, high);
        return i + 1;
    }    
}