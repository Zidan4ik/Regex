package task.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void checkDate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть строку (date) на перевірку правильності: ");
            String date = scanner.nextLine();

            String validation = "^((0[1-9]|1[0-9]|2[0-9]|3[0-1])\\.)+((0[13-9]|1[0-2])\\.)+([0-9]{4})$|^((0[1-9]|1[0-9]|2[0-9])\\.)+(02\\.)+(\\d{2}(([02468][048])|([13579][26]))|([02468][048]|[13579][26])00)$|^((0[1-9]|1[0-9]|2[0-8])\\.)+((02)\\.)+([0-9]{4})$|^((0[1-9]|1[0-9]|2[0-9]|3[0-1])\\.)+((0[13-9]|1[0-2])\\.)+([0-9]{4}) +\\d[0-23]\\:\\d[0-59]\\:\\d[0-59]$|^((0[1-9]|1[0-9]|2[0-9])\\.)+(02\\.)*(\\d{2}(([02468][048])|([13579][26]))|([02468][048]|[13579][26])00) +\\d[0-23]\\:\\d[0-59]\\:\\d[0-59]$|^((0[1-9]|1[0-9]|2[0-8])\\.)+((02)\\.)+([0-9]{4}) +\\d[0-23]\\:\\d[0-59]\\:\\d[0-59]$|^((0[1-9]|1[0-2])\\.)+([0-9]{4})$|^([0-9]{4})$";

            Pattern pattern = Pattern.compile(validation);
            if (date.contains("/")) {
                String MPS = validation.replace("\\.", "\\/");
                pattern = Pattern.compile(MPS);
            }
            Matcher matcher = pattern.matcher(date);

            if (matcher.find()) {
                rebuild(date);
            } else {
                System.out.println("не правильно");
            }

        }
    }

    public static void rebuild(String date) {
        String[] array = date.split(" ");
        String[] arrayDate = new String[0];
        String[] arrayTime = new String[0];
        String result = "";
        if (array.length == 1) {
            if (array[0].contains("/")) {
                arrayDate = array[0].split("/");
            } else if (array[0].contains(".")) {
                arrayDate = array[0].split("\\.");
            } else {
                arrayDate = array;
            }
        } else if (array.length == 2) {
            if (array[0].contains("/")) {
                arrayDate = array[0].split("/");
            } else if (array[0].contains(".")) {
                arrayDate = array[0].split("\\.");
            }

            arrayTime = array[1].split(":");
        }
        if (arrayDate.length != 0 && arrayTime.length != 0) {
            if (arrayDate.length == 1) {
                result += "рік: " + arrayDate[0];
            } else if (arrayDate.length == 2) {
                result += "місяць: " + arrayDate[0] + ", рік: " + arrayDate[1];
            } else if (arrayDate.length == 3) {
                result += "день: " + arrayDate[0] + ", місяць: " + arrayDate[1] + ", рік: " + arrayDate[2];
            }

            if (arrayTime.length == 1) {
                result += ", " + arrayTime[0] + " годин. ";
            } else if (arrayTime.length == 2) {
                result += ", " + arrayTime[0] + " годин " + arrayTime[1] + " хвилин. ";
            } else if (arrayTime.length == 3) {
                result += ", " + arrayTime[0] + " годин " + arrayTime[1] + " хвилин " + arrayTime[2] + " секунд. ";
            }
        } else {
            if (arrayDate.length == 1) {
                result += "рік: " + arrayDate[0];
            } else if (arrayDate.length == 2) {
                result += "місяць: " + arrayDate[0] + ", рік: " + arrayDate[1];
            } else if (arrayDate.length == 3) {
                result += "день: " + arrayDate[0] + ", місяць: " + arrayDate[1] + ", рік: " + arrayDate[2];
            }
        }
        System.out.println(result);
    }
}
