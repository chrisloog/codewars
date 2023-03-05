import java.math.BigInteger;

public class LastDigit {

    // https://www.codewars.com/kata/5511b2f550906349a70004e1/java

    public static void main(String[] args) {
        System.out.println(lastDigit(new BigInteger("9"), new BigInteger("7")));
    }

    public static int lastDigit(BigInteger n1, BigInteger n2) { 

        BigInteger number = pow(n1, n2);

        return number.remainder(BigInteger.TEN).intValue();
    }

    private static BigInteger pow(BigInteger base, BigInteger exponent) {
        BigInteger result = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) {
                result = result.multiply(base);
            }
            base = base.multiply(base);
            exponent = exponent.shiftRight(1);
        }
        return result;
    }
}
