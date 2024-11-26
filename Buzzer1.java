import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Buzzer1 extends JFrame implements KeyListener 
{
    JLabel label;

    boolean canPress;
    public Buzzer1()
    {
        setVisible(true);
        //frame.setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        Font f=new Font("ARIEL",Font.BOLD,125);
        
        label=new JLabel("..........");
        label.setBounds(100,100,1200,500);
        label.setFont(f);
        canPress=true;
        add(label);
        addKeyListener(this);
        //frame.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {

        char c=e.getKeyChar();
        if((c>='1' && c<='3') || c=='o')
        {
            if(canPress)
            {
                if(c=='o')
                {
                    Audio.buzz();
                    try
                    {
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                    label.setText("St. George's House");
                    label.setForeground(Color.red);
                    Audio.red();
                }
                else if(c=='1')
                {
                    Audio.buzz();
                    try
                    {
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                    label.setText("St. Andrew's House");
                    label.setForeground(Color.blue);
                    Audio.blue();
                }
                else if(c=='2')
                {
                    Audio.buzz();
                    try
                    {
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                    label.setText("St. Patrick's House");
                    label.setForeground(Color.green);
                    Audio.green();
                }
                else if(c=='3')
                {
                    Audio.buzz();
                    try
                    {
                        Thread.sleep(1500);
                    }
                    catch (InterruptedException ie)
                    {
                        ie.printStackTrace();
                    }
                    label.setText("St. Peter's House");
                    label.setForeground(Color.yellow);
                    Audio.yellow();
                }
                canPress=false;
            }
        }
        else
        {
            label.setText("..........");
            label.setForeground(Color.black);
            canPress=true;
        }
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyReleased(KeyEvent e)
    {
    }

    public static void main(String args[])throws Exception
    {
        Buzzer1 ob=new Buzzer1();
    }
}