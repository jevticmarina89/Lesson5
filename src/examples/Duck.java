package examples;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Duck {

	private String favoriteFood;
	private int lifeExpectancy;
	private static int numberOfCreations;
	private String color;
	

	public Duck(String favoriteFood, int lifeExpectancy, String color) {
		this.favoriteFood = favoriteFood;
		this.lifeExpectancy = lifeExpectancy;
		this.color = color;
		numberOfCreations++;
	}

	public void waddle() {
		lifeExpectancy++;
		System.out.println("waddle waddle");
	}

	@Override
	public String toString() {
		return "This duck likes to eat " + this.favoriteFood + " and will live to be " + this.lifeExpectancy + ".";
	}
	
	public static int getNumberOfCreations() {
		return numberOfCreations;
	}
	public String getColor() {
		return color;
	}
	
	public static void reset() {
		numberOfCreations = 0;
	}
	
	public void quack() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sounds/quack.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
