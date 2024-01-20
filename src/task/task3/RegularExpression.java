package task.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void checkDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть строку (date) на перевірку правильності: ");
        String email = scanner.nextLine();

        String validation = "((\\b(0[1-9]|1[0-9]|2[0-8]|3[1-2])+\\.(0[1-9]|1[0-2])*\\.*((0[0-9]{3})|(1[0-9]{3})|(2[0-9]{3}))\\b))|((\\b(0[1-9]|1[0-9]|2[0-8]|3[1-2])+\\/(0[1-9]|1[0-2])*\\/*((0[0-9]{3})|(1[0-9]{3})|(2[0-9]{3}))\\b)) | (0[0-9]{3})|(1[0-9]{3})|(2[0-9]{3})";
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
