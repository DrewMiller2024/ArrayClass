
/**
 * Write a description of class StaticFish here.
 * 
 * @author Mr. Jaffe
 * @version 2017-07-14
 */
public class Fish
{
  
  private String color;
  private int x, y, weight;
  private boolean isAlive;
  
  public Fish(String color, int weight, int x, int y) {
    this.color = color;
    this.weight = weight;
    this.x = x;
    this.y = y;
    this.isAlive = true;
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
   * Is the fish still alive? (T/F)
   * @return Alive status (T/F)
   */
  public boolean isAlive() {
    return this.isAlive;
  }
  
  /**
   * Kill the fish
   */
  public void die() {
    this.isAlive = false;
  }
  
}
