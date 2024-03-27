package recurrent;

// basic string methods.
public class StringBasics {
    public static void main(String[] args) {
        StringBasics bs = new StringBasics();
        bs.bsm();

    }

    public void bsm()
    {
        String k = "qwerty";
        String l = "QWERTY";
        String m = "Party@12345";
        String s1 = m.split("@")[0];
        String s2 = m.split("@")[1];

        System.out.println("Given string contains 'y'? T/F." +k.contains("y"));
        System.out.println("The given string is: " +l + " " + "and in lower case it is: " +l.toLowerCase());
        System.out.println("Third string is: " +m+ " "+"and its length is: " +m.length());
        System.out.println("Splitting the string "+m+ " " +"into"+ " "+s1+ " "+"and"+" "+s2+".");
        System.out.println("The string "+l+ " "+"end with 'e'? T/F?:"+l.endsWith("e"));
        System.out.println("After replacing '@' in the string with 'A', the string"+" "+m+ " "+"becomes: "+m.replace('@', 'A'));
        System.out.println("Is string"+" "+l+ " "+"equals:"+l.equalsIgnoreCase("QwERty"));





    }


}
