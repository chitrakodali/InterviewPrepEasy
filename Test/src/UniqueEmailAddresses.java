import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        List<String> unqEmail = new ArrayList<>();
        for (String s : emails){
            String[] localName = s.split("@");
            if ((!(localName[0].contains("+")) && (localName[1].contains(".")))) {
                System.out.println(s);
                unqEmail.add(s);
            }
            }

      return unqEmail.size();
    }

    public int numUniqueEmails2(String[] emails) {

        Set<String> set = new HashSet<>();
        for (String s : emails) {
            int i = s.indexOf("@");
            String local = s.substring(0, i);
            String rest = s.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));

            }
            local.replaceAll("\\.", "");
            set.add(local + set);
        }
        return set.size();
    }

    public static void main(String[] args){

        UniqueEmailAddresses ue = new UniqueEmailAddresses();
        String[] email = {"test@re","test@ee.com","test+@gk.com"};
        System.out.println(ue.numUniqueEmails(email) );
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(ue.numUniqueEmails2(emails));



    }
}
