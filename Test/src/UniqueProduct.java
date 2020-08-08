import java.util.*;

public class UniqueProduct {
    //efficient way
    public static String firstUniqueProduct(String[] products) {


        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
        String uniqueStr = null;
        for (String s : products){
            if(!map.containsKey(s)){
                map.put(s,s);

            }
            else{
                map.remove(s,s);
            }
        }
        System.out.println(map.toString());
       // map.entrySet().
        //map.containsValue("")
        Iterator<Map.Entry<String,String>> itr = map.entrySet().iterator();
        uniqueStr = itr.next().getKey();

       return uniqueStr;
    }
    public static String firstUniqueProduct1(String[] products) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
        String uniqueStr = null;

        for (String s : products){

            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);


            }
            else{
                map.put(s,1);

            }
        }
        System.out.println(map.toString());
        // map.entrySet().
        //Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
        int max = 0;
        for (Map.Entry elm : map.entrySet()){

            max = Math.max((int)elm.getValue(),max);

            if ((int)elm.getValue() == max){
                uniqueStr = (String)elm.getKey();
                System.out.println(uniqueStr);
            }
        }
        for (Map.Entry elm : map.entrySet()){

            if ((int)elm.getValue() == 1){
                uniqueStr = (String)elm.getKey();
                break;
            }
        }






        return uniqueStr;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct1(new String[]{"Apple", "Apple", "Computer", "Apple", "Bag" , "Computer", "Laptop" }));
    }
}

//apple,computer,bag,laptop

