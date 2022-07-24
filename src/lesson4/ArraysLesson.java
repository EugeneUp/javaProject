package lesson4;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
//        switchOneAndZero(arr);
//        int[] arr1 = new int[100];
//        fillArrays(arr1);
//        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 6, 1};
//        ifLessSixMultiplyTwo(arr2);
//        int[][] arr3 = new int[3][3];
//        fillArrayDiagonals(arr3);
//        createArrayWithLengthAndValue(3, 5);
//        int[] arr4 = {121, 2, 36, 4, 5, 6, -9, 8, 9, 10};
//        checkMinAndMax(arr4);
//        int[] arr5 = {6, 1, 1, 1, 1, 1, 1};
//        System.out.println(checkBalance(arr5));
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        replaceToSetIndex(arr6, -5);
    }

    private static void switchOneAndZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
            System.out.print(arr[i]);
        }
    }

    private static void fillArrays(int[] arr) {
        int filler = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = filler;
            filler++;
            System.out.print(arr[i]);
        }
    }

    private static void ifLessSixMultiplyTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + ", ");
        }
    }

    private static void fillArrayDiagonals(int[][] arr) {
        int maxIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) || (i == maxIndex - j) || (j == maxIndex - i)) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    private static int[] createArrayWithLengthAndValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
        System.out.println();
        return arr;
    }

    private static void checkMinAndMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }
        System.out.println("minimum = " + min);
        System.out.println("maximum = " + max);
    }

    private static boolean checkBalance(int[] arr) {
        for (int divider = 0; divider < arr.length; divider++) {
            int sumLeft = 0, sumRight = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i <= divider) sumLeft += arr[i];
                else sumRight += arr[i];
            }
            System.out.println("sumLeft = " + sumLeft);
            System.out.println("sumRight = " + sumRight);
            if (sumLeft == sumRight) return true;
        }
        return false;
    }

    private static void replaceToSetIndex(int[] arr, int replace) {
        for (int i = 0; i < replace; i++) {
            int keeper = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    keeper = arr[j + 1];
                    arr[j + 1] = arr[j];
                } else {
                    int buffer;
                    if ((j + 1) != arr.length) {
                        buffer = arr[j + 1];
                        arr[j + 1] = keeper;
                    } else {
                        buffer = arr[0];
                        arr[0] = keeper;
                    }
                    keeper = buffer;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
