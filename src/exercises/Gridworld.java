package exercises;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/* 
 * Use the Gridworld Reference document in the "doc" directory to complete the following tasks;
 * 
 * 1. Figure out how to get the World to show.
 * 2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)
 * 3. Add another bug at a random location in the world.
 * 4. Change the color of that bug to blue.
 * 5. Make the bug face to the right.
 * 6. Add flowers to the left and right of the bug.
 * 7. Fill the whole world with flowers!
*/


public class Gridworld {
	public static void main(String[] args) {
		
	
	World <Actor> world  = new World <Actor>();
	world.show();
	
	Bug bug1 = new Bug();
	Location l1 = new Location(1,1);
	
	world.add(l1, bug1);
	
	Bug bug2 = new Bug();
	bug2.setColor(new Color(0,0,255));
	
	Random r = new Random();
	int r2 = r.nextInt(8)+1;
	int c2 = r.nextInt(8)+1;
	
	Location l2 = new Location(r2, c2);
	world.add(l2, bug2);
	bug2.turn();
	bug2.turn();
	
	Flower f1 = new Flower();
	Flower f2 = new Flower();
	Location l3 = new Location(r2, c2-1);
	Location l4 = new Location(r2, c2+1);
	world.add(l3, f1);
	world.add(l4, f2);
	
	/*for(int n=0; n<=9; n++) {
		for(int m=0; m<=9; m++) {
			Location l = new Location(n, m);
			Flower f = new Flower();
			world.add(l, f);
		}
	}*/
	
	
	}
}
