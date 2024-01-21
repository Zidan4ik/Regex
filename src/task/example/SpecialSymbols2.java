package task.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialSymbols2 {
    public static void main(String[] args) { // <([{\^-=$!|]})?*+.>

        Pattern pattern1 = Pattern.compile("ab*\\w+");
        Matcher matcher1 = pattern1.matcher("ac abbc");
        System.out.print("\nexample 1:  ");
        while (matcher1.find()) {System.out.print(matcher1.group()+" ");}

        Pattern pattern2 = Pattern.compile("ab+\\w+");
        Matcher matcher2 = pattern2.matcher("ac abbc");
        System.out.print("\n\nexample 2:  ");
        while (matcher2.find()) {System.out.print(matcher2.group()+" ");}

        Pattern pattern3 = Pattern.compile("ab?\\w+");
        Matcher matcher3 = pattern3.matcher("ac abbc");
        System.out.print("\n\nexample 3:  ");
        while (matcher3.find()) {System.out.print(matcher3.group()+" ");}

        Pattern pattern4 = Pattern.compile(".+");
        Matcher matcher4 = pattern4.matcher("ac abbc");
        System.out.print("\n\nexample 4:  ");
        while (matcher4.find()) {System.out.print(matcher4.group()+" ");}

        Pattern pattern5 = Pattern.compile("(ac)*");
        Matcher matcher5 = pattern5.matcher("ac aaa ccc ");
        System.out.print("\n\nexample 5:  ");
        while (matcher5.find()) {System.out.print(matcher5.group()+" ");}

        Pattern pattern6 = Pattern.compile("<\\w+>");
        Matcher matcher6 = pattern6.matcher(">ac< <aaa> c<c>c  abc");
        System.out.print("\n\nexample 6:  ");
        while (matcher6.find()) {System.out.print(matcher6.group()+" ");}

        Pattern pattern7 = Pattern.compile("\\b[a-c]+\\b");
        Matcher matcher7 = pattern7.matcher("ac aaaa ccc abcd abc123");
        System.out.print("\n\nexample 7:  ");
        while (matcher7.find()) {System.out.print(matcher7.group()+" ");}

        Pattern pattern8 = Pattern.compile("^(ac)+\\w+123$");
        Matcher matcher8_1 = pattern8.matcher("ac_abc_123");
        Matcher matcher8_2 = pattern8.matcher("abc_abc_1234");
        System.out.print("\n\nexample 8.1:  ");
        while (matcher8_1.find()) {System.out.print(matcher8_1.group()+" ");}
        System.out.print("\nexample 8.2:  ");
        while (matcher8_2.find()) {System.out.print(matcher8_2.group()+" ");}


        Pattern pattern9 = Pattern.compile("\\b[a-c|1-3]+\\b");
        Matcher matcher9 = pattern9.matcher("abc bca 123 321 111 0123 abp1 abc123");
        System.out.print("\n\nexample 9:  ");
        while (matcher9.find()) {System.out.print(matcher9.group()+" ");}

        Pattern pattern10 = Pattern.compile("\\w+\\.");
        Matcher matcher10 = pattern10.matcher("abc abc. 123 123. ab.c");
        System.out.print("\n\nexample 10:  ");
        while (matcher10.find()) {System.out.print(matcher10.group()+" ");}

        Pattern pattern11 = Pattern.compile("\\b[^abc]+\\b");
        Matcher matcher11 = pattern11.matcher("abc aff fake joke bear");
        System.out.print("\n\nexample 11:  ");
        while (matcher11.find()) {System.out.print(matcher11.group()+" ");}

    }
}
