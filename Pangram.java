import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputSentence);
        System.out.println("Is the sentence a pangram? " + (isPangram ? "Yes" : "No"));
    }

    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase and remove non-alphabetic characters
        String sanitizedSentence = sentence.toLowerCase().replaceAll("[^a-z]", "");

        // Create a set to store the unique letters
        Set<Character> letters = new HashSet<>();

        // Add each letter to the set
        for (char letter : sanitizedSentence.toCharArray()) {
            letters.add(letter);
        }

        // Check if all letters from 'a' to 'z' are present
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!letters.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}

