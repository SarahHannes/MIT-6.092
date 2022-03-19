import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox rectangle;
    BouncingBox b1, b2, b3;
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(1,0);
        
        rectangle = new BouncingBox(100, 500, Color.DARK_GRAY);
        rectangle.setMovementVector(0, -2);
        
        // initialize ArrayList of BouncingBoxes
        b1 = new BouncingBox(100, 500, Color.orange);
        b1.setMovementVector(1, 3);
        b2 = new BouncingBox(400, 800, Color.PINK);
        b2.setMovementVector(2, -5);
        b3 = new BouncingBox(300, 100, Color.CYAN);
        b3.setMovementVector(10, -10);
        boxes = new ArrayList<BouncingBox>();
        boxes.add(b1);
        boxes.add(b2);
        boxes.add(b3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        box.draw(surface);
        rectangle.draw(surface);
        
        // Drawing BouncingBoxes
        for(BouncingBox b : boxes) {
        	b.draw(surface);
        }
        
        // Adding 3 different shapes
        surface.drawArc(0, 50, 62, 50, 50, 360);
        surface.fillOval(120, 0, 30, 100);
        surface.fill3DRect(100, 200, 90, 80, false);
    }
} 