package lessonJava.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int vowelCount = 0;
        int consonantCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = input.nextLine();

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        if (vowels.contains(ch)) {
                            vowelCount++;
                        } else {
                            consonantCount++;
                        }
                    }
                }
            }
            System.out.println("The number of vowels is " + vowelCount + " and consonants is " + consonantCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
