import java.lang.StringBuilder;

class Solution{

    // https://www.codewars.com/kata/517abf86da9663f1d2000003

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                result.append(Character.toUpperCase(s.charAt(i + 1)));
                i++;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
