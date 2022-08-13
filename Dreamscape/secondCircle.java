import java.awt.*;

public class secondCircle
{
    private double x,y,size;
    private Color color;
    
    
    
    public secondCircle()
    {
        
        y = 100 * Math.sin(x/20);//wave of peaks of -100 and 100
        size = 10;
        color = new Color(255,0,0);
        
       
        
        
        
    }
    
    public double getX()
    {
        return x;
    }
    
    public void move()
    {
        x++; //left to right movement
        y = -100 * Math.sin(x/30);//wave of peaks of -100 and 100
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("size: " + size);
        
    }
    
    public void draw(Graphics page)
    {
        page.setColor(color);
        
        page.fillOval((int)x,(int)y + 250,(int)size,(int)size);
    }
    
}
