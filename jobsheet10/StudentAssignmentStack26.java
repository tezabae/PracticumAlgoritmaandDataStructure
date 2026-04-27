package jobsheet10;

public class StudentAssignmentStack26 {
    Student26[] stack;
    int top, size;

    public StudentAssignmentStack26(int size) {
        this.size = size;
        top = -1;
        stack = new Student26[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Student26 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
            System.out.println(std.name + "'s assignment has been successfully submitted!!");
        } else {
            System.out.println("Stack is already full!!");
        }
    }

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

    Student26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

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

    // 🔹 Method for number 5 (show first student submitted)
    Student26 first() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    } // ← tutup method first dengan benar

    // 🔹 Method for converting grade to binary
    String convertToBinary(int grade) {
        ConversionStack26 binStack = new ConversionStack26();
        while (grade > 0) {
            int mod = grade % 2;
            binStack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!binStack.isEmpty()) {
            binary += binStack.pop();
        }
        return binary;
    }
}
