import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

  @Test
  public void testAnEmptyString() {
    assertEquals("", ReverseString.reverse(""));
  }

  
  @Test
  public void testAWord() {
    assertEquals("tobor", ReverseString.reverse("robot"));
  }

  @Test
  public void testACapitalizedWord() {
    assertEquals("nemaR", ReverseString.reverse("Ramen"));
  }

  @Test
  public void testASentenceWithPunctuation() {
    assertEquals("!yrgnuh m'I", ReverseString.reverse("I'm hungry!"));
  }


  @Test
  public void testAPalindrome() {
    assertEquals("racecar", ReverseString.reverse("racecar"));
  }

}