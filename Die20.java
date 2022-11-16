
/**
 * Write a description of class Die20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die20
{
    private int value;

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Die20() {
    this.roll();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return value;
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    this.value = (int)(Math.random() * 20) + 1;
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}