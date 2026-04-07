package jobsheet6;

public class LecturerData27 {
    Lecturer27[] lecturerData = new Lecturer27[10];
    int idx;
    
    public void add(Lecturer27 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
            System.out.println("Lecturer added successfully!");
        } else {
            System.out.println("Data is full!");
        }
    }
    
    public void print() {
        if (idx == 0) {
            System.out.println("No data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }
    
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer27 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted by age (Ascending - Youngest to Oldest)");
    }
    
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer27 temp = lecturerData[maxIdx];
            lecturerData[maxIdx] = lecturerData[i];
            lecturerData[i] = temp;
        }
        System.out.println("Sorted by age (Descending - Oldest to Youngest)");
    }
}

