import java.awt.event.*;
import javax.swing.*;

public class SeriesFrame {

    public static void main(String[] args) {
        new Series1();
    }
    
}

class Series1{
    
    JFrame f1;
    JLabel l1, l2;
    JButton b1;
    JTextField t1, t2;
    Series1(){
        f1 = new JFrame();
        f1.setSize(600, 400);
        f1.setLayout(null);
        f1.setTitle("Fibonacci Series");
        l1= new JLabel("Enter term for Series");
        l1.setBounds(20, 20, 200, 30);
        f1.add(l1);
        l2= new JLabel(" ");
        l2.setBounds(20, 150,200, 30 );
        f1.add(l2);
         t1 = new JTextField(10);
         t1.setBounds(350, 20, 100, 30);
         f1.add(t1);
         f1.setVisible(true);
         b1 = new JButton("Print Series");
         b1.setBounds(300, 100, 150, 30);
         f1.add(b1);
         b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int n = Integer.parseInt(t1.getText());
                int a = 0, b= 1;
                String result;
                result=a +","+b;
                for (int i= 1; i<=n-2; i++){
                    int c= a+b;
                    result +=", "+c;
                    a= b;
                    b= c;
                }
                l2.setText( "LabelSeries "+ result);


            }
         });
    }
}
