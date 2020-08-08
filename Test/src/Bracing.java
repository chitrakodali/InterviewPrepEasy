import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Bracing {
    static boolean isValidBraces(String value) {

        Stack<Character> stack  = new Stack<Character>();

            for (char c : value.toCharArray()) { //{()}

                if (c == '('){
                    stack.push(')');
                }
                else if (c == '{'){

                    stack.push('}');
                }
                else if (c == '['){
                    stack.push(']');
                }
                else if(stack.isEmpty() || stack.pop() != c){

                    return false;
                }

            }

        return stack.empty();
    }

    public static String[] getValidBraces(String[] values){


        String[] s1 = new String[2];
        int i=0;
        for ( String s : values){
            if (isValidBraces(s)){
                s1[i] = "YES";
            }
            else {
                s1[i] = "NO";
            }
            i++;
        }

        return s1;
    }
    public static void main(String[] args){
        String [] bc = {"{()]"};
        System.out.println(Arrays.toString(getValidBraces(bc)));


    }

    }


