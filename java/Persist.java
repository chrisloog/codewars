public class Persist {

    public static void main(String[] args) {
		System.out.println(persistence(39) + " should be 3.");
        System.out.println(persistence(4) + " should be 0.");
        System.out.println(persistence(25) + " should be 2.");
        System.out.println(persistence(999) + " should be 3.");
    }

    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            int result = 1;
            while (n > 0) {
                result *= n % 10;
                n /= 10;
            }
            count++;
            n = result;
        }
        return count;
	}
}
