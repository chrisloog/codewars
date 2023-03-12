public class Greed {

    // https://www.codewars.com/kata/5270d0d18625160ada0000e4

    public static int greedy(int[] dice) {
        int[] counts = new int[7];
        for (int value : dice) {
            counts[value]++;
        }
        int score = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                score += i == 1 ? 1000 : i * 100;
                counts[i] -= 3;
            }
        }
        score += counts[1] * 100 + counts[5] * 50;
        return score;
    }

}
