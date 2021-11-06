
public class SelectionSort {
    private static SortUtils utils = new SortUtils();

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (utils.comparaMenor(arr[j], arr[min])) {
                    min = j;
                }
            }
            utils.troca(arr, i, min);
        }
        utils.imprimir("Selection Sort");
    }
}