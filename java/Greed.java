public class Greed {

    // https://www.codewars.com/kata/5270d0d18625160ada0000e4

    public static int greedy(int[] dice) {
        int[] counts = new int[7]; // initialize counts to all zeros
        for (int value : dice) {
            counts[value]++;
        }
        int score = 0;
        // Check for triplets of 1-6 and add corresponding points to score
        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 3) {
                score += i == 1 ? 1000 : i * 100;
                counts[i] -= 3;
            }
        }
        // Add points for individual 1's and 5's
        score += counts[1] * 100 + counts[5] * 50;
        return score;
    }

}
