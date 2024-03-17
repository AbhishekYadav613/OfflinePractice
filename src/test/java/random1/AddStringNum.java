package random1;

//print the sum of numbers in "RU48S326SIA2".
public class AddStringNum {
    public static void main(String[] args) {
        AddStringNum bh = new AddStringNum();
        bh.err();
    }

    public void err() {
        String k = "RU48S326SIA2";
        int sum = 0;

        char[] ar = k.toCharArray();

        for (char ref : ar) {
            if (Character.isDigit(ref))
                sum = sum + Character.getNumericValue(ref);
        }

        System.out.println("The required Sum is: " + sum);
    }
}
