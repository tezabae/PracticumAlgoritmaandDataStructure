package jobsheet6;

public class SortingMain27 {

public class SortingMain11 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting27 sorting1 = new Sorting27(a, a.length);
        System.out.println("Original array:");
        sorting1.print();
        sorting1.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting1.print();
        
        int[] b = {30, 20, 2, 8, 14};
        Sorting27 sorting2 = new Sorting27(b, b.length);
        System.out.println("\nOriginal array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();
        
        int[] c = {40, 10, 4, 9, 3};
        Sorting27 sorting3 = new Sorting27(c, c.length);
        System.out.println("\nOriginal array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}
}