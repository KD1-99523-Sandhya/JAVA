
class InvalidDiameterException extends Exception {

	public InvalidDiameterException(String message) {
		super(message);
	}
}


class Circle {

	private double myX;
	private double myY;
	private double myDiameter;

	
	public Circle() {
		myX = 0;
		myY = 0;
		myDiameter = 100;
	}

	
	public Circle(double myX, double myY, double myDiameter)
			throws InvalidDiameterException {

		this.myX = myX;
		this.myY = myY;

		if (myDiameter < 0) {
			throw new InvalidDiameterException(
					"Diameter cannot be negative");
		}

		this.myDiameter = myDiameter;
	}

	
	public double getMyX() {
		return myX;
	}

	
	public double getMyY() {
		return myY;
	}

	
	public double getMyDiameter() {
		return myDiameter;
	}

	public void setMyX(double myX) {
		this.myX = myX;
	}

	
	public void setMyY(double myY) {
		this.myY = myY;
	}

	
	public void setMyDiameter(double myDiameter)
			throws InvalidDiameterException {

		if (myDiameter < 0) {
			throw new InvalidDiameterException(
					"Diameter cannot be negative");
		}

		this.myDiameter = myDiameter;
	}
}


public class program2 {

	public static void main(String[] args) {

		try {

			
			Circle c1 = new Circle();

			System.out.println("Circle 1");
			System.out.println("X : " + c1.getMyX());
			System.out.println("Y : " + c1.getMyY());
			System.out.println("Diameter : " + c1.getMyDiameter());

			System.out.println();

			
			Circle c2 = new Circle(10, 20, 50);

			System.out.println("Circle 2");
			System.out.println("X : " + c2.getMyX());
			System.out.println("Y : " + c2.getMyY());
			System.out.println("Diameter : " + c2.getMyDiameter());

			System.out.println();

			
			c2.setMyDiameter(75);

			System.out.println("After changing diameter:");
			System.out.println("Diameter : " + c2.getMyDiameter());

			System.out.println();

			
			c2.setMyDiameter(-20);

		} catch (InvalidDiameterException e) {

			System.out.println("Exception : " + e.getMessage());
		}
	}
}