package javastring;
/*
 * Reverses a string and toggles the case of each character.
 * 
 */
import java.lang.Character;

public class StringReverserTogler {

    public static String reverseAndToggleCase(String str) {
        // Use StringBuilder for efficient string manipulation, as Java Strings are immutable.
        StringBuilder toggledReversed = new StringBuilder(str.length());
        
        // Iterate through the original string to toggle the case of each character
        for (int i = 0; i < str.length(); i++) {
            char originalChar = str.charAt(i);
            char toggledChar;

            if (Character.isUpperCase(originalChar)) {
                toggledChar = Character.toLowerCase(originalChar);
            } else if (Character.isLowerCase(originalChar)) {
                toggledChar = Character.toUpperCase(originalChar);
            } else {
                // Keep non-alphabetic characters as they are
                toggledChar = originalChar;
            }
            // Append the toggled character to the StringBuilder.
            toggledReversed.append(toggledChar);
        }

        // Reverse the entire sequence in the StringBuilder using the built-in reverse() method.
        toggledReversed.reverse();

        // Convert the StringBuilder back to a String and return it.
        return toggledReversed.toString();
    }

    public static void main(String[] args) {
        String originalString = "Hello World!";
        String result = reverseAndToggleCase(originalString);
        
        System.out.println("Original string: " + originalString);
        System.out.println("Toggled and Reversed string: " + result);
    }
}