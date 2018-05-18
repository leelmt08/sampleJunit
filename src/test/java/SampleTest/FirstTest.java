package SampleTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

	@Test
	public void testFirstMethod() {
		TestFirst t= new TestFirst();
		assertEquals("Sanket", t.testFistMethod());
	}

}
