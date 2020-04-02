import java.util.Arrays;

public class SimpleTest {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int[] array2 = new int[2];
        for (int i=0; i< array.length -1; i++){
            for (int j=i+1; j < array.length; j++){
                 System.out.println(j + ""+array[j]);
                if ((array[i]+array[j] == targetSum))
                {
                    array2[0] = array[i];
                    array2[1] =array[j];


                }
            }
        }
       // System.out.println(Arrays.asList(array2));
        return array2;
    }
    public static void main(String[] args){
        int[] arr = {1,5,8,9};
        int sum = 16;
        int [] aar2= twoNumberSum(arr,sum);
        System.out.println("Test"+ Arrays.toString(aar2));
    }
}
