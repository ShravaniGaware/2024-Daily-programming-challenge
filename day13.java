public class day13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String A = "babad";
        String longestPalindrome = "";

        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j <= A.length(); j++) {
                String substring = A.substring(i, j);

               
                if (isPalindrome(substring)) {
                    if (substring.length() > longestPalindrome.length()) {
                        longestPalindrome = substring;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome: " + longestPalindrome);
    }

    
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


