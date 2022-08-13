import javax.swing.*;



public class Driver
{
    public static void main()
    {
        JFrame frame = new JFrame("DreamScape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,100);
        
        Scape s = new Scape();
        frame.getContentPane().add(s);
        frame.pack();
        frame.setVisible(true);
        s.go();
    }
}