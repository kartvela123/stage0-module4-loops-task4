package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int num = 1; num <= lastPrinted; num ++) {
            if  (num % 3 != 0) {
                System.out.println(num);
            }
        }

    }
}
