package jobsheet10;

public class ExcuseLetterStack26 {
    ExcuseLetter26[] stack;
    int top, size;

    public ExcuseLetterStack26(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter26[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter26 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
            System.out.println("Excuse letter from " + letter.name + " has been submitted!");
        } else {
            System.out.println("Stack is full!");
        }
    }

    ExcuseLetter26 pop() {
        if (!isEmpty()) {
            ExcuseLetter26 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("No excuse letters to process!");
            return null;
        }
    }

    ExcuseLetter26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("No excuse letters available!");
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Letter found: " + stack[i].id + " - " + stack[i].name +
                                   " (" + stack[i].className + "), Type: " + stack[i].typeOfExcuse +
                                   ", Duration: " + stack[i].duration + " days");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No letter found for student " + name);
        }
    }

    // 🔹 Tambahan method untuk print semua surat izin
    void printAll() {
        if (!isEmpty()) {
            System.out.println("Excuse Letters List:");
            System.out.println("ID\tName\tClass\tType\tDuration");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].id + "\t" + stack[i].name + "\t" +
                                   stack[i].className + "\t" + stack[i].typeOfExcuse + "\t" +
                                   stack[i].duration + " days");
            }
        } else {
            System.out.println("No excuse letters in the stack!");
        }
        System.out.println("");
    }
}


