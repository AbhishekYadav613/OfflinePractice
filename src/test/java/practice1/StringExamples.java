package practice1;

// checking string methods.
public class StringExamples {
    public static void main(String[] args) {

        String k="retro123%&drop";
        System.out.println("The character at third place is: " +k.charAt(3));
        System.out.println("Whether the string contains 'O'?" +k.contains("t"));
        System.out.println("String in lower case is: " +k.toLowerCase());
        System.out.println("String in Upper Case is: "+k.toUpperCase());
        System.out.println("Comparison result is: "+k.equalsIgnoreCase("rETro123%&dRop"));
        System.out.println("New: "+k.replace("1","3"));

    }
}
