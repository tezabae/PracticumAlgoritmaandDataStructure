package jobsheet10;

public class StudentAssignmentStack26 {
    Student26[] stack;
    int top, size;

    // Constructor
    public StudentAssignmentStack26(int size) {
        this.size = size;
        top = -1;
        stack = new Student26[size];
    }

    // Checking full
    boolean isFull() {
        return top == size - 1;
    }

    // Checking empty
    boolean isEmpty() {
        return top == -1;
    }

    // Push (submit tugas)
    void push(Student26 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
            System.out.println(std.name + "'s assignment has been successfully submitted!!");
        } else {
            System.out.println("Stack is already full!!");
        }
    }

    // Pop (take tugas for grading)
    Student26 pop() {
        if (!isEmpty()) {
            Student26 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // Peek (see tugas paling atas)
    Student26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    // Print all tugas
    void print() {
        if (!isEmpty()) {
            System.out.println("Assignment list:");
            System.out.println("NIM\tName\tClass Name");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
            }
        } else {
            System.out.println("There is no data in Stack!!");
        }
        System.out.println("");
    }

    // 🔹 Adding method for question 5 (show first student submitted)
    Student26 first() {
        if (!isEmpty()) {
            return stack[0]; // elemen pertama yang submit
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
}
