package practice1;

// extract OTP from string.
public class RegExExampleOTP {
    public static void main(String[] args) {
        RegExExampleOTP tr = new RegExExampleOTP();
        tr.otp();
    }


    public void otp() {
        String msg = "Hi. The OTP for tnx:4345xxx345 is 583956";
        //
        //  String rdx = msg.split(" ");
        //

        for (String ref : msg.split(" ")) {
            if (ref.matches("\\d{6}")) {
                System.out.println(ref);
            }
        }
    }
}
