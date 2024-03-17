package random1;

// Sum of array elements.
public class ForEachLoopExample2 {
    public static void main(String[] args) {

        int arr[]= {23,45,89,1002,-5};
        int sum=0;

        for (int var : arr) {
            sum = sum + var;
        }
            System.out.println("Sum of array elements is: " +sum);

    }
}
