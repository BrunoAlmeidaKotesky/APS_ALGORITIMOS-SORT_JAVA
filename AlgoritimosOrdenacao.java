import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AlgoritimosOrdenacao {

    public static void main(String[] args) {
        int[] primeiroArray = readFile("1000_numbers.txt");
        int[] segundoArray = readFile("5000_numbers.txt");
        int[] terceiroArray = readFile("10000_numbers.txt");
        System.out.println("Primeira Execução: \n");
        benchmarkInsertionSort(primeiroArray);
        benchmarkSelectionSort(primeiroArray);
        benchmarkQuickSort(primeiroArray);
        System.out.println("Segunda Execução: \n");
        benchmarkInsertionSort(segundoArray);
        benchmarkSelectionSort(segundoArray);
        benchmarkQuickSort(segundoArray);
        System.out.println("Terceira Execução: \n");
        benchmarkInsertionSort(terceiroArray);
        benchmarkSelectionSort(terceiroArray);
        benchmarkQuickSort(terceiroArray);
    }

    private static int[] readFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            int[] numbers = lines.stream().mapToInt(Integer::parseInt).toArray();
            return numbers;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void benchmarkInsertionSort(int[] arr) {
        long inicio = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    public static void benchmarkSelectionSort(int [] arr) {
        long inicio = System.currentTimeMillis();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    public static void benchmarkQuickSort(int[] arr) {
        long inicio = System.currentTimeMillis();
        new QuickSort(arr);
        AlgoritimosOrdenacao.printFinal(inicio);
    }

    private static void printFinal(long inicio) {
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
