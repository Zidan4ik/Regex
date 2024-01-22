package task.task3;

import java.util.Arrays;

import static task.task3.RegularExpression.checkDate;
import static task.task3.RegularExpression.rebuild;

public class Starter {
    public static void main(String[] args) {
        String date = checkDate();
        rebuild(date);
    }
}
