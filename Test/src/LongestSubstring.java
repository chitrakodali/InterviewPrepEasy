import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    int getLongestSubString(String input){
        String output="";
        int count =0;
        int startIndex=0;
        for (int i=0; i < input.length(); i++){


            Set<Character> visited = new HashSet<>();
            for (int j=i ; j < input.length(); j++) {

                if (visited.contains(input.charAt(j))) {
                   // visited.remove(currChar);
                    break;

                } else{
                    visited.add(input.charAt(j));
                    count = Math.max(count, visited.size());

                }
            if (output.length() < j-i+1){
                output = input.substring(i,j+1);
            }
            }
            //System.out.println(visited.toString());
        }
        System.out.println(output);
        return count;
    }

    int getLongestSubstringUsingMap(String input){
        HashMap<Character, Integer> hmap = new HashMap<>();
        String output="";
        int count = 0;
        String longestpalin = "";
        for ( int i =0, j = 0; j < input.length(); j++){
            if (hmap.containsKey(input.charAt(j))){
                i = Math.max(hmap.get(input.charAt(j)),i);
            }
                hmap.put(input.charAt(j),j+1);
                count = Math.max(count,j-i+1);

            if (output.length() < j-i+1){
                output = input.substring(i,j+1);
                if(isPalin(output)){
                    longestpalin = output;
                }

            }
            }
        System.out.println(output +"  " + longestpalin);
        return count;

    }
    public boolean isPalin(String s){
        if(s.equals(new StringBuilder(s).reverse().toString()))
            return true;
        else
            return false;
    }
    public static void main(String[] args){

        LongestSubstring sub = new LongestSubstring();

       // System.out.println(sub.getLongestSubString("clementisamap"));
        System.out.println(sub.getLongestSubstringUsingMap("abac") );// +




    }
}
/*
addabcaaa

clementisamap
clem
lem
em
mentisa
emtisam









 */