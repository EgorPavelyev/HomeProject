import java.security.MessageDigest;

public class HelloWorld {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.println("b = " + b);
            System.out.printf("%02x", b);
            //new
        }
    }
}