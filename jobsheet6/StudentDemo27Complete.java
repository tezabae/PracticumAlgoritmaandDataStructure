package jobsheet6;

public class StudentDemo27Complete {
    public static void main(String[] args) {
        // Test Bubble Sort
        TopStudent27 ts1 = new TopStudent27();
        ts1.add(new Student27("123", "Alice", "A", 3.5));
        ts1.add(new Student27("124", "Bob", "B", 3.8));
        ts1.add(new Student27("125", "Charlie", "A", 3.2));
        ts1.add(new Student27("126", "David", "C", 3.9));
        ts1.add(new Student27("127", "Eve", "B", 3.6));
        
        System.out.println("=== Bubble Sort (Descending) ===");
        ts1.bubbleSort();
        ts1.print();
        
        // Test Selection Sort
        TopStudent27 ts2 = new TopStudent27();
        ts2.add(new Student27("123", "Alice", "A", 3.5));
        ts2.add(new Student27("124", "Bob", "B", 3.8));
        ts2.add(new Student27("125", "Charlie", "A", 3.2));
        ts2.add(new Student27("126", "David", "C", 3.9));
        ts2.add(new Student27("127", "Eve", "B", 3.6));
        
        System.out.println("\n=== Selection Sort (Ascending) ===");
        ts2.selectionSort();
        ts2.print();
        
        // Test Insertion Sort
        TopStudent27 ts3 = new TopStudent27();
        ts3.add(new Student27("123", "Alice", "A", 3.5));
        ts3.add(new Student27("124", "Bob", "B", 3.8));
        ts3.add(new Student27("125", "Charlie", "A", 3.2));
        ts3.add(new Student27("126", "David", "C", 3.9));
        ts3.add(new Student27("127", "Eve", "B", 3.6));
        
        System.out.println("\n=== Insertion Sort (Ascending) ===");
        ts3.insertionSort();
        ts3.print();
        
        // Test Insertion Sort Descending
        TopStudent27 ts4 = new TopStudent27();
        ts4.add(new Student27("123", "Alice", "A", 3.5));
        ts4.add(new Student27("124", "Bob", "B", 3.8));
        ts4.add(new Student27("125", "Charlie", "A", 3.2));
        ts4.add(new Student27("126", "David", "C", 3.9));
        ts4.add(new Student27("127", "Eve", "B", 3.6));
        
        System.out.println("\n=== Insertion Sort (Descending) ===");
        ts4.insertionSortDescending();
        ts4.print();
    }
}
    
