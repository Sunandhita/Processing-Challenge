package processing;

import processing.core.PApplet;

public class Circle extends PApplet
{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    public static final int DIAMETER = 20;
    public static final int FRAME_RATE = 140;
    
    float x1 = 0, x2 = 0, x3 = 0, x4 = 0;   

    public void settings() //Method called once by processing
    {
    	super.settings();
    	size(WIDTH, HEIGHT); 
    }

    public void setup() //Method called once by processing
    {
    	frameRate(FRAME_RATE);
    }

    public void draw() //This method is called infinitely on a loop, by processing
    {
    	circle1();
    	circle2();
    	circle3();
    	circle4();
    }

    public void circle1()
    {
    	ellipse(x1,HEIGHT/5,DIAMETER,DIAMETER);
    	x1++;
    }

    public void circle2()
    {
    	ellipse(x2,HEIGHT*2/5,DIAMETER,DIAMETER);
    	x2+=2;
    }

    public void circle3()
    {
    	ellipse(x3,HEIGHT*3/5,DIAMETER,DIAMETER);
    	x3+=3;
    }

    public void circle4()
    {
    	ellipse(x4,HEIGHT*4/5,DIAMETER,DIAMETER);
    	x4+=4;
    }
    
    public static void main(String args[]) //called by java
    {
    	PApplet.main("Circle",args);
    }
}
