import java.util.ArrayList;

/**
 * Write a description of class FishTank here.
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class FishTankArrayList
{
  // instance variables - replace the example below with your own
  private ArrayList<Fish> fish;

  /**
   * Constructor for objects of class FishTank
   */
  public FishTankArrayList()
  {
    this.fish = new ArrayList<>();
  }
  
  /**
   * Let's add a fish to the ArrayList
   * @param Fish Object representing the fish to add
   */
  public void addFishAtIndex(Fish fishToAdd) {
    this.fish.add(fishToAdd);
  }

  /**
   * Move fish at index
   * @param Index of fish to move
   */
  public void swim(int index) {
    fish.get(index).swim();
  }
  
  /**
   * Kill the fish at index
   * @param Index of fish to die
   */
  public void die(int index) {
    fish.get(index).die();
  }
  
}
