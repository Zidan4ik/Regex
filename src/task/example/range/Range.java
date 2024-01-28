package task.example.range;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Range {
    public static void main(String[] args) {
        String expression = "[A-Z]{2}+[0-9]{3,4}+[A-Z]{2}";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher("VK1213VK OO11OO S01234SS PP123PP KN1234OP" +
                "kk1234kk  KK1-00IP");
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
