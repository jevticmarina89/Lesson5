package exercises;

public class SmurfRunner {

	public static void main(String[] args) {
		
	//	Smurf handySmurf = new Smurf("Handy","");
	//	handySmurf.eat();
	//	System.out.println(handySmurf.getName());
		
		Smurf papa = new Smurf("Papa", "red", "boy");
		System.out.println(papa.getName() + papa.getHatColor() + papa.getIsGirlOrBoy());
		
		Smurf lady = new Smurf("Smurfette", "white", "girl");
		System.out.println(lady.getName() + lady.getHatColor() + lady.getIsGirlOrBoy());
		
		

	}

}
