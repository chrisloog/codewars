public class Maskify {

    // https://www.codewars.com/kata/5412509bd436bd33920011bc

    public static void main(String[] args) {
        System.out.println(maskify("monkey on the tree"));
    }

    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
        }
        int length = str.length() - 4;
        return "#".repeat(length) + str.substring(length);
    }

}
