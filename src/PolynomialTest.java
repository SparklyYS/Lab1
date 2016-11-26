import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PolynomialTest {
	Polynomial test = new Polynomial();
	@Before
	public void setUp() throws Exception {
		test.expression("x^2*y");
		test.restore();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDerivative() {
		test.derivative("!d/dx");
		test.combine();
		test.show();
		String result = test.toString();
		assertEquals("2*x*y", result);
	}

}
