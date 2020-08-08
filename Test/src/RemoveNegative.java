import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNegative {

    public static int[] removeNegativeNumbers(int[] num) {

        ArrayList al = new ArrayList();
        int k = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] > 0) {
                if(num[i]%2 !=0){
                    al.add(num[i] -1);
                    al.add(1);
                }
                else
                    al.add(num[i]);
            }
        }
        int[] output = new int[al.size()];
        for (int i=0; i < al.size(); i++){
            output[i] = (int)al.get(i);
        }
        return output;
    }

    public static void removeNegative(List<Integer> num ){
        for (int i=0; i < num.size(); i++){
            if (num.get(i)<0){
                num.remove(i);
            }
          /*  else if (num.get(i)%2 !=0){
                int odd = num.get(i);
               num.remove(i);
               num.add(odd-1);
               num.add(1);
            } */

        }
        System.out.println(Arrays.asList(num));
    }

    public static void main(String[] args){
        int nums[] = {7,8,0,-8,-1,5,4};
        System.out.println(Arrays.toString(removeNegativeNumbers(nums)));
        Integer num[] = {7,8,0,-8,-1,5,4};
        removeNegative(Arrays.asList(num));
    }
}
