import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
	Polynomial Poly = new Polynomial();
	@Before
	public void setUp() throws Exception {
		Poly.expression("x+y");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Poly.restore();
		Poly.simplify("!simplify x=2 y=-1");
		Poly.combine();
		Poly.show();
		String result = Poly.toString();
		assertEquals("1", result);
	}
}
