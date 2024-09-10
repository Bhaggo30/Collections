import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingCharcterOfString {

        public static char firstNonRepeatingChar(String s) {
            Map<Character, Integer> charCount = new LinkedHashMap<>();

            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }


            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            return '_';
        }

        public static void main(String[] args) {
            String input = "swiss";
            System.out.println("First non-repeating character: " + firstNonRepeatingChar(input));
        }
    }


