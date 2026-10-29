package vn.example;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java vn.example.Main <number1> <number2>");
            return;
        }

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println(PositiveCounter.countPositive(first, second));
    }
}
