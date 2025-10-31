package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private MyRectangle pillar;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {

        wall = new Square();
        wall.changeColor("green");
        wall.moveHorizontal(-140);
        wall.moveVertical(280);
        wall.changeSize(300);
        wall.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(60);
        window.moveVertical(280);
        window.changeSize(300);
        window.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(60);
        window.moveVertical(500);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(60);
        window.moveVertical(540);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(-100);
        window.moveVertical(300);
        window.changeSize(70);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(-100);
        window.moveVertical(500);
        window.changeSize(70);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(200);
        window.moveVertical(300);
        window.changeSize(70);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(200);
        window.moveVertical(500);
        window.changeSize(70);
        window.makeVisible();
        

        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal( 315);
        sun.moveVertical(575);
        sun.changeSize(10);
        sun.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(225);
        window.moveVertical(225);
        window.changeSize(40);
        window.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(225);
        window.moveVertical(130);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(270, 550);
        roof.moveHorizontal(308);
        roof.moveVertical(100);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(150);
        sun.moveVertical(400);
        sun.changeSize(10);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(625);
        sun.moveVertical(10);
        sun.changeSize(30);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(575);
        sun.moveVertical(30);
        sun.changeSize(30);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(525);
        sun.moveVertical(50);
        sun.changeSize(30);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(475);
        sun.moveVertical(70);
        sun.changeSize(30);
        sun.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("blue");
        pillar.moveHorizontal(200);
        pillar.moveVertical(300);
        pillar.changeSize(70, 40);
        pillar.makeVisible();

         pillar = new MyRectangle();
        pillar.changeColor("black");
        pillar.moveHorizontal(232);
        pillar.moveVertical(300);
        pillar.changeSize(3, 50);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("magenta");
        pillar.moveHorizontal(200);
        pillar.moveVertical(500);
        pillar.changeSize(70, 40);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("black");
        pillar.moveHorizontal(232);
        pillar.moveVertical(500);
        pillar.changeSize(3, 50);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("red");
        pillar.moveHorizontal(-100);
        pillar.moveVertical(500);
        pillar.changeSize(70, 40);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("red");
        pillar.moveHorizontal(-70);
        pillar.moveVertical(500);
        pillar.changeSize(3, 50);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("cyan");
        pillar.moveHorizontal(-70);
        pillar.moveVertical(300);
        pillar.changeSize(3, 50);
        pillar.makeVisible();

        pillar = new MyRectangle();
        pillar.changeColor("cyan");
        pillar.moveHorizontal(-100);
        pillar.moveVertical(300);
        pillar.changeSize(70, 40);
        pillar.makeVisible();


        

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
