public class BasicEncrypt {

    // https://www.codewars.com/kata/5862fb364f7ab46270000078

    public static String encrypt(String text, int rule) {
        StringBuilder encryptedTextBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int asciiValue = getWrappedAsciiValue(text.charAt(i) + rule);
            encryptedTextBuilder.append((char)asciiValue);
        }
        return encryptedTextBuilder.toString();
    }
    
    private static int getWrappedAsciiValue(int asciiValue) {
        int wrappedAsciiValue = asciiValue % 256;
        if (wrappedAsciiValue < 0) {
            wrappedAsciiValue += 256;
        }
        return wrappedAsciiValue;
    }
     
}
