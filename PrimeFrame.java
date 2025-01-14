import java.awt.event.*;
import javax.swing.*;

public class PrimeFrame{
    public static void main(String[] args) {
        new login();
    }
}

class PrimeFrame1 {
    JFrame f;
    JTextField t1;
    JLabel l1,l2;
    JButton b1, b2;

    PrimeFrame1(){
        f= new JFrame();
        f.setSize(600,500);
        f.setLayout(null);
        f.setTitle("Check Number");
        f.setVisible(true);

        l1= new JLabel("Enter no: ");
        l1.setBounds(20, 20, 100, 30);
        f.add(l1);

        l2= new JLabel(" ");
        l2.setBounds(100, 200,100, 30);
        f.add(l2);

        t1= new JTextField(10);
        t1.setBounds(150,20, 100, 30);
        f.add(t1);

        b1= new JButton("Prime");
        b1.setBounds(100, 100, 100, 30);
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String input= t1.getText();
                int num= Integer.parseInt(input);
                boolean flag = true;
                for( int i= 2; i< num/2; i++){
                    if(num% i== 0){
                        flag = false;
                        break;

                    }
                }
                if (flag)
                l2.setText(num + "is Prime");
                else
                l2.setText(num + "is not Prime ");
            }
        });
         b2= new JButton("Exit");
         b2.setBounds(300, 100, 100, 30);
         b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
         });
         f.add(b2);
    }
    
}
class login{
    JFrame f1;
    JTextField t1,t2;
    JLabel l1, l2, l3;
    JButton b1;

    login(){
        f1= new JFrame();
        f1.setSize(600, 500);
        f1.setLayout(null);
        f1.setTitle("Login");
        f1.setVisible(true);

        l1= new JLabel(" ");
        l1.setBounds(50, 20, 200, 30);
        f1.add(l1);

        l2= new JLabel("UserName: ");
        l2.setBounds(20, 100, 100, 30);
        f1.add(l2);

        t1 = new JTextField(10);
        t1.setBounds(150,100, 100, 30);
        f1.add(t1);

        l3= new JLabel("PASSWORD : ");
        l3.setBounds(20, 150, 100, 30);
        f1.add(l3);

        t2= new JTextField(10);
        t2.setBounds(150, 150, 100, 30);
        f1.add(t2);

        b1= new JButton("Submit");
        b1.setBounds(100, 200, 100, 30);
        f1.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String user = t1.getText();
                String pass = t2.getText();
                if(user.equals("admin")&& pass.equals("12345")){
                    l1.setText("Login SuccessFull");
                    f1.dispose();
                    new PrimeFrame1();

                }
                else
                l1.setText("Invalid Credientials");
            }
        });

    }
}


