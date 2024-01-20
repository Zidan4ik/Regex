package task.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
            String s = "\\w+\\d*0{2}\\d*@((gmail\\.com)|(lpnu\\.ua))";
//        String s = "\\w+\\d+0{2}+\\d*@+\\w*(gmail||lpnu).\\w+(com||ua)";
        Pattern pattern = Pattern.compile(s);
        String emails = "romich20031@gmail.com kristinaaaS@ukr.net denysF@lpnu.ua dmytro20031@lpnu.ua " +
                "work200@lpnu.com dima1001@gmail.com dima1002@gmail1com";
        Matcher m = pattern.matcher(emails);

        while(m.find()){

            System.out.println(m.group());
        }
    }
}
