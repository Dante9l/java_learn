package leet;

public class K_maxArea {
    public int maxArea(int[] height){
        int max = 0, start = 0, end = height.length-1;

        for (int i = 0; i < height.length; i++){
            if (height[start] < height[end]){
                max = Math.max(max, height[start] * (end - start));
                start++;
            } else {
                max = Math.max(max, height[end] * (end - start));
                end--;
            }
        }
        return max;
    }
}
