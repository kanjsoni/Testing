import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
     new MathCal();   
    }
}

class MathCal{
    JFrame f1;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    MathCal(){
        f1= new JFrame();
        f1.setSize(600,500);
        f1.setTitle("Calculator");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setVisible(true);

        l1= new JLabel("First number ");
        l1.setBounds(20, 20, 100, 30);
        f1.add(l1);

        l2= new JLabel("Second Number");
        l2.setBounds(20, 60, 100, 30);
        f1.add(l2);

        l3 = new JLabel("Result");
        l3.setBounds(20, 160, 100, 30);
        f1.add(l3);

        l4 = new JLabel(" ");
        l4.setBounds(300, 160, 100, 30);
        f1.add(l4);

        t1= new JTextField(10);
        t1.setBounds(300, 20, 100, 30);
        f1.add(t1);

        t2= new JTextField(10);
        t2.setBounds(300, 60, 100, 30);
        f1.add(t2);

        t3= new JTextField(10);
        t3.setBounds(300, 20, 100, 30);
        f1.add(t3);

        b1= new JButton("Add");
        b1.setBounds(120,100, 100, 30);
        
        b1.addActionListener( new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = a+b;
                l4.setText( String.valueOf(result));
            }
        });
        f1.add(b1);

        b2= new JButton("Sub");
        b2.setBounds(220,100, 100, 30);
        
        b2.addActionListener( new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = a-b;
                l4.setText( String.valueOf(result));
            }
        });
        f1.add(b2);

        b3 = new JButton("Mul");
        b3.setBounds(320,100, 100, 30);
        
        b3.addActionListener( new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = a*b;
                l4.setText( String.valueOf(result));
            }
        });
        f1.add(b3);

        b4= new JButton("Div");
        b4.setBounds(420,100, 100, 30);
        
        b4.addActionListener( new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int result = a/b;
                l4.setText( String.valueOf(result));
            }
        });
        f1.add(b4);

    }
}
