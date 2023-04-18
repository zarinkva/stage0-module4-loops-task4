package school.mjc.stage0.loops.task4;
public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        // Case when lastInRow is negative
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        // Case when numberToSkip is greater than lastInRow
        if (numberToSkip >= lastInRow) {
            System.out.println("number to skip is bigger than the last");
            return;
        }

        int skippedSum = 0;
        int countedSum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i % numberToSkip == 0) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }


    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(1,10);
    }
}

