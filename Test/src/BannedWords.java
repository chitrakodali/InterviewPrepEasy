import java.util.*;

public class BannedWords {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedArr = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap();
        String[] ip_arr = paragraph.split("[, .]");
        for(String str: ip_arr) {
            str = str.toLowerCase();
            if(!bannedArr.contains(str))
                map.put(str, map.getOrDefault(str, 0)+1);
        }


        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

    }

    public static void main(String[] args){
        BannedWords bw = new BannedWords();
        System.out.println(bw.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"ball"}));
    }
}
