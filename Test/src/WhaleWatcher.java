import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {

		ArrayList<Whale> whales = new ArrayList<Whale>();

		Whale Right = new Whale("Right", "Atlantic", 2001, 21, 16);
		whales.add(Right);

		Whale Blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		whales.add(Blue);

		Whale Sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		whales.add(Sperm);

		Whale Humpback = new Whale("Humpback", "Antartic", 919, 13, 13);
		whales.add(Humpback);

		// Output all whales
		System.out.println("All whales: ");
		System.out.println(whales);

		// Output fastest whale

		System.out.println("The fastest whale is the " + getFastestWhale(whales) + " whale");

		// Output heaviest whale

		System.out.println("The heaviest whale is the " + getHeaviestWhale(whales) + " whale");

		// Output for average lengths of whales (hardcoded)
		System.out.println("Average length of the whales in meters are: " + (16 + 16 + 40 + 13) / 4);

		// Output for displaying names of whales swimming in Atlantic
		System.out.println("Whales in the Atlantic");
		for (Whale whale : whales) {
			if (whale.getMainOcean().equals("Atlantic")) {
				System.out.println("Name: " + whale.getName());

			}
		}
	}

	public static String getFastestWhale(ArrayList<Whale> whales) {
		int maxSpeed = 0;
		String fastestWhale = "";

		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			if (currentWhale.getMaxSpeed() > maxSpeed) {
				maxSpeed = currentWhale.getMaxSpeed();
				fastestWhale = currentWhale.getName();
			}

		}

		return fastestWhale;

	}

	public static String getHeaviestWhale(ArrayList<Whale> whales) {
		int maxWeight = 0;
		String heaviestWhale = "";

		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			if (currentWhale.getMaxSpeed() > maxWeight) {
				maxWeight = currentWhale.getWeight();
				heaviestWhale = currentWhale.getName();
			}

		}

		return heaviestWhale;
	}

}
