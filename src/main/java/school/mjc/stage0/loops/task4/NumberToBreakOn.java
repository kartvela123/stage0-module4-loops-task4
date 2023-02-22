package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil) {
            System.out.println("iterating till the end");
        }
        for (int num = 1; num <= numberToGoUntil; num ++) {
            if (num == toBreakWith) {
                System.out.println(num);
                break;
            }else {
                System.out.println(num);
            }
        }

    }
}
