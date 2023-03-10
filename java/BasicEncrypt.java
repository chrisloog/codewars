public class BasicEncrypt {

    // https://www.codewars.com/kata/5862fb364f7ab46270000078

    public static String encrypt(String text, int rule) {
        StringBuilder encrypted = new StringBuilder();
		for(Character a: text.toCharArray()){
			encrypted.append(Character.toChars((a + rule) % 256)) ;
		}
	    return encrypted.toString(); 
    }  
     
}
