public class NumberUtils {

    // https://www.codewars.com/kata/5287e858c6b5a9678200083c
    
    public static boolean isNarcissistic(int number) {
        String numStr = Integer.toString(number);
        int power = numStr.length();
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

}
