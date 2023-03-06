public class CamelCase {

    // https://www.codewars.com/kata/587731fda577b3d1b0001196

    public static void main(String[] args) {
        System.out.println(camelCase(" camel case word"));
    }

    public static String camelCase(String str) {
        if (str.isEmpty() || str == null) {
            return "";
        }
        if (str.charAt(0) == ' ') {
            str = str.substring(1);
        }
        String[] words = str.split("\s+");
        String result = "";
        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1);;
        }
        return result.trim();
    }

}