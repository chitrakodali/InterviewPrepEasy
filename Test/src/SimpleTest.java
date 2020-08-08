import java.util.Arrays;
import java.util.*;

public class SimpleTest {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int[] array2 = new int[2];
        for (int i=0; i< array.length -1; i++){
            for (int j=i+1; j < array.length; j++){
                // System.out.println(j + ""+array[j]);
                if ((array[i]+array[j] == targetSum))
                {
                    return new int[] {array[i],array[j]};


                }
            }
        }
       return new int[0];
    }
    public static int singleNum(int[] arr){
        int singleOne;
        //Arrays.sort(arr);
        HashSet singleNum = new HashSet();

       for (int i=0; i< arr.length; i++){

           if(!singleNum.add(arr[i]))

               singleNum.remove(arr[i]);

           }
        // Iterator itr = singleNum.iterator();
        // System.out.println(itr.next());
       singleOne = (int)singleNum.iterator().next();
        return singleOne;
    }

    public static int singleNumber(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int n:A) {
            if (!set.add(n))
                set.remove(n);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    public static int singleNumber1(int[] nums) {

        HashSet singleNum = new HashSet();

        for (int i=0; i< nums.length; i++){
            if(!singleNum.add(nums[i]))
                singleNum.remove(nums[i]);
        }

        return (int)singleNum.iterator().next();

    }

    public static void twoNumSum(int[] arr, int targertSum){
        Map<Integer, Boolean>  nums = new HashMap<>();
        for (int num : arr){
            int match = targertSum - num;
            System.out.println(match);
            if (nums.containsKey(match)){
                System.out.println(match + " - "+ num);
            }
            else
                nums.put(num,true);
        }


    }


    public static void main(String[] args){
        int[] arr = {4, 6, 1};
        int sum = 11;
        int [] aar2= twoNumberSum(arr,sum);
        twoNumSum(arr,sum);
        int[] arr3 = {1,1,2,2,3,3,9};

        System.out.println("Single Number"+ singleNum(arr3));
        System.out.println("Single Number"+ singleNumber(arr3));
       System.out.println("Single Number"+ SimpleTest.singleNumber1(arr3));

        System.out.println("Test"+ Arrays.toString(aar2));
    }
}
