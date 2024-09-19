import java.util.*;
public class day11 {

    public static void main(String[] args) {
        String s = "abc";
        List<String> result = generatePermutations(s);
        System.out.println(result);
    }

    public static List<String> generatePermutations(String s) {
        Set<String> permutations = new HashSet<>();
        permute("", s, permutations);
        List<String> resultList = new ArrayList<>(permutations);
        Collections.sort(resultList); 
        return resultList;
    }

    private static void permute(String prefix, String remaining, Set<String> permutations) {
        if (remaining.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permute(newPrefix, newRemaining, permutations);
            }
        }
    }
}
