
/**
 * Write a description of class StaticFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StaticFish
{
  
  public static int fishCount = 0;
  
  private String color;
  private int x, y, weight;
  
  public StaticFish(String color, int weight, int x, int y) {
    this.color = color;
    this.weight = weight;
    this.x = x;
    this.y = y;
    StaticFish.fishCount++;
  }
  
  /**
   * Moves to a random position
   */
  public void swim() {
    // Note that the fish's position variable is immutable because there aren't
    // any setter functions in the Position class.  We'll get the current position
    // create a new Position object and set the fish's new position
    // We'll compute the new coordinates by generating a random number between
    // -10 and 10 and adding it to the old coordinates. Note that Math.random
    // returns a double, so we have to cast the random number as an integer before
    // assigning it to the new position
    this.x = this.x + (int)(Math.random()*20 - 10);  // The new x position
    this.y = this.y + (int)(Math.random()*20 - 10);  // The new y position
  }
  
  /**
   * Kills the fish... bummer
   */
  public void die() {
    StaticFish.fishCount--;
  }

}
