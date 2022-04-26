import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingRect;
    Bouncer movingCir;
    StraightMover straightMoverRect;
    StraightMover straightMoverCir;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
    	
    	ArrayList<Mover> movers = new ArrayList<Mover>();
    	
    	Rectangle rect = new Rectangle(15, 20, Color.RED);
    	Circle circle = new Circle(80, 50, Color.DARK_GRAY);
    	
    	// Initialize Bouncer and StraightMover for rect object
    	movingRect = new Bouncer(100, 170, rect);
        movingRect.setMovementVector(3, 1);
        straightMoverRect = new StraightMover(5, 40, rect);
        straightMoverRect.setMovementVector(5, 2);
        
        // Initialize Bouncer and StraightMover for circle object
    	movingCir = new Bouncer(500, 270, circle);
        movingCir.setMovementVector(5, -1);
        straightMoverCir = new StraightMover(3, 4, circle);
        straightMoverCir.setMovementVector(1, 2);
        
        
        movers.add(movingRect);
        movers.add(straightMoverRect);
        movers.add(movingCir);
        movers.add(straightMoverCir);
    	
    	
    	/* Before implementing Mover interface: separate ArrayList for Bouncer and StraightMover
    	// Bouncer
    	ArrayList<Bouncer> bouncers = new ArrayList<Bouncer>();
    	
        Rectangle box = new Rectangle(15, 20, Color.RED);
        movingRect = new Bouncer(100, 170, box);
        movingRect.setMovementVector(3, 1);
        
        Circle circle = new Circle(80, 50, Color.DARK_GRAY);
        movingCir = new Bouncer(500, 270, circle);
        movingCir.setMovementVector(5, -1);
        
        bouncers.add(movingRect);
        bouncers.add(movingCir);
        
        // StraightMover
        ArrayList<StraightMover> straightMovers = new ArrayList<StraightMover>();
        
        Rectangle rect = new Rectangle(15, 20, Color.ORANGE);
        straightMoverRect = new StraightMover(5, 40, rect);
        straightMoverRect.setMovementVector(5, 2);

        Circle cir = new Circle(6, 10, Color.ORANGE);
        straightMoverCir = new StraightMover(3, 4, cir);
        straightMoverCir.setMovementVector(1, 2);
        
        straightMovers.add(straightMoverRect);
        straightMovers.add(straightMoverCir);
        */
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
    	movingRect.draw(surface);
    	movingCir.draw(surface);
    	straightMoverRect.draw(surface);
    	straightMoverCir.draw(surface);
    }
}
