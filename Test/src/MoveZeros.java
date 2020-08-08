public class MoveZeros {

    public static void moveZerosEnd(int nums[]){
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }

            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
        for (int i1 : nums){
            System.out.println(i1 +",");
        }
    }
    public static void moveZeros(int a[]){
        int i = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] != 0)
                a[i++] = a[j];
        }

        while (i < a.length) {
            a[i++] = 0;
        }
        for (int i1 : a){
            System.out.println(i1 +",");
        }
    }

    public static void main(String args []){
     int a[] = {1,8,0,4,0,7,0};
     //moveZerosEnd(a);
        moveZeros(a);
    }
}
