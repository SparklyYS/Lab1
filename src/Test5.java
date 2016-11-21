import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test5 {
	Polynomial Poly = new Polynomial();
	@Before
	public void setUp() throws Exception {
		Poly.expression("x");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Poly.restore();
		Poly.simplify("!simplify x=0.5");
		String result = Poly.toString();
		assertEquals("Format error! Please input again!", result);
	}
}
