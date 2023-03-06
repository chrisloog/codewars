public class CamelCase {

    // https://www.codewars.com/kata/587731fda577b3d1b0001196

    public static void main(String[] args) {
        System.out.println(camelCase(" camel case word"));
    }

    public static String camelCase(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] words = str.trim().split("\\s+");
        StringBuilder resultBuilder = new StringBuilder(); 
        for (String word : words) {
            if (!word.isEmpty()) {
                resultBuilder.append(Character.toUpperCase(word.charAt(0)));
                resultBuilder.append(word.substring(1));
            }
        }
        return resultBuilder.toString();
    }
    

}