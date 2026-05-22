package jobsheet13;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
       DoubleLinkedLists dll = new DoubleLinkedLists();
       dll.print();
        dll.addFirst(new Student("111", "Zhao Yufan", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Edwards Martin", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Kim Juhoon", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Eom Seonghyeon", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Ahn Keonho", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Teza Gracelynne", "TI-1I", 3.4));
        dll.print();

        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();

    }
}


  
