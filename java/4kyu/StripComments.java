public class StripComments {

    // https://www.codewars.com/kata/51c8e37cee245da6b40000bd/java

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder sb = new StringBuilder();
        String[] lines = text.split("\n");
        for (String line : lines) {
            int index = -1;
            for (String commentSymbol : commentSymbols) {
                int i = line.indexOf(commentSymbol);
                if (i >= 0 && (index == -1 || i < index)) {
                    index = i;
                }
            }
            if (index >= 0) {
                sb.append(line.substring(0, index).trim());
            } else {
                sb.append(line.trim());
            }
            sb.append('\n');
        }
        return sb.toString().trim();
    }
    
}
