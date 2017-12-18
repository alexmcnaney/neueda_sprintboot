
public class Asteroid {

	private double x, y;
	private int speed;
	private String direction;
	
	public Asteroid() {
		super();
	}

	public Asteroid (double x, double y, int speed, String direction) {
		
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.direction = direction;
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
