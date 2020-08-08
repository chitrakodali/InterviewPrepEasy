import java.util.*;

import static java.util.Collections.sort;

public class isAnagram {

    public static boolean isAnagram(String s1, String s2){

        if (s1.length() != s2.length()) return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[256];
        if(s1.compareTo(s2) != 0){
            return false;
        }

      /*  for (char c : s1.toCharArray()) { eat
           letters[e] = 96 - e
           letters[a] = 100 - a
           letters[t]  = 120 - t
            letters[c]++;
        }

        for (char c: s2.toCharArray()) { att
            letters[c]--;

        }

        for (int i : letters) {
            if (i != 0) return false;
        }
       */
        return true;
    }
    public static void groupAnagrams(String[] strs){
        List <List<String>> finalList = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0; i<strs.length; i++){
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
        System.out.println(finalList.toString() + ", "+ finalList.toArray());

    }

    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
               ans.get(key).add(s);
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static void anagramPermutations(String[] strings){
        List<String> ana = new ArrayList<>();
        Set<String> visited = new HashSet<String>();
        for (String s : strings){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            if (!visited.contains(key)){
                visited.add(key);
                ana.add(s);
            }
        }
        Collections.sort(ana);

        System.out.println(ana);
    }

    static void anagramPairCount(String s){

            HashMap<String, Integer> map= new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                for(int j = i; j < s.length(); j++){
                    char[] valC = s.substring(i, j+1).toCharArray();
                    Arrays.sort(valC);
                    String val = new String(valC);
                    if (map.containsKey(val))
                        map.put(val, map.get(val)+1);
                    else
                        map.put(val, 1);
                }
            }
            int anagramPairCount = 0;
            for(String key: map.keySet()){
                int n = map.get(key);
                if (n!=1)
                  anagramPairCount += (n * (n-1))/2;
            }
        System.out.println("pair count "+ anagramPairCount);
           // return anagramPairCount;

        }

    public static void main(String[] args){

      System.out.println(isAnagram("abbb","abbb"));
       /* String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
       List anagrams = groupAnagrams2(arr);
       System.out.println(anagrams);
       String[] arr1 = {"code","doce","cdeo","frame","mearf","farmer"};
       anagramPermutations(arr1);
       anagramPairCount("cdcd");

        */


    }




}

