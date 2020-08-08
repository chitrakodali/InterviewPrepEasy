import java.util.HashSet;
/*
A happy number is a number defined by the following process: Starting with any positive integer, replace the number
 by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or
 it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {
    public static int sumOfDigitsSq(int n)
    {
        int sum = 0;
        while (n>0){
            int digit = n % 10;
            sum+= digit * digit;
            n = n/10;
        }
        System.out.println(sum);
        return sum;
    }
    public static boolean isHappy(int n)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(n);
        while (true) {
            if (n == 1)
                return true;
            n = sumOfDigitsSq(n);
            if (s.contains(n))
                return false;
            s.add(n);
        }
    }

    public static void main(String args[]){

        int n = 7;
        System.out.println(isHappy(n));
    }
}
