import org.junit.*; //the main JUnit library that tells Java how to run all of the testing procedures.
import static org.junit.Assert.*; //JUnit's assertion library. Assertions are the primary means of testing

public class LeapYearTest {


  @Test 
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
   }
}
