package leet;

public class I_isPalindrome {
    public boolean isPalindrome(int i){
        if(i < 0)
            return false;
        int value = 0;
        int temp = i;

        while (temp != 0){
            value = value * 10;
            value += (temp % 10);
            temp = temp / 10;
        }
        return value == i;
    }
}
