package leet;

public class D_findMidInTwoSortedArray {
    public double findMedianSortedArrays_1(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        D_findMidInTwoSortedArray.merge(arr, nums1, nums2);
        return arr.length % 2 == 0 ?
                (arr[arr.length/2] + arr[arr.length/2 - 1])/2.0 :
                arr[arr.length / 2];
    }
    public static void merge(int[] arr, int[] num1, int[] num2){
        int i = 0, j = 0, k = 0;
        while(i < num1.length && j < num2.length){
            if (num1[i] <= num2[j])
                arr[k++] = num1[i++];
            else
                arr[k++] = num2[j++];
        }
        while(i < num1.length)
            arr[k++] = num1[i++];
        while(j < num2.length)
            arr[k++] = num2[j++];
    }
    //------------------------------------------------------------------
    public double findMedianSortedArrays_2(int[] nums1, int[] nums2) {
        // 确保 nums1 是较短的数组
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays_2(nums2, nums1);
        }

        int low = 0;
        int high = nums1.length;
        int k = (nums1.length + nums2.length + 1) / 2; // 中位数位置
        int nums1Mid = 0;
        int nums2Mid = 0;

        while (low <= high) {
            nums1Mid = low + (high - low) / 2; // nums1 的分界线
            nums2Mid = k - nums1Mid; // nums2 的分界线

            // 检查分界线
            if (nums1Mid > 0 && nums1[nums1Mid - 1] > nums2[nums2Mid])
                high = nums1Mid - 1; // nums1 划分太多，向左移动
             else if (nums1Mid < nums1.length && nums1[nums1Mid] < nums2[nums2Mid - 1])
                low = nums1Mid + 1; // nums1 划分太少，向右移动
             else
                // 找到合适的划分
                break;
        }

        // 计算中位数的左边和右边
        int midLeft = 0, midRight = 0;
        if (nums1Mid == 0)
            midLeft = nums2[nums2Mid - 1];
         else if (nums2Mid == 0)
            midLeft = nums1[nums1Mid - 1];
         else
            midLeft = Math.max(nums1[nums1Mid - 1], nums2[nums2Mid - 1]);


        // 如果总长度是奇数，直接返回中间的数
        if ((nums1.length + nums2.length) % 2 == 1)
            return (double) midLeft;


        // 如果总长度是偶数，计算中间两个数的平均值
        if (nums1Mid == nums1.length)
            midRight = nums2[nums2Mid];
         else if (nums2Mid == nums2.length)
            midRight = nums1[nums1Mid];
         else
            midRight = Math.min(nums1[nums1Mid], nums2[nums2Mid]);


        return (midLeft + midRight) / 2.0;
    }
}
