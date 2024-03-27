package recurrent;

//checking access modifiers .
public class AccessModifiers1 {
    public static void main(String[] args) {
        AccessModifiers1 sd = new AccessModifiers1();
        sd.pub();
        sd.pro();
        sd.def();
        sd.pri();

    }

    public void pub()
    {
        System.out.println("Public.");
    }

    private void pri()
    {
        System.out.println("Private.");
    }

    void def()
    {
        System.out.println("Default.");
    }

    protected void pro()
    {
        System.out.println("Protected.");
    }
}
