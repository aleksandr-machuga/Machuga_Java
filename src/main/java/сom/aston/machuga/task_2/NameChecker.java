package сom.aston.machuga.task_2;

import java.util.Scanner;

public class NameChecker {

    public static final String PROMPT = "Введите имя";
    public static final String TARGET_NAME = "Вячеслав";
    public static final String GREETING = "Привет, " + TARGET_NAME;
    public static final String MESSAGE_THAT_NAME_IS_MISSING = "Нет такого имени";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PROMPT);
        String name = scanner.nextLine();
        if (name.equals(TARGET_NAME)) {
            System.out.println(GREETING);
        } else {
            System.out.println(MESSAGE_THAT_NAME_IS_MISSING);
        }
    }
}
