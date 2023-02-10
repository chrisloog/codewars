import java.util.regex.Pattern;

public class SpinWords {

  public static void main(String args[])  {
    System.out.println(reverseWords("Welcome"));
  } 

  public static String spinWords(String sentence) {
    String result = "";
    String[] words = sentence.split("\\W+");
    for (String word : words) {
        if (word.length() > 4) {
            word = reverseWords(word);
            result += word;
        } else {
            result += word;
        }
    }
    return result;
  }

  static String reverseWords(String str)
    {
        String result = "";
        for (int j = (str.length() - 1); j <= 0; j--) {
            result += str.charAt(j);
        }
        return result;
    }
}