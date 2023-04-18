package school.mjc.stage0.loops.task4;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;


class TwoRangesSumTest extends BaseIOTest {

    @Test
    void printSumOfTwoRangesPrintsSum() {
        TwoRangesSum rangesSum = new TwoRangesSum();

        rangesSum.printSumOfTwoRanges(5, 10);

        assertOutEquals("skipped sum is 15\ncounted sum is 40\n");
    }

    @Test
    void printSumOfTwoRangesPrintsError() {
        TwoRangesSum rangesSum = new TwoRangesSum();

        rangesSum.printSumOfTwoRanges(15, 10);

        assertOutEquals("number to skip is bigger then the last\n");
    }

    @Test
    void printSumOfTwoRangesPrintsSumWhenEqual() {
        TwoRangesSum rangesSum = new TwoRangesSum();

        rangesSum.printSumOfTwoRanges(10, 10);

        assertOutEquals("skipped sum is 55\ncounted sum is 0\n");
    }

    @Test
    void printSumOfTwoRangesPrintsSumWhenNegative() {
        TwoRangesSum rangesSum = new TwoRangesSum();

        rangesSum.printSumOfTwoRanges(-10, -1);

        assertOutEquals("last number in row is negative\n");
    }
}
