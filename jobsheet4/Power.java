package jobsheet4;

public class Power {
    int baseNumber, exponent;
    Power(int n, int e){
        baseNumber = n;
        exponent = e;
    }
    int PowerBF(int n, int e){
        int result = 1;
        for(int i=0; i<e; i++){
            result = result*n;
        }
        return result;
    }
    int PowerDC(int n, int e){
        if(e==1){
            return n;
        }else{
            if(e%2==1){
                return (PowerDC(n, e/2)*PowerDC(n, e/2)*n);
            }else{
                return (PowerDC(n, e/2)*PowerDC(n, e/2));

                
            }
        }
    }
}