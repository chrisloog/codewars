public class Order {

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order(""));
    }

    public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}
