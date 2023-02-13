import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        if (words == "" || words == null) {
            return "";
        }
        String result = "";
        String[] wordsStrings = words.split(" ");
        String[] orderedWords = new String[wordsStrings.length];
        for (String string : wordsStrings) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                orderedWords[number - 1] = string;
            }
        }
        for (String string : orderedWords) {
            result += string + " ";
        }
        return result.trim();
    }
}
