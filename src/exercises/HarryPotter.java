package exercises;

public class HarryPotter {

	private boolean cloakOn;

	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarioHus things.");
	}

	public static void main(String[] args) {
		
		HarryPotter harryP = new HarryPotter();
		
		harryP.makeInvisible(true);
		harryP.spyOnSnape();
		harryP.makeInvisible(false);
		harryP.castSpell("stupefy");
		
		
		// 1. make harry potter
		// 2. become invisible
		// 3. spy on professor snape
		// 4. become visible again
		// 5. cast a â€œstupefyâ€� spell
	}

}
