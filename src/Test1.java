import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	Polynomial Poly = new Polynomial();
	@Before
	public void setUp() throws Exception {
		Poly.expression("x*2");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Poly.restore();
		Poly.simplify("!simplify x=2");
		Poly.combine();
		Poly.show();
		String result = Poly.toString();
		assertEquals("4", result);
	}
}
