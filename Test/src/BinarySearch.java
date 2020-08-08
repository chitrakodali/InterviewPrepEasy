public class BinarySearch {

    public static int binarySearch(int[] num, int target){

        int start = 0;
        int end = num.length - 1;
        while (start <= end){

            int mid = (start + end) /2;

            if(num[mid] == target) {
                return mid;
            }
            else if (num[mid] < target){ //19 < 43
                start = mid+1;
            }
            else
                end = mid -1;

        }


        return -1;
    }
    public static int rotatedSearch(int[] num, int start, int end, int target){
        int mid = ( start + end ) /2;
        if (num[mid] == target)
            return mid;

        if (end < start )
            return -1;

        if (num[start] < num[mid] ){  //left side
            if ( target >= num[start] && target < num[mid]){
                return rotatedSearch(num,start,mid-1,target);
            }
            else
                return rotatedSearch(num,mid +1,end,target);
        }
        else if (num[mid] < num[end]){// right side
            if (target > num[mid] && target <= num[end]){
                return rotatedSearch(num,mid+1,end,target);
            }
            else
                return rotatedSearch(num,start,mid-1,target);

        }
        else if (num[start] == num[mid]){
            if (num[mid] != num[end])
                return rotatedSearch(num,mid+1,end,target);
            else
            {
                int result = rotatedSearch(num,start,mid-1,target);
                if (result == -1)
                    return rotatedSearch(num,mid+1,end,target);
                else
                    return result;

            }
        }
        return -1;

    }
    public static void main(String[] args){

          int[] n = {10,11,15,17,19,39,40,41,43};
        System.out.println("Target position" + BinarySearch.binarySearch(n,43));

      //  int arr[] = {40,24,100,-100,40,0,24,40,40};
      //  System.out.println( "The index is: " + rotatedSearch(arr, 0, 6, 24));
    }

}
