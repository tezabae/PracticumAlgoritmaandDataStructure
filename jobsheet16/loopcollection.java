package jobsheet16;
import java.util.Stack;
import java.util.Iterator;

public class loopcollection {
    public static void main(String[] args) {
        // Create a stack of fruits
        Stack<String> fruits = new Stack<>();
        fruits.push("Apple");          // push
        fruits.add("Orange");          // add
        fruits.add("Watermelon");
        fruits.add("Lychee");
        fruits.push("Grapes");

        // Display with for-each loop
        System.out.println("For-each loop:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\nStack toString: " + fruits);

        // Pop elements (LIFO)
        System.out.println("\nPop elements:");
        while (!fruits.isEmpty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // Add new elements after pop
        fruits.push("Melon");
        fruits.push("Durian");

        // Iterator
        System.out.println("\n\nIterator:");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            System.out.printf("%s ", it.next());
        }

        // Stream
        System.out.println("\nStream:");
        fruits.stream().forEach(e -> System.out.printf("%s ", e));

        // For loop with index
        System.out.println("\nFor loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("Index %d: %s\n", i, fruits.get(i));
        }

        // Change last element to Strawberry
        fruits.set(fruits.size() - 1, "Strawberry");
        System.out.println("\nAfter changing last element: " + fruits);

        // Add Mango, Guava, Avocado
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Sort ascending
        fruits.sort(String::compareTo);
        System.out.println("Ascending sort: " + fruits);

        // Sort descending
        fruits.sort((a, b) -> b.compareTo(a));
        System.out.println("Descending sort: " + fruits);
    }
}
