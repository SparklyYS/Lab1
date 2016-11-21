import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test8 {
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
		Poly.simplify("!simplify %=1");
		Poly.combine();
		Poly.show();
		String result = Poly.toString();
		assertEquals("x", result);
	}
}
