import java.util.Scanner;
public class HONG {
    public static void main(String[] args) {
        replace("Welcome to Java");
        countLowerCase("Welcome to Java");
        countInt("Welcome 20 to 21 Java");
        division(1, 30);
        userInput();
    }
    public static void replace(String message) {
        System.out.print("1_ Replace every character at odd index with \"&\": ");
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c != 32 && i % 2 != 0) {
                System.out.print("&");
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
    public static void countLowerCase(String message) {
        int numerOfLowerCase = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 97 & c <= 122) {
                numerOfLowerCase++;
            }
        }
        System.out.println("3_The number of lower case in your message is: " + numerOfLowerCase);
    }

    public static void countInt(String message) {
        int digits = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 48 & c <= 57) {
                digits++;
            }
        }
        System.out.println("4_The number of digits in your message is: " + digits);
    }

    public static void division(int start, int end) {
        System.out.println("5_");
        for (int i = start; i <= end; i++) {
            System.out.print(i + ": ");
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print("Apple-Orange ");
            }
            if (i % 2 == 0) {
                System.out.print("Apple ");
            }
            if (i % 3 == 0) {
                System.out.print("Orange ");
            }
            System.out.println();
        }
    }
    public static void userInput() {
        Scanner input = new Scanner(System.in);
        int choice;
        int numberOfInputs;
        boolean stop = false;
        String exit;
        while (!false) {
            System.out.println("Please select your input type:\n" +
                    "        1- int 2- double 3- String");
            System.out.println("Please write exit for exiting or continue writing .\n if you did not write exit,the program will stop.");
            choice = input.nextInt();
            System.out.println("Please define a number of inputs: ");
            numberOfInputs = input.nextInt();
            for (int i = 0; i < numberOfInputs; i++) {
                if (choice == 1) {
                    System.out.println("Please enter an int: ");
                } else if (choice == 2) {
                    System.out.println("Please enter a double: ");
                } else {
                    System.out.println("Please enter a String: ");
                }
                if (i == 0) {
                    input.nextLine();
                }
                exit = input.nextLine();
                if (exit.equals("exit") || exit.equals("Exit")) {
                    System.out.println("Thank you");
                    stop = true;
                } else if (choice == 1) {
                    int answer = Integer.parseInt(exit);
                } else if (choice == 2) {
                    double answer = Double.parseDouble(exit);
                }
                if (i == numberOfInputs - 1 && !exit.equals("exit")) {
                    System.out.println("You have not written exit so the system will finish");
                    System.exit(0);
                }
                if (stop) {
                    System.out.println("Do you want to continue: y/n");
                    exit = input.nextLine();
                    if (exit.equals("y") || exit.equals("Y")) {
                        stop = false;
                        break;
                    } else {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
