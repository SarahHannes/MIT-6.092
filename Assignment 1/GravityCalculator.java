
public class GravityCalculator {
	public static void main(String [] arguments) {
		double gravity = -9.81; // Earth's gravity in m/s^2
		double initialVelocity = 0.0;
		double failingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.5 * (gravity *(failingTime * failingTime)) + (initialVelocity * failingTime) + initialPosition;
		System.out.println("The object's position after " + failingTime + " second is " + finalPosition + " m." );
		
	}
}

// The output of the unmodified program is:
// "The object's position after 10.0 second is 0.0 m."

// The output of the modified program is:
// "The object's position after 10.0 second is -490.5 m."