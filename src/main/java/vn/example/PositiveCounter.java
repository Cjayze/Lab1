package vn.example;

public final class PositiveCounter {
    private PositiveCounter() {
    }

    public static int countPositive(int first, int second) {
        int[] values = {first, second};
        int count = 0;

        for (int value : values) {
            if (value > 0) {
                count++;
            }
        }

        return count;
    }
}
