import java.util.Arrays;

public class Sorting {

    public static int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int min = Integer.MAX_VALUE;

            int minIndex = i;
            System.out.println("Min Value "+ min);

            for (int j = i; j < nums.length; j++) {

                if (nums[j] < min) {

                    min = nums[j];

                    minIndex = j;

                }

            }

            int x = nums[i];

            nums[i] = nums[minIndex];

            nums[minIndex] = x;

        }
        return nums;

    }

    public static int[] bubbleSort(int[] nums){

        for(int i=0;i<nums.length;i++){

            for(int j=0; j<nums.length-1;j++){

                if(nums[j+1] < nums[j])
                {
                    nums[j] = nums[j+1];
                }

            }
        }

        return nums;
    }
    public static int[] insertionSort(int[] nums){
        for (int i=0; i < nums.length; i++){
            int j=i-1;
            int key = nums[i];
            while (j>0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] orderNum = {8, 10, 7, 12,0,4,22}; // 8,7,10,12, 7,8,10,12
        int[] finalNum = selectionSort(orderNum);

        System.out.println("Print Selection sort list" + Arrays.toString(finalNum));

        System.out.println("Print Bubble Sort" + Arrays.toString(bubbleSort(orderNum)));

        System.out.println("Print Insertion Sort" + Arrays.toString(insertionSort(orderNum)));
    }
}
