package DataTypesAndVariables;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte b = 127;
        byte c = 0xF;

        long d = 2147483647 + 2147483647; // трябва числата първо числата да се обърнат в лонг, джава по дефаулт приема числата като инт.
        long e = 2147483647L + 2147483647; // L казва че литерала (буквалното число) е Long, малко l се бърка с 1;
        b++;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
