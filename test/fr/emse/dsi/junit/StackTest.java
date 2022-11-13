package fr.emse.dsi.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	Stack fa0, fa1, fa2, fa3;
	
	@Before
	public void setUp() throws Exception {

		fa0 = new Stack();
		fa0.push("a");
		fa0.push("b");
		fa0.push("c");
		fa0.push("d");
	}

	@Test
	public void testIsEmpty() {
		assertFalse(fa0.isEmpty());
	}

	@Test
	public void testPop() {
		assertEquals(fa0.pop(),"d");
		assertEquals(fa0.pop(),"c");
	}
}
