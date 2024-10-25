package lessonData.ch4;

public class Work1 {
    public static void rotateRight(int[] arr, int m) {
        int n = arr.length;
        m = m % n;
        reverse(arr, 0, n - 1);

        reverse(arr, 0, m - 1);

        reverse(arr, m, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] i = {1, 5, 6, 8, 4, 6, 3, 6, 7, 2};
        rotateRight(i, 4);
        for (int tar : i) System.out.print(tar + " ");
    }
}
