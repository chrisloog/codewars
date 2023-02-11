public class BitCounting {

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