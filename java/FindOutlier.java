public class FindOutlier{

    // https://www.codewars.com/kata/5526fc09a1bbd946250002dc

    public static int find(int[] integers) {
        int evenCount = 0, oddCount = 0, even = 0, odd = 0;
        for (int num : integers) {
            if (num % 2 == 0) {
                evenCount++;
                even = num;
            } else {
                oddCount++;
                odd = num;
            }
            if (evenCount > 1 && oddCount == 1) return odd;
            if (oddCount > 1 && evenCount == 1) return even;
        }
        return evenCount == 1 ? even : odd;
    }
        
}