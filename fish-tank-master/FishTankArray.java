
/**
 * Write a description of class FishTank here.
 * 
 * @author Mr. Jaffe 
 * @version 2017-07-14
 */
public class FishTankArray
{
  // instance variables - replace the example below with your own
  private Fish fish[];

  /**
   * Constructor for objects of class FishTank
   */
  public FishTankArray(int fishCount)
  {
    this.fish = new Fish[fishCount];
    for (int i=0; i<fishCount; i++) {
      this.fish[i] = new Fish("ORANGE", 10, 0, 0);
    }
  }

  /**
   * Move fish at index
   * @param Index of fish to move
   */
  public void swim(int index) {
    fish[index].swim();
  }
  
  /**
   * Kill the fish at index
   * @param Index of fish to die
   */
  public void die(int index) {
    fish[index].die();
  }
  
}
