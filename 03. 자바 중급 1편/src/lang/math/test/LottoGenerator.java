package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count<6) {
            int x = random.nextInt(44)+1;
            if (isUnique(x)) {
                lottoNumbers[count] = x;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int x) {
        for (int lottoNumber : lottoNumbers) {
            if (lottoNumber == x) return false;
        }
        return true;
    }
}
