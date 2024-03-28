package practice1;

public class ConstructorExample {

    public static void main(String[] args) {

        ConstructorExample ex = new ConstructorExample();
    }

    // If parameters are not passed, then this constructor will be executed.
    public ConstructorExample() {

        System.out.println("This is a Constructor.");
    }
// If parameters are passed, then this constructor will be executed.
    public ConstructorExample(String author, int age) {
        System.out.println("This is Parameterized Constructor with: " + author + age);
    }
}


