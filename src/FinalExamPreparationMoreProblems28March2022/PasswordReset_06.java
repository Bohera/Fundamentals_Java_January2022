package FinalExamPreparationMoreProblems28March2022;

import java.util.Scanner;

public class PasswordReset_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Done")) {
            String[] data = commandLine.split(" ");
            String command = data[0];
            StringBuilder tempPassword = new StringBuilder();
            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            tempPassword.append(password.charAt(i));
                        }
                    }
                    password = tempPassword;
                    System.out.println(password);
                    break;
                case "Cut":
                    password.replace(Integer.parseInt(data[1]), Integer.parseInt(data[1]) + Integer.parseInt(data[2]), "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    if (password.toString().contains(data[1])) {
                       password = new StringBuilder(password.toString().replace(data[1], data[2])) ;
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }

}
