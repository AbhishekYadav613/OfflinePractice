package practice1;

//trying inheritance
public class Inherit_2 extends Inherit_1{
    public static void main(String[] args) {
        Inherit_2 inh = new Inherit_2();
        inh.add(3,4);
        inh.sub(5,1);
        inh.mul(3,5);

    }

    public void mul(int a, int b)
    {
        int multiple=a*b;
        System.out.println("Multiplication is:" +multiple);
    }
}


