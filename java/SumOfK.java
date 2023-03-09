import java.util.*;

public class SumOfK {

    // https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (ls.size() < k) {
            return null;
        }
    
        int result = 0;
    
        for (int i = 0; i < 1 << ls.size(); i++) {
            if (Integer.bitCount(i) == k) {
                int sum = 0;
                for (int j = 0; j < ls.size(); j++) {
                    if ((i & 1 << j) != 0) {
                        sum += ls.get(j);
                    }
                }
                if (sum > result && sum <= t) {
                    result = sum;
                }
            }
        }
    
        return result > 0 ? result : null;
    }
    
}
