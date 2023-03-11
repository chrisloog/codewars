public class Kata{

    // https://www.codewars.com/kata/551f37452ff852b7bd000139

    public static void main(String[] args) {
        System.out.println(binaryAddition(1, 1));
        System.out.println(binaryAddition(5, 9));
    }
  
    public static String binaryAddition(int a, int b){
      System.out.printf("(%s + %s = %s in decimal or %s in binary)%n", a, b, a + b, Integer.toBinaryString(a + b));
      return Integer.toBinaryString(a + b);
    }
  }
