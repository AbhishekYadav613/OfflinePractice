package practice1;

//using for loop and method, print multiples of 3 between 1 to 15.
public class ForLoopExample {
    public static void main(String[] args) {
        ForLoopExample sc= new ForLoopExample();
        sc.mul();

    }

    public void mul()
    {
        for (int i=1; i <=15; i++)

            if (i%3==0)
                System.out.println("Multiples of 3: " +i);

    }
}
