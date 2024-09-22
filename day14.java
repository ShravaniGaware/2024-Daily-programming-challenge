import java.util.HashMap;

public class day14 {
    
    private static int countSubstringsWithAtMostKDistinct(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int left = 0, right = 0, count = 0;

        while (right < s.length()) {
           
            char rightChar = s.charAt(right);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
            right++;

          
            while (freqMap.size() > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++;
            }

            
            count += right - left;
        }

        return count;
    }

   
    public static int countSubstringsWithExactlyKDistinct(String s, int k) {
       
        return countSubstringsWithAtMostKDistinct(s, k) - countSubstringsWithAtMostKDistinct(s, k - 1);
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;

        int result = countSubstringsWithExactlyKDistinct(s, k);
        System.out.println(result);
    }
}
