package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    if (isValidIndex(index, arr.length)) {
                        exchange(arr, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equals("even")) {
                        printEvenMax(arr);
                    } else {
                        printOddMax(arr);
                    }
                    break;
                case "min":
                    if (data[1].equals("even")) {
                        printEvenMin(arr);
                    } else {
                        printOddMin(arr);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printFirstEven(arr, count);
                        } else {
                            printFirstOdd(arr, count);
                        }
                    }
                    break;
                case "last":
                    count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printLastEven(arr, count);
                        } else {
                            printLastOdd(arr, count);
                        }
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    private static void exchange(int[] array, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[array.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = array[i];
        }
        for (int j = 0; j < second.length; j++) {
            second[j] = array[first.length + j];
        }
        for (int i = 0; i < array.length; i++) {
            if (i < second.length) {
                array[i] = second[i];
            } else {
                array[i] = first[i - second.length];
            }
        }
    }

    private static void printEvenMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 == 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printOddMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 != 0) {
                maxNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printFirstEven(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            }
        }
        if (bufferArr[0] == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < bufferArr.length; i++) {
                if (bufferArr[i] != 0) {
                    if (i != 0) {
                        System.out.print(", ");
                    }
                    System.out.print(bufferArr[i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void printFirstOdd(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            }
        }
        if (bufferArr[0] == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < bufferArr.length; i++) {
                if (bufferArr[i] != 0) {
                    if (i != 0) {
                        System.out.print(", ");
                    }
                    System.out.print(bufferArr[i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void printLastEven(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            }
        }
        if (bufferArr[0] == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < bufferArr.length; i++) {
                if (bufferArr[i] != 0) {
                    if (i != 0) {
                        System.out.print(", ");
                    }
                    System.out.print(bufferArr[i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void printLastOdd(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            }
        }
        if (bufferArr[0] == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < bufferArr.length; i++) {
                if (bufferArr[i] != 0) {
                    if (i != 0) {
                        System.out.print(", ");
                    }
                    System.out.print(bufferArr[i]);
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static void printEvenMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 == 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void printOddMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 != 0) {
                minNumber = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }
}
