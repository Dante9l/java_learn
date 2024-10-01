package DataStructures;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2)
            return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        MergeSort.mergeSort(left);
        MergeSort.mergeSort(right);

        MergeSort.merge(arr, left, right);
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while(i < left.length)
            arr[k++] = left[i++];
        while(j < right.length)
            arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("排序前: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("排序后: " + Arrays.toString(array));
    }
}
