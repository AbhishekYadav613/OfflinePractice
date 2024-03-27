package recurrent;

// add numbers given in a string.
public class AddStringNum {
    public static void main(String[] args) {
        AddStringNum var = new AddStringNum();
        var.str();

    }

    public void str() {

        String amp = "rt4r5t%^Y67Y5r";
        char[] st = amp.toCharArray();
        int sum = 0;

        for (char ref : st)
            if (Character.isDigit(ref))

                sum = sum + Character.getNumericValue(ref);

        System.out.println("Sum is: " + sum);
    }
}