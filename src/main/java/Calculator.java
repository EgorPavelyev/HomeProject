import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    Calculator() {
        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        setVisible(true);
    }


    public static void main(String[] args) {
        new Calculator();

        JTextArea textArea = new JTextArea();

        JPanel buttonPanel = new JPanel(new GridLayout(3,5));

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");




//        System.out.println("Add two numbers");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        in.close();
//        int sum = a + b;
//        System.out.println("Result a + b = " + sum);
//        System.out.println("End");

    }


}


