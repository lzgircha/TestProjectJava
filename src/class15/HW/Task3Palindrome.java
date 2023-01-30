package class15.HW;

public class Task3Palindrome {
    //3) Create a method that will print whether given String is palindrome or not.

    Boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j;
        i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "Madam";
        Task3Palindrome tPal =new Task3Palindrome();
        System.out.println(tPal.isPalindrome(str));
    }
}



