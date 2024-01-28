package task.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Умова: 1 - цифра, 1 - літера в верхньому регістрі, 1 символ на вибір(.,/?), розмір пароля 8 або більше символів.");
            System.out.println("Введіть пароль:");
            String password = scanner.nextLine();
            Pattern pattern = Pattern.compile("^((?=[^\\s]*[\\.\\,\\?\\/])(?=[^\\s]*[A-Z])(?=[^\\s]*[0-9])[A-z0-9\\.\\,\\/\\?]{8})[^\\s]*$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                System.out.println("Пароль сформований коректно для безпеки");
                break;
            } else {
                System.out.println("Пароль не сформований коректно для безпеки");
            }

        }
        scanner.close();
    }
}
