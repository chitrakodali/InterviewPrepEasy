import java.util.HashSet;
import java.util.Set;

public class ReverseString {

    static void reverseString(String str){
        int len = str.length();
        String rev="";
        for (int i=len-1; i>=0; i--){

             rev += str.charAt(i);
        }
        System.out.println(rev);
    }
    static void reverseWords(String str){
        String[] slist = str.split(" ");
        String revStr="";
        for(int i = slist.length-1 ; i>=0; i--){
            revStr += slist[i] +" ";
        }
        System.out.println(revStr);
    }

    static  void subString(String s){

        for (int i=0; i < s.length(); i++){
            for (int j=i+1; j<=s.length();j++){
             System.out.println(s.substring(i,j));
            }
        }
    }

    static String revStringUsingPointers(String s){
       char[] arr = s.toCharArray();

       for (int i=0; i< s.length() / 2; i++){
           int j = s.length() - i - 1;
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }
       return new String(arr);
    }
    static void duplicateString(String str){
        Set<Character> set = new HashSet<>();
        for (int i=0; i<str.length(); i++){
            //if (!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
          //  }
        }
        System.out.println(set.toString());
    }
  /*  static void duplicateStrings(String str){
        char[] char = str.toCharArray();
        for (int)
    } */
    public static void main(String[] args){
       // reverseString("icer");
        //reverseWords("I am good at coding");
       // subString("Coding");
        System.out.println(revStringUsingPointers("Coding"));
        duplicateString("uiui");
    }
}
