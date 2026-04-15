package jobsheet7;

public class Searchstudent26 {
    Students26[] listStd;
    int idx;

    public Searchstudent26(int size) {
        listStd = new Students26[size];
        idx = 0;
    }

    public void add(Students26 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full!");
        }
    }

    public void display() {
        for (Students26 student : listStd) {
            if (student != null) {
                student.display();
                System.out.println("------------------------------------");
            }
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < idx; i++) { // pakai idx, bukan listStd.length
            if (listStd[i] != null && listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listStd[mid] == null) return -1; // cegah null error

            if (cari == listStd[mid].nim) {
                return mid;
            } else if (listStd[mid].nim > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}
