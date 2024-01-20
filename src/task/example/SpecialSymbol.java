package task.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialSymbol {
    public static void main(String[] args) {
        int year = 2003;
        String n3 = "[A-z]+\\(+\\d{2}.\\d{2}." + year + "*\\)";
        Pattern p3 = Pattern.compile(n3);
        Matcher matcher3 = p3.matcher("День народження друзів:" +
                "Roma(28.12.2003) Khristina(05.01.2005) Andriy(12.06.2003) Vasya(28.02.2002)" +
                "Denys-(20.08.2003)");
        int count = 0;
        while (matcher3.find()) {
            count++;
            System.out.println(count+" "+matcher3.group());
        }
        System.out.println();
        System.out.println("кількість людей народилось " + year + " : " + count);

    }
}
