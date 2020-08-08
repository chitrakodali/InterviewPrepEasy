public class MostWaterFilledinArea {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main(String[] args){
        MostWaterFilledinArea ma = new MostWaterFilledinArea();
        int[] nums = {1,2,100,1,1,1,1,1,2};
        System.out.println(ma.maxArea(nums));

    }
}
