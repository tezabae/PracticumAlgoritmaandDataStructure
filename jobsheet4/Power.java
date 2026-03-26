package jobsheet4;

public class Power {
    int baseNumber, exponent;

    Power(int n, int e) {
        baseNumber = n;
        exponent = e;
    }

    // Brute force method
    int PowerBF(int n, int e) {
        int result = 1;
        for (int i = 0; i < e; i++) {
            result = result * n;
        }
        return result;
    }

    // Divide and conquer method
    int PowerDC(int n, int e) {
        if (e == 0) {   // base case: n^0 = 1
            return 1;
        }
        if (e == 1) {
            return n;
        }
        int half = PowerDC(n, e / 2);  // compute once
        if (e % 2 == 0) {
            return half * half;
        } else {
            return half * half * n;
        }
    }
}
