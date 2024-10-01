package lessonJava;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.Scanner;

public class lesPra21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        String input = sc.nextLine();
        int[] numbers = new int[10];
        int max = (int)input.charAt(0) - 48, min = (int)input.charAt(0) - 48, sum = 0, flag = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(input.split(" ")[i]);
            min = Math.min(numbers[i], min);
            max = Math.max(numbers[i], max);
            sum += numbers[i];
            if (numbers[i] % 2 != 0)
                flag++;
        }
        Arrays.sort(numbers);
        System.out.println("Enter a number to search:");
        int search = sc.nextInt();
        System.out.println("The number " + search + " is " + (Arrays.binarySearch(numbers, search) >= 0 ? "found" : "not found"));
        System.out.println("The smallest number is " + min);
        System.out.println("The largest number is " + max);
        System.out.println("The sum of the numbers is " + sum);
        System.out.println("The number of odd numbers is " + flag);
    }
}
