package jobsheet14;

public class BinaryTreeMain26 {
    public static void main(String[] args) {
        BinaryTree26 bst = new BinaryTree26();
        bst.add(new Student26("254107020100", "Zhao Yufan", "TI-1I", 3.57));
        bst.add(new Student26("254107020099", "Edwards Martin", "TI-1I", 3.85));
        bst.add(new Student26("254107020098", "Kim Juhoon", "TI-1I", 3.21));
        bst.add(new Student26("254107020097", "Eom Seonghyeon", "TI-1I", 3.54));

        System.out.println("Student list (in-order traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("Search data");
        System.out.print("Search a student with IPK: 3.54: ");
        String result = bst.find(3.54) ? "Found" : "Not Found";
        System.out.println(result);

        System.out.print("Search a student with IPK: 3.22: ");
        result = bst.find(3.22) ? "Found" : "Not Found";
        System.out.println(result);

        bst.add(new Student26("254107020223", "Ahn Keonho", "TI-1I", 3.72));
        bst.add(new Student26("254107020222", "Tezaa Gracelynnee", "TI-1I", 3.37));
        bst.add(new Student26("254107020221", "Citra Diah Ayu", "TI-1I", 3.46));
        System.out.println("Student list:");
        System.out.println("In-order traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre-order traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("Post-order traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("Data deletion");
        bst.delete(3.57);
        System.out.println("Student list after deletion:");
        bst.traverseInOrder(bst.root);
    }
}


