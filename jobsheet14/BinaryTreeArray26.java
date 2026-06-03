package jobsheet14;

public class BinaryTreeArray26 {
    Student26[] data;
    int idxLast;

    public BinaryTreeArray26() {
        data = new Student26[10];
        idxLast = -1;
    }

    void populateData(Student26[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // ADD METHOD
    public void add(Student26 student) {

        if (idxLast == -1) {
            data[0] = student;
            idxLast = 0;
            return;
        }

        int current = 0;

        while (true) {

            if (student.ipk < data[current].ipk) {

                int leftChild = 2 * current + 1;

                if (leftChild >= data.length) {
                    System.out.println("Array is full!");
                    return;
                }

                if (data[leftChild] == null) {
                    data[leftChild] = student;
                    idxLast = Math.max(idxLast, leftChild);
                    break;
                }

                current = leftChild;

            } else {

                int rightChild = 2 * current + 2;

                if (rightChild >= data.length) {
                    System.out.println("Array is full!");
                    return;
                }

                if (data[rightChild] == null) {
                    data[rightChild] = student;
                    idxLast = Math.max(idxLast, rightChild);
                    break;
                }

                current = rightChild;
            }
        }
    }

    // PREORDER TRAVERSAL
    public void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (data[idxStart] != null) {

                data[idxStart].print(); // Root

                traversePreOrder(2 * idxStart + 1); // Left

                traversePreOrder(2 * idxStart + 2); // Right
            }
        }
    }
}