package practice1;

//adding numbers using method calling.
public class ParameterMethodAddition {
    public static void main(String[] args) {

        ParameterMethodAddition dc = new ParameterMethodAddition();
        dc.add(4, 6);

    }

    public void add(int x, int y)
    {
        int sum= x+y;
        System.out.println("Sum is: " +sum);
    }

}
