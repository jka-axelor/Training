package com.Axelor.Demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class MathsTest {

	TestInfo info ;
	 TestReporter reporter;
	
	private	 Maths maths;
	
	@AfterAll
   void afterAll()   /*or by Static void methord name*/
	{
		System.out.println("its after all ");
	}
	
	@BeforeAll    /*or by Static void methord name*/
	void beforall()
	{
		System.out.println("its befor all");
	}
	
	
	@BeforeEach
	void init(TestReporter reporter , TestInfo info)
	{
		this.info=info;
		this.reporter = reporter;
		maths= new Maths();
		System.out.println("befor each is exequting");
	}
	
	
	@EnabledOnOs(value = OS.WINDOWS)
	@AfterEach
	void eachEand ()
	{
		System.out.println("after each is running");
	}
	
	
    // T 1	
	@Test
	@Tag("math")
	void testAdd() {
		assertEquals(2,maths.add(1, 1),"its runninng add test");
	}
	// T 2	
	@Test
	@Tag("math")
	void testSubtract() {
		assertEquals(2,maths.subtract(4, 2));	
		}
	// T 3	
	@Test
	@Tag("math")
	void testMltiply() {
		assertEquals(4,maths.mltiply(2, 2));
	}
	// T 4	
	@Test
	void testBy() {
		assertEquals(2,maths.by(4, 2));
	}
	// T 5	
	@Test
	void testSqure() {
		assertEquals(4,maths.squre( 2));
	}

    // T 6
	@Test
	void exception ()
	{
		assumeTrue(true);
		assertThrows(ArithmeticException.class, () -> maths.by(1,0));
	}
	
	// T 7	
	@Test
	void testCircle()
	{
		assertEquals(314.1592653589793, maths.circle(10), "its shows area");
	}
	
	 /*Test multiple  Assert all condition*/ 
	@Test
	@DisplayName("multiple products")
	void multiplyAll()
	{
		assertAll(
				
		() ->		assertEquals(2,maths.mltiply(1, 2)),
		() ->		assertEquals(4,maths.mltiply(2, 2)),
		() ->		assertEquals(6,maths.mltiply(3, 2)),
		() ->		assertEquals(8,maths.mltiply(4, 2)),
		() ->		assertEquals(10,maths.mltiply(5, 2))
				
				
				);
	}
	
	
	@Nested
	class Addtest
	{
		@Test
		@DisplayName("positive sum") 
		void testAddPositive() {
			assertEquals(2,maths.add(1, 1),"its runninng add test");
			System.out.println("name is"+info.getDisplayName() +"methord name"+ info.getTestMethod());
		//	reporter.publishEntry(null, null);
		}
		
		@Test
		@DisplayName("nagativ sum") 
		void testAddNegativ() {
			assertEquals(0,maths.add(1, -1),() -> "its runninng add test");
			
			reporter.publishEntry("name is"+info.getDisplayName() +"methord name"+ info.getTestMethod());
		}
	}
	
	
	
}
















