package reverseInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testZero() {
		assertEquals(0, reverseInteger.reverse(0));
	}
	
	@Test
	public void testNegative(){
		assertEquals(-1, reverseInteger.reverse(-1));
	}
	
	@Test
	public void testNegatives(){
		assertEquals(-21, reverseInteger.reverse(-12));
	}
	
	@Test
	public void testPositive(){
		assertEquals(1, reverseInteger.reverse(1));
	}
	
	@Test
	public void testPositives(){
		assertEquals(21, reverseInteger.reverse(12));
	}
}
