public class InsertionSort {
    private static SortUtils utils = new SortUtils();
    
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            utils.comparacoes++;
            while (j > 0 && arr[j - 1] > arr[j]) {
                if(arr[j-1]>arr[j])
                    utils.comparacoes++;
                utils.troca(arr, i, j);
                j--;
            }
        }
        utils.imprimir("InsertionSort");
    }
}
