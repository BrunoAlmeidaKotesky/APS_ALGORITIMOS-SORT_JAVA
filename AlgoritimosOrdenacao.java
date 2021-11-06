
public class AlgoritimosOrdenacao {    

   public static void main(String[] args) {
        benchmarkInsertionSort();
        benchmarkSelectionSort();
        benchmarkQuickSort();
   }

    public static void benchmarkInsertionSort() {
        int[] arr = {5,15,9,3,5,8,0,3,5,6,3,1,4,7,12};
        long inicio = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort();        
        insertionSort.sort(arr);
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    public static void benchmarkSelectionSort() {
        int[] arr = {5,15,9,3,5,8,0,3,5,6,3,1,4,7,12};
        long inicio = System.currentTimeMillis();
        SelectionSort selectionSort = new SelectionSort();        
        selectionSort.sort(arr);
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    public static void benchmarkQuickSort() {
        int[] arr = {5,15,9,3,5,8,0,3,5,6,3,1,4,7,12,6,3,6,9,3,3,6,853,243,6};
        long inicio = System.currentTimeMillis();
        new QuickSort(arr);        
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    private static void printFinal(long inicio) {
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
