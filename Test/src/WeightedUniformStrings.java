import java.util.*;
public class WeightedUniformStrings {

        private static HashSet<Integer> getWeights(String str) {
            HashSet<Integer> weights = new HashSet<>();
            int weight = 0;
            char prev = ' '; // so it doesn't match 1st character
            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);
                if (curr != prev) {
                    weight = 0;
                }
                weight += curr - 'a' + 1;
                weights.add(weight);
                System.out.println("print " + curr + prev);
                prev = curr;
            }
            return weights;
        }

        public static void main(String[] args) {
            /*Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int n = scan.nextInt(); */
            String str = "acddded";
            int[] n ={3,4,12, 0};
            HashSet<Integer> weights = getWeights(str);
           for (int i=0; i< n.length; i++) {

                System.out.println(weights.toString());
                System.out.println(weights.contains(n[i]) ? "Yes" : "No");
            }

        }
    }


