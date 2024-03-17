package practice1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//different string methods.
public class StringMethods {
    public static void main(String[] args) {

        String k="qwerty@123 ";
System.out.println(k.startsWith("qwe"));
        System.out.println(k.endsWith("321"));
        System.out.println(k.contains("ty@"));
        System.out.println(k.replace("qw", "QW"));
        System.out.println(k.trim());
        String l= k.split("y")[0];
        System.out.println(l);

    }
}
