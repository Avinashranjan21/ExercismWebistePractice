import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoferTest {

  @Test
  public void noNameGiven() {
    String input = null;
    String expected = "One for you, one for me.";

    assertEquals(expected, Twofer.twofer(input));
  }

  @Test
  public void aNameGiven() {
    String input = "Alice";
    String expected = "One for Alice, one for me.";

    assertEquals(expected, Twofer.twofer(input));
  }

  @Test
  public void anotherNameGiven() {
    String input = "Bob";
    String expected = "One for Bob, one for me.";

    assertEquals(expected, Twofer.twofer(input));
  }
}