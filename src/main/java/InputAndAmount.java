import java.util.Scanner;

public class InputAndAmount {
    public static void main(String[] args) {

        System.out.println("Add two numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int sum = a + b;
        System.out.println("Result a + b = " + sum);
        System.out.println("End");
    }



}


