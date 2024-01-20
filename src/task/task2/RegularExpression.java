package task.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        checkEmail();
    }
    public static void checkEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть строку (email) на перевірку правильності: ");
        String email = scanner.nextLine();

        String validation = "[a-zA-Z0-9]+@[a-z]{2,5}\\.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(validation);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            System.out.println("правильно");
        } else {
            System.out.println("не правильно");
        }

        scanner.close();
    }
}
