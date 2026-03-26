package jobsheet4;

public class StudentNilai {
    String name;
    int uts, uas;

    StudentNilai(String name, int uts, int uas){
        this.name = name;
        this.uts = uts;
        this.uas = uas;
    }

    
    static int maxUTS(StudentNilai arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int left = maxUTS(arr, l, mid);
        int right = maxUTS(arr, mid+1, r);
        return Math.max(left, right);
    }

    
    static int minUTS(StudentNilai arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int left = minUTS(arr, l, mid);
        int right = minUTS(arr, mid+1, r);
        return Math.min(left, right);
    }

   
    static double avgUAS(StudentNilai arr[]){
        double total = 0;
        for(int i=0; i<arr.length; i++){
            total += arr[i].uas;
        }
        return total / arr.length;
    }
}

