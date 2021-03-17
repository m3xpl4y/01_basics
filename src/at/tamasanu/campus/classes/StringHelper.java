package at.tamasanu.campus.classes;

public class StringHelper {

    public static boolean isPalindrome(String word) {
       String word2 = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(word2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int countLetters(String word)
    {
        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
            if (Character.isLetter(word.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public static String reverseString(String word)
    {
        word = new StringBuilder(word).reverse().toString();
        return word;
    }
}
