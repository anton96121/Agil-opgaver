package Homeworks;

import java.util.Random;


class Car {
	public int lives;
	void setLives(int no) {
		this.lives = no;
	}
	boolean hasLives() {
		return (lives>0);
	}
	void hit(Obstacle a) {
		if (a.life()>0) {
		this.lives = this.lives+a.life();}
		if (Math.abs(a.life())>lives) {
			this.lives = 0;}
		if (Math.abs(a.life())<=lives){
			this.lives = this.lives+a.life();}
	}
	int getLives() {
		return lives;
	}	
}

class Score {
	public int score = 0;
	void increment() {
		this.score +=1;
	}
	public String toString() {
		return String.valueOf(score);
	}
	
	
	
}

class Obstacle {
 public int intensity;
 void setIntensity(int intens) {
	 this.intensity = intens;
 }
 
 public int life() {
	 return 0;
 }
}
class Truck extends Obstacle{
	 public int life() {
		 return ((-1) * intensity);
	 }
}
class Pillar extends Obstacle{
	 public int life() {
		 return ((-1) * intensity);
	 }
}
class Life extends Obstacle{
	 public int life() {
		 return intensity;
	 }
}

public class CarCollisionGame {
	public static void main(String[] args) {
		
		Random random = new Random();
		Car c = new Car();
		c.setLives(1000000);
		
		Score s = new Score();
		while(c.hasLives()) {
			if (random.nextDouble() < .75) {
				System.out.println("Ouch! Obstacle hit!");
				Obstacle o = null;
				double r = random.nextDouble();
				if (r < 0.4) {
					o = new Truck(); // this should decrease the number of lives
					System.out.println("  That was a truck!");
				} else if ( r > 0.6) {
					o = new Pillar(); // this should decrease the number of lives
					System.out.println("  That was a pillar!");
				} else {
					o = new Life(); // this should increase the number of lives
					System.out.println("  That was a new life! Hurray :)");
				}
				o.setIntensity(1 + random.nextInt(3));
				c.hit(o);
				System.out.println("  Car has now " + c.getLives() + " lives");
			} else {
				System.out.println("No obstacles hit");
			}
			s.increment();
		}
		
		System.out.println("Game over");
		System.out.println("Final score is " + s);
	}
}