package jobsheet16;
import java.util.ArrayList;
import java.util.Stack;

public class examplelist {
    public static void main(String[] args) {
        // ArrayList tanpa tipe khusus
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("CIRENG AYAMM");

        System.out.printf("Element 0: %s total element: %d last element: %s\n",
                list.get(0), list.size(), list.get(list.size() - 1));

        list.add(4);
        list.remove(0);
        System.out.printf("Element 0: %s total element: %d last element: %s\n",
                list.get(0), list.size(), list.get(list.size() - 1));

        // ArrayList dengan tipe khusus (String)
        ArrayList<String> names = new ArrayList<>();
        names.add("Zhao Yufan");
        names.add("Edwards Martin");
        names.add("Kim Juhoon");
        names.add("Eom Soenghyeon");
        names.add("Ahn Keonho");

        System.out.printf("Element 0: %s total element: %d last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");
        System.out.printf("Element 0: %s total element: %d last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());

        // if you want to use push(), you need to add Stack
        Stack<String> stackNames = new Stack<>();
        stackNames.push("Zhao Yufan");
        stackNames.push("Edwards Martin");
        stackNames.push("Kim Juhoon");
        stackNames.push("Eom Soenghyeon");
        stackNames.push("Ahn Keonho");

        // adding with the new interaction
        stackNames.push("Teza Gracelynne");

        System.out.printf("Element 0: %s total element: %d last element: %s\n",
                stackNames.get(0), stackNames.size(), stackNames.peek());
        System.out.println("Stack Names: " + stackNames);
    }
}
