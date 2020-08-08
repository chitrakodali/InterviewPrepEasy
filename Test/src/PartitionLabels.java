import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> partitionLabel(String s){
        List<Integer> out = new ArrayList<>();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i=0; i < s.length(); i++)
            hmap.put(s.charAt(i),i);
        Integer end =0, begin=0;

        for (int i=0; i < s.length(); i++){
           /* Integer index = hmap.get(s.charAt(i));
            if( index.intValue() > end.intValue()){
                end = index;
            }*/
           end = Math.max(hmap.get(s.charAt(i)),end);

            if (i == end.intValue())
            {
                out.add(end.intValue() - begin.intValue() + 1);
                begin = i + 1;
            }

        }
      return out;
    }
    public static void main(String[] args){
        String s = "ababcbacadefegdehijhklij";
        System.out.println(Arrays.asList(partitionLabel(s)));
    }

}
