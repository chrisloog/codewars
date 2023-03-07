public class Dinglemouse {

    // https://www.codewars.com/kata/5821cd4770ca285b1f0001d5

    public static void main(String[] args) {
        int[] dice = {2, 1, 5, 1, 5, 4};
        int[] board = {0, 0, 3, 0, 0, 0, 0, -2, 0, 0, 0};
        System.out.println(snakesAndLadders(board, dice));
    }

    public static int snakesAndLadders(final int[] board, final int[] dice) {
        int position = 0;
        int throwsLeft = dice.length;
        
        while (throwsLeft > 0 && position < board.length - 1) {
            int diceRoll = dice[dice.length - throwsLeft];
            position += diceRoll;
            
            if (position < board.length && board[position] != 0) {
                position += board[position];
            }

            if (position > board.length - 1) {
                position -= diceRoll;
                throwsLeft--;
                continue;
            }
            
            if (position == board.length - 1) {
                return position;
            }
            
            throwsLeft--;
        }
        return position;
    }

}
