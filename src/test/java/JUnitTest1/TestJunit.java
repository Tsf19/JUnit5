/**
 * 
 */
package JUnitTest1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Tousif
 *
 */

public class TestJunit {

	@Test
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}
}