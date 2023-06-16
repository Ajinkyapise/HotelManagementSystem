
package hotelmanagementsystem;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ajink
 */
public class Login extends JFrame {
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel user =new JLabel("Username");
        user.setBounds(40,20,100,25);
        add(user);
        
        JTextField user1 =new JTextField();
        user1.setBounds(150,20,150,25);
        add(user1);
        
        JLabel pass =new JLabel("Password");
        pass.setBounds(40,70,100,25);
        add(pass);
        
        JTextField pass1 =new JTextField();
        pass1.setBounds(150,70,150,25);
        add(pass1);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(40 ,150,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        
        JButton cancel = new JButton("CANCEL");
        cancel.setBounds(180 ,150,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        
        Image i2 = i1.getImage().getScaledInstance(200 , 200, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,200,200);
        add(image);

        
        setBounds(500,200,600,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        
        new Login();
        
        
    }
}
