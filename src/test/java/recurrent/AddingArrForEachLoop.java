package recurrent;

// adding elements in an array using for-each loop.
public class AddingArrForEachLoop {
    public static void main(String[] args) {
        AddingArrForEachLoop lp = new AddingArrForEachLoop();
        lp.arr();

    }

    public void arr() {

        int rent[] = {12, 45, 34, 25};

        int sum = 0;

        for (int ref : rent)

            sum = sum + ref;
        System.out.println("Sum of Rent is: " + sum);
    }
}
