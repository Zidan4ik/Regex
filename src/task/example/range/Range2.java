package task.example.range;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Range2 {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[abc]+");
        Pattern pattern2 = Pattern.compile("[a-c]+");
        Pattern pattern3 = Pattern.compile("[0-9][0-9]");
        Pattern pattern4 = Pattern.compile("[2-5]");
        Pattern pattern5 = Pattern.compile("[^2-5]+");
        Pattern pattern6 = Pattern.compile("[a-zA-Z]+");
        Pattern pattern7 = Pattern.compile("\\b[a-d[k-p]]+\\b");
        Pattern pattern8 = Pattern.compile("\\b[a-z&&[def]]+\\b");
        Pattern pattern9 = Pattern.compile("\\b[a-z&&[^k-p]]+\\b");

        System.out.println("***************Range***************");
        Matcher matcher = pattern1.matcher("ab bc af");
        System.out.print("\n\nexample 1:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}
        matcher = pattern2.matcher("ab bc af");
        System.out.print("\nexample 2:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern3.matcher("12 111 1 a a1 1a");
        System.out.print("\n\nexample 3:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern4.matcher("193 121 1 a a1 1a ");
        System.out.print("\n\nexample 4:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern5.matcher("1293 1281 1 a a01 1a ");
        System.out.print("\n\nexample 5:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern6.matcher("abc ABC 123 a1 A1 ");
        System.out.print("\n\nexample 6:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern7.matcher("abcd klmnp klmnpq abe");
        System.out.print("\n\nexample 7:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern8.matcher("def daf d1ef");
        System.out.print("\n\nexample 8:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern9.matcher("abc klp abcklp");
        System.out.print("\n\nexample 9:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

    }
}
