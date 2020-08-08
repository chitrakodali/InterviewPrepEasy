import java.util.*;
import java.util.LinkedList;

public class FindOneOddNumber {

   static int findOddNumber(int[] arr){

        int counter =0;
        //Arrays.sort(arr);
      // o(n)
       //o(n) //12,13,14,5, 6

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length;j++){
                if (arr[i] == arr[j]){
                   counter++;
                }

            }
           // System.out.println(counter+" "+ arr[i]);
            if (counter%2 != 0){
                return arr[i];
            }

        }
     return counter;
    }

    static int findOddNumUsingMap(int arr[]){
        HashMap<Integer,Integer> hmap = new HashMap<>();


        for (int i =0; i< arr.length;i++){
            if (hmap.containsKey(arr[i])){
                int val = hmap.get(arr[i]);
                hmap.put(arr[i],val+1);
            }
            else
                hmap.put(arr[i],1);
        }


        for (Integer a : hmap.keySet()){
            if ( hmap.get(a) %2 != 0){
                return a;
            }
        }
       return 0;
    }
    static int findoddxor(int[] arr){
       int res = 0;

       for (int i=0; i< arr.length; i++){
           res = res ^ arr[i];
       }

       return res;
    }
    public static void main(String[] args){
       int n[] = {73, 80, 5, 73, 73, 5, 80, 5, 73,5,7};
       System.out.println("odd: " + findOddNumber(n));
       System.out.println("Odd using Map "+ findOddNumUsingMap(n));
       System.out.println(" using xor " + findoddxor(n));




    }
}
