public class RepeatedString {

    public static int repeatedString(String s, int n){
        int count =0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a'){
                count ++;
            }
        }
        int div = n/s.length();
        int rem = n%s.length();
        count = div * count;
        for (int i=0; i<rem; i++){
            if(s.charAt(i) =='a')
                count++;
        }
        return count;
    }

    public static void main(String[] args){

        System.out.println(repeatedString("aaaa",6));
    }
}
