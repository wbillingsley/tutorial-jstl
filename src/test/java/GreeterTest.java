import jspproj.Greeter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {

  @Test
  public void testGreeeting() {
    assertEquals("Hello world", Greeter.greeting("world"));
  }

}
