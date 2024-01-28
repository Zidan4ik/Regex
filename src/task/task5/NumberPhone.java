package task.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    public static void checkingNumber() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введіть номер: ");
            String number = scanner.nextLine();

            Pattern pattern = Pattern.compile("^(380)(5[0-7]|[69][1-46-8]|99|73|4[13-8]|3[1-9])\\d{7}$");
            Matcher matcher = pattern.matcher(number);

            if (matcher.find()) {
                System.out.println("Номер телефона введено коректно");
                break;
            } else {
                System.out.print("Номер телефона введено не коректно.");
                if (number.length() == 12) {
                    System.out.println(" Перевірте правильність запису...");
                } else {
                    System.out.println(" Перевірте кількість цифр...");
                }
            }
        }
        scanner.close();
    }
}
