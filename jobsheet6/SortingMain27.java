package jobsheet6;

public class SortingMain27 {

public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62};
        Sorting27 sorter = new Sorting27(arr);

        System.out.println("Original aray:");
        sorter.print();

        sorter.bubbleSort();

        System.out.println("Sorted array(bubble sort):");
        sorter.print();
    }
}

}
