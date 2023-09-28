package сom.aston.machuga.task_1;

import java.util.Scanner;

public class NumberValidator {

    public static final int INT = 7;
    public static final String PROMPT = "Введите число";
    public static final String GREETING = "Привет";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PROMPT);
        int number = scanner.nextInt();
        if (number > INT) {
            System.out.println(GREETING);
        }
    }
}
