package exercises;

import examples.Duck;
import junit.framework.TestCase;

public class StaticDucks extends TestCase {

	public void testWeCanCountTheNumberOfDucksCreated() throws Exception {
		assertEquals(0, Duck.getNumberOfCreations());
		Duck duck1 = new Duck("worm", 50, "black");
		Duck duck2 = new Duck("apples", 70, "white");
		Duck duck3 = new Duck("bugs", 30, "black");
		assertEquals(3, Duck.getNumberOfCreations());
		Duck duck4 = new Duck("bread", 20, "white");
		assertEquals(4, Duck.getNumberOfCreations());
		duck1.reset();
	}
	

	public void testEverySecondDuckIsBlack() throws Exception {
		Duck duck1 = new Duck("worm", 50, "black");
		Duck duck2 = new Duck("apple", 70, "white");
		Duck duck3 = new Duck("bug", 30, "black");
		assertEquals("black", duck1.getColor());
		assertEquals("white", duck2.getColor());
		assertEquals("black", duck3.getColor());
		duck1.reset();
	}
//
//	public void testEveryFourJellyfishArePoisonous() throws Exception {
//	}
}
