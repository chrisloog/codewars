public class Maskify {

    public static void main(String[] args) {
        System.out.println(maskify("monkey on the tree"));
    }

    public static String maskify(String str) {
        if (str.length() < 4) {
            return str;
          }
          int length = str.length() - 4;
          String replacement = "";
          for (int i = 0; i < length; i++) {
              replacement += "#";
          }
          return replacement + str.substring(str.length() - 4);
    }

}