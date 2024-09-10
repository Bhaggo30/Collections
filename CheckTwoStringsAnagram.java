import java.util.HashMap;
import java.util.Map;

public class CheckTwoStringsAnagram {
        public static boolean areAnagrams(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }

            Map<Character, Integer> charCountMap = new HashMap<>();

            // Count characters in the first string
            for (char c : s1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Subtract counts based on the second string
            for (char c : s2.toCharArray()) {
                if (!charCountMap.containsKey(c)) {
                    return false;
                }
                charCountMap.put(c, charCountMap.get(c) - 1);
                if (charCountMap.get(c) == 0) {
                    charCountMap.remove(c);
                }
            }

            return charCountMap.isEmpty();
        }

        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";
            System.out.println("Are anagrams: " + areAnagrams(s1, s2));
        }
    }


