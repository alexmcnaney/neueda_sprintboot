
public class Spaceship extends Asteroid {

	private int ammo, lives;

	public Spaceship(double x, double y, int speed, String direction, int ammo, int lives) {
		super(x, y, speed, direction);
		this.ammo = ammo;
		this.lives = lives;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	
	public void shoot() {
		

        if (ammo > 0)
		{
		
			ammo = ammo -20;
		
			System.out.println("Ammo remaining: " + ammo);
			
		}
		
		else if (ammo <= 0) {
			
			System.out.println("You are out of ammo!!");
		}
		
	}
        public void crash() {
        	
        	if (lives > 0)
        	{
     	        	 
     	   lives = lives - 1;
     	  
     	   System.out.println("Lives left: " + lives);
     	   
     	   
        }
        
        else if (lives <= 0) {
        	
        	System.out.println("You are out of lives!!");
        }
     	   
        }
		
      
     
	}
	
	
	
	
	

