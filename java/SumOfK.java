import java.util.*;

public class SumOfK {

    // https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (ls.size() < k) {
            return null;
        }

        int result = 0;
        List<List<Integer>> allPossibilities = findSums(ls, k);

        for (List<Integer> list : allPossibilities) {
            if (getListSum(list) > result && getListSum(list) <= t) {
                result = getListSum(list);
            }
        }

        return result > 0 ? result : null;
    }

    private static List<List<Integer>> findSums(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<>();

        if (list == null || list.size() < k) {
            return result;
        }

        int[] indices = new int[k];
        for (int i = 0; i < k; i++) {
            indices[i] = i;
        }

        while (indices[0] < list.size() - k + 1) {
            List<Integer> sum = new ArrayList<>();
            for (int index : indices) {
                sum.add(list.get(index));
            }
            result.add(sum);

            int i = k - 1;
            while (i >= 0 && indices[i] == list.size() - k + i) {
                i--;
            }
            if (i < 0) {
                break;
            }
            indices[i]++;
            for (int j = i + 1; j < k; j++) {
                indices[j] = indices[j-1] + 1;
            }
        }

        return result;
    }

    private static int getListSum(List<Integer> integers) {
        int result = 0;
        for (Integer integer : integers) {
            result += integer;
        }
        return result;
    }
    
}
