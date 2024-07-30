package leetcodetasks;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        // Check if number is negative
        if (x < 0) {
            return false;
        }

        int temp = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10; //121%10=1  12%10=2  1%1=1
            x = x / 10;
            reverse = reverse * 10 + digit; // 0*10+1=1   1*10+2=12  12*10+1=121

        }
        return reverse == temp;

    }
}
