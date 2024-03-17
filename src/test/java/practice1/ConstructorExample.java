package practice1;

public class ConstructorExample {

    public static void main(String[] args) {
        ConstructorExample ex = new ConstructorExample("Ruskin Bond", 55);
    }

    public ConstructorExample() {
        System.out.println("This is a Constructor.");
    }

    public ConstructorExample(String author, int age) {
        System.out.println("This is Parameterized Constructor with: " + author + age);
    }
}


