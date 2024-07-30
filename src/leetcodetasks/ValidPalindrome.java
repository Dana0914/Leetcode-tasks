package leetcodetasks;


public class ValidPalindrome {
    public static void main(String[] args) {
        //two pointers approach
        String s = " ";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int begin = 0;
        int end = s.length();
        StringBuilder palindrome = new StringBuilder();

        while (end > begin) {
            palindrome.append(s.charAt(end - 1));
            end--;
        }
        return palindrome.toString().equals(s);

//        //Naive approach
//        StringBuilder res = new StringBuilder();
//        for (int i = s.length()-1; i >= 0 ; i--) {
//            res.append(s.charAt(i));
//        }
//        if (s.contentEquals(res)) {
//            System.out.println("It is a palindrome");
//        }


    }
}
