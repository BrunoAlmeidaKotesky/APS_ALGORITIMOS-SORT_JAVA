public class InsertionSort {
    private static SortUtils utils = new SortUtils();

    public static int[] sort(int arr[]) {
        for (int i=1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > key) {
                utils.comparacoes++;
                arr[j+1] = arr[j];
                j = j-1;
                utils.trocas++;
            }
            arr[j+1] = key;
            utils.trocas++;
        }
        utils.imprimir("InsertionSort");
        return arr;
    }

}
