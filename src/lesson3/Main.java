package lesson3;

public class Main {
    public static void main(String[] args) {
//        printSquare();
//        printDiagonalSquare();
//        printDiagonalTriangle();
//        printSquareWithDoubleFrame();
//        printHueta();
//        checkSumFromTenToTwelve(11, 10);
//        checkPositiveOrNegative(-1);
//        checkIsNegative(1);
//        printTextSeveralTimes("Zalupa Lyagushki", 1);
        checkIsLeapYear(2024);
    }

    private static void printSquare() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printDiagonalSquare() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5 || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printDiagonalTriangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 5 || j == 0 || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void printSquareWithDoubleFrame() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i == 2 || i == 3) && (j == 2 || j == 3)) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printHueta() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j <= 1 && i >= 4) || (i <= 1 && j >= 4)) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static boolean checkSumFromTenToTwelve(int a, int b) {
        int sum = a + b;
        if ((sum >= 10) && (sum <= 20)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    private static void checkPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println(a + " - positive number");
        } else System.out.println(a + " - negative number");
    }

    private static boolean checkIsNegative(int a) {
        if (a >= 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    private static void printTextSeveralTimes(String text, int iteration) {
        for (; iteration > 0; --iteration) {
            System.out.println(text);
        }
    }

    private static boolean checkIsLeapYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
