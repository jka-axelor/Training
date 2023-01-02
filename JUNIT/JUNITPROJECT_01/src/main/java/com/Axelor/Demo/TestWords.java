package com.Axelor.Demo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

@RunWith(Parameterized.class)
public class TestWords {

	StringBook book = new StringBook();
	
//	@Test
//	public void  testword()
//	{
//		assertEquals(1,book.itsWord("jagabandhu"));
//	}
//	
//	@Test
//	public void  testentance()
//	{
//		assertEquals(0,book.itsWord("jagaba kar is namwv ucbu"));
//	}
//	
//	@Test
//	public void  testnull()
//	{
//		assertEquals(1,book.itsWord("hfiyhbiyoj"));
//	}
//	
//	@RepeatedTest(value = 5 , name = "{displayName} {currentRepetition}/{totalRepetitions}")
//	@DisplayName("Repeat!")
//	@AfterEach
//	public void multiValue()
//	{
//	//	assertEquals(0,book.itsWord("jagaba kar is namwv ucbu"));
//	}
//	
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	public void multipleTast(String s)
	{
		assertEquals(1,book.itsWord(s));
		assertTrue(book.manager(s));
//		System.out.println(10/0);
	}
	
//	@Test
//	@After
//	@DisplayName("Repeat!")
//	public void test(String s)
//	{
//		System.out.println(10/0);
//		assertEquals(1,book.itsWord(s));
//	}
}








