package fr.emse.dsi.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue<String> fa0, fa1, fa2, fa3;

	@Before
	public void setUp() throws Exception {
		fa0 = new Queue<String>();
		
		fa1 = new Queue<String>();
		fa1.push("plop");

		fa2 = new Queue<String>();
		fa2.push("a");
		fa2.push("b");
		
		fa3 = new Queue<String>();
		fa3.push("a");
		fa3.push("b");
		fa3.push("c");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(fa0.isEmpty());
		assertFalse(fa1.isEmpty());
	}

	@Test
	public void testPush() {
		assertTrue(fa0.isEmpty());
		fa0.push("toto");
		assertFalse(fa0.isEmpty());
	}

	@Test
	public void testPop() {
		//exception 
		try{
			fa0.pop();
			fail();
		}catch(Exception e){
			//OK
		}
		assertEquals(fa1.pop(),"plop");
		assertTrue(fa1.isEmpty());
		assertEquals(fa2.pop(), "a");
		assertEquals(fa2.pop(),"b");
		assertTrue(fa2.isEmpty());
	}
	
	@Test
	public void testGetSize( ) {
		assertEquals(fa3.getSize(), 3);
	}
	
	@Test
	public void testGetFront( ) {
		assertEquals(fa3.getFront(), "a");
	}

}
