public class BitCounting {

	// https://www.codewars.com/kata/526571aae218b8ee490006f4

	public static int countBits(int n) {
		String binaryString = Integer.toBinaryString(n);
		int result = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				result++;
			}
		}
		return result;
	}

	public static int countBitsSimplified(int n) {
		int result = 0;
    	while (n != 0) {
        	result += n & 1;
        	n >>>= 1;
    	}
    	return result;
	}
	
}