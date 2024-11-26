import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;
import javax.sound.sampled.spi.*;
class Audio

{
    public static void sjc() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("SJC.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    
   
    public static void pr() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("PR.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void bhs() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("BHS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void dpps() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("DPPS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void ymca() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("YMCA.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    
    public static void tps() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("tps.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void dps() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("DPS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void mls() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("MLS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void ghs() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("GHS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void buzz() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("buzz.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void ems() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("EMS.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    public static void jtgj() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("JTGJ.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
    
    public static void dpsc() 
    {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("DPSC.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) 
        {
            System.out.println("Error with playing sound.");
            System.out.println(ex);
        }
    }
}