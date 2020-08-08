import java.util.Arrays;

public class LeftRotation {

    static void leftRotate(int[] nums, int pos){
        int len = nums.length;
        int[] tmp = new int[len];

        int mod = pos % len; //  2 % 5
        for (int i=0; i < len ; i++){
            tmp[i] = nums[(i+mod)%len];
        }
        System.out.println(Arrays.toString(tmp));
    }
    static void marsExploration(String s){
        int count =0;
        for (int i=0; i < s.length(); i+=3){

            if(s.charAt(i) !='S'){
                count ++;
            }
            if(s.charAt(i+1)!='O'){
                count ++;
            }
            if(s.charAt(i+2)!='S'){
                count ++;
            }
        }
        System.out.println("Total Changed:"+ count);
    }
    static void tooChaotic(int[] q){
        int count = 0;
        for(int i=0; i<q.length;i++){
            int ch_pos = q[i]-(i+1);  // 8 -
            if(ch_pos>2) {
                System.out.println("Too chaotic");
                return; }
            else {//if (q[i] < i+1){
                int st = Math.max(0,q[i]-2);
                for(int j=st;j<i;j++){
                    if(q[j]>q[i])
                        count++;
                }
                //ans++;
            }


        }
        System.out.println(count);
    }

    public static void main(String[] args){

        int[] nums = {1,3,2,5,8,4,7,6};
        //3 4 5 1 2

        int pos = 2;
        leftRotate(nums,pos);
       // tooChaotic(nums);
        marsExploration("SOSTMTSOP");

    }
}
