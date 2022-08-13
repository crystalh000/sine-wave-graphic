import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Scape extends JPanel
{
    private ArrayList<Circle> circles;
    private ArrayList<secondCircle> secondCircles;
    private int timer;
    public Scape()
    {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1400,600));
        this.setBackground(new Color(0,0,0));
        circles = new ArrayList<Circle>();
        secondCircles = new ArrayList<secondCircle>();
        timer = 0;
    }
    
    public void go()
    {
        while(true)
        {
          for(int i = 0; i < circles.size(); i++)
          {
              circles.get(i).move();
              if(circles.get(i).getX() >= 1400)
              {
                 circles.remove(i);  
                 i--;
              }
              
            }
          for(int i = 0; i < secondCircles.size(); i++)
          {
              secondCircles.get(i).move();
              if(secondCircles.get(i).getX() >= 1400)
              {
                 secondCircles.remove(i);  
                 i--;
              }
              
            }  
            
          try
          {
              Thread.sleep(10);
              timer += 10;
              //every 100 miliseconds, create a new circle
              if(timer % 100 == 0)
              {
                  circles.add(new Circle());
                }
              if (timer % 100 == 0)
              {
                  secondCircles.add(new secondCircle());
                  
              }
              
          }
          catch(InterruptedException ex){}
          
          this.repaint();
        }
    }
    
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        for(int i = 0; i < circles.size();i++)
        {
            circles.get(i).draw(page);
            secondCircles.get(i).draw(page);
        }
    }
}