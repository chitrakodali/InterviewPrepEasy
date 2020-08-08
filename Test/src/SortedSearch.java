import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSearch{


    public static int countNumbers(int[] sortedArray, int lessThan) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
       // Arrays.sort(sortedArray);
        int count =0;
        for (int i=0; i<sortedArray.length; i++){
            if (sortedArray[i] < lessThan){
                count ++;
            }
        }
        return count;
    }

    public static int countNumbers2(int[] sortedArray, int lessThan)
    {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (sortedArray[mid] < lessThan) {
                if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan) { // check id next value is also valid
                    start = mid + 1;
                    continue;
                } else
                    return mid + 1;
            }

            if (sortedArray[mid] >= lessThan) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 10));
        System.out.println(SortedSearch.countNumbers2(new int[] { 2, 3, 5, 7 }, 16));
    }
}

