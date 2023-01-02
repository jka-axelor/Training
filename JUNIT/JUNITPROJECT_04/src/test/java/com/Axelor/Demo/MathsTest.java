package com.Axelor.Demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(OrderAnnotation.class)
@DisplayName("MathsTest")
class MathsTest {

	Maths maths ;
	
	/*For the use in conStructor*/
	MathsTest(TestInfo info) {
		
		assertEquals("MathsTest", info.getDisplayName());
		System.out.println(info.getDisplayName());
	}
	
	
	
	
	
	@BeforeEach
	void getObj()
	{
		maths = new Maths();
	}
	
	@Order(5)
	@DisplayName("1")
	@Test
	void testAdd() {
		
		assertEquals(4, maths.add(2, 2));
	}

	@Order(4)
	@DisplayName("2")
	@Test
	void testSubtract() {
		assertEquals(0, maths.subtract(2, 2));
	}

	@Order(3)
	@DisplayName("3")
	@Test
	void testMltiply() {
		assertEquals(4, maths.mltiply(2, 2));
	}

	@Order(2)
	@DisplayName("4")
	@Test
	void testBy() {
		assertEquals(4, maths.by(16, 4));
	}

	
	@Order(1)
	@DisplayName("5")
	@Test
	void testSqure() {
		
		assertEquals(25, maths.squre(5));
	}

}
