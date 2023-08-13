package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        
        setBounds(100,150,700,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
       Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(50,100, 300,250);
       add(image);
       
       JLabel heading = new JLabel("Thank you "+name +" for playing Simple minds");
       heading.setBounds(45,30,700,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        
        JLabel lblscore = new JLabel("your score is "+score);
       lblscore.setBounds(400,200,300,30);
       lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
       submit.setBounds(420,270,120,30);
       submit.setFont(new Font("Tahoma",Font.PLAIN,18));
       submit.setBackground(new Color(30,144,255));
       submit.setForeground(Color.WHITE);
       submit.addActionListener (this); 
       add(submit);
        
        setVisible(true);
  }
   public void actionPerformed(ActionEvent ae){
      setVisible(false);
      new Login() {} ;
  }
   public static void main(String args[]){
        new Score("user",0);
    }

}
