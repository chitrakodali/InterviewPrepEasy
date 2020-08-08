import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MergeNames {



        public static String[] uniqueNames(String[] names1, String[] names2) {
            //throw new UnsupportedOperationException("Waiting to be implemented.");

            Set<String> mergeNames = new LinkedHashSet<String>();

            mergeNames.addAll(Arrays.asList(names1));
            mergeNames.addAll(Arrays.asList(names2));
            String[] uniqueNamesList = mergeNames.toArray(new String[mergeNames.size()]);

            return uniqueNamesList;
        }

        public static void main(String[] args) {
            String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
            String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
            System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
        }
    }
