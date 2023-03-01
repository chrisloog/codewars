public class Sum {

    // https://www.codewars.com/kata/55f2b110f61eb01779000053
    
    public int GetSum(int a, int b) {
        int result = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
            return result;
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                result += i;
            }
            return result;
        } 
        return a;
    }

}
