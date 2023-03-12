import static java.util.Arrays.stream;

public class FindOutlier{

    // https://www.codewars.com/kata/5526fc09a1bbd946250002dc

    public static int find(int[] integers) {
        final int p = stream(integers).limit(3).map(Math::abs).map(i -> i % 2).sum() / 2;
		return stream(integers).filter(i -> Math.abs(i) % 2 != p).findFirst().getAsInt();
    }

}