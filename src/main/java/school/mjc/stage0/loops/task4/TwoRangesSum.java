package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipped_sum = 0;
        int counted_sum = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last" );
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int num = 1; num <= lastInRow; num ++) {
                if (num % numberToSkip == 0) {
                    skipped_sum += num;
                }else {
                    counted_sum += num;
                }

            }
            System.out.println("skipped sum is " + skipped_sum);
            System.out.println("Counted sum is " + counted_sum);
        }

    }
}
