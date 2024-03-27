package recurrent;

// adding numbers given in a string.
public class AddNumInString {
    public static void main(String[] args) {
        AddNumInString amd = new AddNumInString();
        amd.add();

    }

    public void add()
    {
        String k = "eDe34R5T%^ted44";
        char[] ar = k.toCharArray();
        int sum=0;

        for (char abc : ar)
        {
            if (Character.isDigit(abc))
                sum = sum + Character.getNumericValue(abc);
        }
        System.out.println("Sum of the characters in the string is: " +sum);
    }
}
