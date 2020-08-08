public class Fibonacci {

    static int fib(int n){

        if (n <=1)
            return n;
        else
        {
         return (fib(n-1) + fib(n-2));
        }

    }
    static void fib1(int n){
        int a = 0;
        int b= 1;
        int i=0;
        int c=0;
        System.out.println (a);

        while ( i < n){

            c = a+b;
            System.out.println (b);
             a=b;
             b=c;

             i++;
        }
    }

    public static void main(String[] args) {
        int n = 5;
       /* for (int i = 0; i < n; i++) {

            System.out.println(fib(i) +" ");
        } */

         fib1(9);
    }
}
