
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice {
  /**
   * Contains the current value of the die
   */
  private Die6 die1;
  private Die6 die2;

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Dice() {
    die1 = new Die6();
    die2 = new Die6();
  }

  /**
   * Getter for value
   * @return Die value
   */
  public int getValue() {
    return this.die1.getValue() + this.die2.getValue();
  }

  public int getValue(int dieNumber) {
      if (dieNumber == 1) {
          return this.die1.getValue();
      } else {
          if (dieNumber == 2) {
              return this.die2.getValue();
          } else {
              return 0;
          }
      }
  }
  
  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    this.die1.roll();
    this.die2.roll();
  }

  /**
   * Roll the die and return the new value
   * @return Die value
   */
  public int rollAndGetValue() {
    this.roll();
    return this.getValue();
  }
}
