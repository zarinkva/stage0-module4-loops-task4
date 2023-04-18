package school.mjc.stage0.loops.task4;
public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        //lastPrinted=30;
        for (int i = 1; i <= lastPrinted; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SkippingThird skippingThird = new SkippingThird();
        int n=30;
        skippingThird.printUntilButThird(n);
    }
}

