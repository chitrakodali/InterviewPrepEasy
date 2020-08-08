import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SuggestedProduct {

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        int N = searchWord.length();

        List<List<String>> ans = new ArrayList<>(N);

        PriorityQueue<String> q = new PriorityQueue<>((a, b) -> b.compareTo(a));

        for(int i = 1 ; i <= N ;i++){

            String term = searchWord.substring(0,i);

            for(String s : products){

                if(s.startsWith(term)){
                    q.offer(s);
                }

                if(q.size() > 3){
                    q.poll();
                }
            }

            List<String> list = new ArrayList<>(3);

            while(!q.isEmpty()){
                list.add(0,q.poll());
            }
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] str){
        String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord = "mouse";
        System.out.println(Arrays.asList(suggestedProducts(products,searchWord)));


    }
}
