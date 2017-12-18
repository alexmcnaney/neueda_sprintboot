import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Asteroid> asteroids = new ArrayList<Asteroid>();
		Asteroid astroid1 = new Asteroid (2.4, 3.5 , 20, "right");
		asteroids.add(astroid1);
	
		
		Asteroid astroid2 = new Asteroid (8.1, 2.3 , 16, "left");
		asteroids.add(astroid2);
		
		Asteroid astroid3 = new Asteroid (5.7, 9.2 , 6, "down");
		asteroids.add(astroid3);
		
		

	

	Spaceship spaceship1 = new Spaceship (2.4, 3.5 , 20, "middle", 100, 3);
	
	
	spaceship1.shoot();
	spaceship1.shoot();
	spaceship1.shoot();
	spaceship1.shoot();
	spaceship1.shoot();
	spaceship1.shoot();
	
	
	
	}

}
