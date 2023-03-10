package DSA.RecursionByStriver;

public class Fibonacci {
    
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fib(n));
        System.out.println(fibRec(n));
    }

   

    public static int fib(int n){

        int num1 = 0;
        int num2 = 1;

        int fib = 0;
        for(int i=1; i<n;i++){
            fib = num1+num2;
            num1 = num2;
            num2 = fib;
        }

        return fib;
    }

    // time complexity is 2 to power n -> exponential
    public static int fibRec(int n){

        if(n==1 || n==0)
        return n;

        return fibRec(n-1)+fibRec(n-2);
    }
}
