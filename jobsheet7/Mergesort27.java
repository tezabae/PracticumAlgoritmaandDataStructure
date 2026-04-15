package jobsheet7;

public class Mergesort27 {

    public void sortArray(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void merge(int[] data, int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }

        int a = left;
        int b = middle + 1;
        int c = left;

        // Gabungkan dua bagian
        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }

        // Salin sisa elemen dari kiri
        while (a <= middle) {
            data[c] = temp[a];
            a++;
            c++;
        }
    }

    private void sort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
