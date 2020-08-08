public class Palindrome {

    static void isPalindrome(String str){
       String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
        if(rev.toString().equals(str)){
            System.out.println("It is palindrome");
        }
    }
    public static void main(String[] args){
        isPalindrome("kayak");
    }
}
