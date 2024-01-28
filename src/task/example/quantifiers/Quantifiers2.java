package task.example.quantifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers2 {
    public static void main(String[] args) { // ?,*,+,{n},{n,},{n,w}.
        Pattern pattern1 = Pattern.compile("\\ba*\\b");
        Pattern pattern2 = Pattern.compile("\\ba+\\b");
        Pattern pattern3 = Pattern.compile("\\ba?\\b");
        Pattern pattern4 = Pattern.compile("\\b\\w{3}\\b");
        Pattern pattern5 = Pattern.compile("\\b\\w{3,}\\b");
        Pattern pattern6 = Pattern.compile("\\b\\w{3,5}\\b");

        Matcher matcher = pattern1.matcher("aaaaa");
        System.out.print("***************QUANTIFIERS***************\n\nexample 1:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern2.matcher("aaaaa");
        System.out.print("\n\nexample 2:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern3.matcher("aaaaa");
        System.out.print("\n\nexample 3:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern4.matcher("abc abcd abcdf");
        System.out.print("\n\nexample 4:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern5.matcher("a ab abc abcd abcdf abcdfe");
        System.out.print("\n\nexample 5:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}

        matcher = pattern6.matcher("a ab abc abcd abcdf abcdfe");
        System.out.print("\n\nexample 6:  ");
        while(matcher.find()){System.out.print(matcher.group()+" ");}
        System.out.println();

    }
}
