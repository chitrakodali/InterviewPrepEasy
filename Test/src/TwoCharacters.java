import java.util.*;

public class TwoCharacters {

    static void twoCharacters(String s){

        Set<Character> distinctValues = new HashSet<>();
        for (int i=0; i < s.length(); i++){
            distinctValues.add(s.charAt(i));
        }

        List<Character> distinceList = new ArrayList(distinctValues);
        int max=0;
        for (int i=0; i<distinctValues.size()-1; i++){
            for(int j=i; j<distinctValues.size(); j++){
                char c1 = distinceList.get(i);
                char c2 = distinceList.get(j);
               // String s1 = ""+c1+c2;
               // System.out.println(c1);
                System.out.println(""+c1+c2);
                String substring = s.replaceAll("[^"+c1+ ""+ c2+"]", "");
                System.out.println("substring : " +
                        " "+ substring);
                boolean match = true;
                for (int k=0; k <substring.length()-1; k++){
                    if ((substring.charAt(k) == substring.charAt(k+1))){
                        match = false;
                    }
                }
                if (match){
                    int len = substring.length();
                    max = Math.max(max,len);
                }

               /* if(isAlternate(substring)){
                    int len = substring.length();
                    max = Math.max(max,len);
                } */

            }
        }
      System.out.println(max);
    }
    static void camelCase(String s){
        String[] camelWords = s.split("[A-Z]");
        System.out.println(Arrays.toString(camelWords)+ camelWords.length);


    }
    static boolean isAlternate(String s){
        for(int i=0; i<s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        String s ="beabeefeab";

        twoCharacters(s);
        camelCase("caseTheCamelNew");
    }
}
