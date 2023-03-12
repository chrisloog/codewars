public class Max {
    
    // https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/java

    public static int sequence(int[] arr) {
        int maxSum = 0, currentSum = 0;
        for (int i : arr) {
            currentSum += i;
            maxSum = Math.max(maxSum, currentSum);
            currentSum = Math.max(currentSum, 0);
        }
        return maxSum;
    }
}