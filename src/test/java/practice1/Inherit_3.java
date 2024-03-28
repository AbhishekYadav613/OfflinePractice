package practice1;

// checking inheritance.
public class Inherit_3 extends Inherit_2{
    public static void main(String[] args) {
        Inherit_3 in = new Inherit_3();
        in.mul(2,3);
        in.add(3,4);
        in.sub(65,90);
        in.rail();

    }

    public void rail()
    {
        System.out.println("RAIL.");
    }
}
