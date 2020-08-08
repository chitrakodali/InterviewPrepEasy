import java.util.*;

public class ThreeLargestNumbers {
    static void print3largest(int arr[], int arr_size)
    {
        int i, first, second, third;

        /* There should be atleast three elements */
        if (arr_size < 3)
        {
            System.out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size ; i ++)
        {
            /* If current element is greater than
            first*/
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (arr[i] > second)
            {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        System.out.println("Three largest elements are " +
                first + " " + second + " " + third);
    }

    public static List<Integer[]> largestThreeNumbers(int[] array, int asize) {
       List<Integer[]> triple = new ArrayList<>();
        Arrays.sort(array);
        int first,second,third;
        first = second = third = Integer.MIN_VALUE;

        for (int k=0; k < asize; k++) {
            if (array[k]>first){
                third = second;
                second = first;
                first=array[k];
            }
            else if (array[k]>second){
                third=second;
                second=array[k];
            }
            else if (array[k] > third)
                third = array[k];


        }

        triple.add(new Integer[] {first,second,third});
        return triple;


    }

    public static List<List<Integer>> threeNumSum(int[] numbers, int targetSum){
        Arrays.sort(numbers);
        HashSet<List<Integer>> list = new HashSet<>();
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i=0; i<numbers.length-2; i++){
            int left = i+1;
            int rightmost = numbers.length-1;
            while (left < rightmost){
                int currentSum = numbers[i] + numbers[left] + numbers[rightmost];
                if (currentSum == targetSum) {
                 //   if (!(numbers[i] == numbers[left] || numbers[i] == numbers[rightmost] || numbers[left] == numbers[rightmost]))
                         //triplets.add(new Integer[]{numbers[i], numbers[left], numbers[rightmost]});
                    list.add(new ArrayList<>(Arrays.asList(numbers[i], numbers[left],numbers[rightmost])));
                    //{numbers[i], numbers[left],numbers[rightmost]});

                    left++;
                    rightmost--;
                }
                else if(currentSum < targetSum) {
                    left++;
                }
                else if (currentSum > targetSum) {
                    rightmost--;
                }
                }
            }
           triplets.addAll(list);
          // triplets = new ArrayList<>(list);
          return triplets;

        }



    public static void main(String[] args){
        int[] arr = {-1,0,1,2,-1,-4};
        int arrSize = arr.length;
        //print3largest(arr,arrSize);
       List<List<Integer>> itr = threeNumSum(arr,0);
               //largestThreeNumbers(arr,arr.length);
       for (int i=0; i < itr.size(); i++){
           System.out.println("Here " + Arrays.asList(itr.get(i))); //.toString());

       }

        //System.out.println()
    }


}
