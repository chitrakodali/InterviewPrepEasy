import java.util.Arrays;
import java.util.*;
public class LeetCodeProblems {

    public static int countElements(int[] arr) {
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < arr.length; i ++) {
            if (!set.contains(arr[i])) {
                System.out.println(arr[i]);
                set.add(arr[i]);
            }

        }

        for(int i=0; i < arr.length; i++){
            if(set.contains(arr[i]+1)){
                count ++;
            }
        }
         return count;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List <List<String>> finalList = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
     /*   for(int i=0; i<strs.length; i++){
        char x[] = strs[i].toCharArray();
        Arrays.sort(x);
        String key = new String(x);

        //Add all String which can create same key into same list
        //if key is not existing in the map, then create a new one
        if(map.containsKey(key)){
            map.get(key).add(strs[i]);}
        else {
            map.put(key, new ArrayList<String>());
            map.get(key).add(strs[i]);
        }
        }
        finalList.addAll(map.values());
*/

        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }
            String ns = new String(arr);

            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                map.put(ns, al);
            }
        }
        finalList.addAll(map.values());
        return finalList;

    }

    public static ListNode middleNode(ListNode head){
        int len =0;
        ListNode current = head;
        ListNode middle = head;
        while (current!= null && middle.next !=null){
            current = current.next.next;
            middle = middle.next;
        }
      //return middle;
        while (current.next != null){
            len++;
            if(len%2 ==0){
                middle = middle.next;
            }

        }
        if (len%2 == 1)
            middle= middle.next;
        return middle;
    }
    public class ListNode {
      int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }

    public static boolean backspaceCompare(String S, String T) {

        if (returnString(S).equals(returnString(T)))
        {            return true;
        }
       return false;
    }


    public static String returnString(String S){
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == '#'){
                if(s2.length() > 0) s2.deleteCharAt(s2.length() - 1);
            }else{
                s2.append(S.charAt(i));
            }
        }
        System.out.println(s2.toString());
        return s2.toString();
    }
    public static void main (String[] arg){
        //int[] arr = {9,1,2,2,3,5};
       // System.out.println("Count: "+countElements(arr));
        String arr [] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List arrList = groupAnagrams(arr);
        System.out.println(arrList);

       // System.out.println(backspaceCompare("#c","ac#c"));



    }
}
