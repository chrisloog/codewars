public class JadenCase {

    // https://www.codewars.com/kata/5390bac347d09b7da40006f6

    public static void main(String[] args) {
        System.out.println(toJadenCase("ma olen kool tool sool pool nool rool vool"));
    }

	public static String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") {
            return null;
        }
        String[] words = phrase.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)));
            capitalized.append(word.substring(1));
            capitalized.append(" ");
        }
        return capitalized.toString().trim();
	}

}