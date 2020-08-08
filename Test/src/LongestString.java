import java.util.*;

public class LongestString {

    public static String longestStr(String str)
    {
        String[] strList = str.split(" ");
        String longestName = strList[0];
        for (int i=0; i<strList.length; i++){
            if (strList[i].length() > longestName.length())
                longestName = strList[i];
        }

        return longestName;
    }
    /*public static String longestStr1(String str){
        String[] strList = str.split(" ");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(String str1: strList){
            map.put(str,str.length());
        }

    } */
    public static void main(String[] a)
    {
        String str = "SystemDesign has lot of Concepts";
        System.out.println(longestStr(str));
    }
}
