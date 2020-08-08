public class UnwantedDuplicates {

    public static int unWantedDupRemove(int[] nums){

        int j=1,  count = 1;

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                count ++;
            }
            else
                count =1;
            if(count <=2){
                nums[j++] = nums[i];
                System.out.println(j +" i is here" + i + " nums[i]- " + nums[i]);
            }
        }
        return j;
    }
    public static void main(String[] args){

        int[] nums = {1,1,1,2,2,3,4};
        System.out.println(unWantedDupRemove(nums));
    }
}
