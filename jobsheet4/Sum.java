package jobsheet4;

public class Sum {
     double profits[];

    Sum(int el){
        profits = new double[el];
    }
    double totalBF(){
        double total=0;
        for(int i=0;i<profits.length;i++){
            total = total+profits[i];

        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];

        }
        int mid = (1+r)/2;
        double lsum = totalDC(arr, 1, mid);
        double rsum = totalDC(arr, mid+l, r);
        return lsum+rsum;
    }

}
