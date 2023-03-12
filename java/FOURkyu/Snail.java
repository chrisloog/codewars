package FOURkyu;

import java.util.*;

public class Snail {

    // https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.toString(snail(input)));
    }
    
    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0, rowEnd = array.length-1;
        int colStart = 0, colEnd = array[0].length-1;
    
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int col = colStart; col <= colEnd; col++) {
                result.add(array[rowStart][col]);
            }
            rowStart++;
    
            for (int row = rowStart; row <= rowEnd; row++) {
                result.add(array[row][colEnd]);
            }
            colEnd--;
    
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    result.add(array[rowEnd][col]);
                }
                rowEnd--;
            }
    
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    result.add(array[row][colStart]);
                }
                colStart++;
            }
        }
    
        return result.stream().mapToInt(i -> i).toArray();
    }
    
    
}
