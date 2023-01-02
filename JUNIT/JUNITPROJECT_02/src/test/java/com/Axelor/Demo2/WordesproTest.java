package com.Axelor.Demo2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class WordesproTest {

	private Wordespro wp = new Wordespro();
	
	@TestFactory
	List<DynamicTest> dynamicTestForpalandrum()
	{
		return Arrays.asList(
			DynamicTest.dynamicTest(" 1st test ", () -> assertTrue(wp.itsPalindrome("aba"))),	
			DynamicTest.dynamicTest(" 2st test ", () -> assertTrue(wp.itsPalindrome("bcb"))),
			DynamicTest.dynamicTest(" 3st test ", () -> assertTrue(wp.itsPalindrome("dfd"))),
			DynamicTest.dynamicTest(" 4st test ", () -> assertTrue(wp.itsPalindrome("mam")))
				
				);
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTestForanagram()
	{
		return Arrays.asList(
				DynamicTest.dynamicTest(" 5st test ", () -> assertTrue(wp.itsAnagram("aba","aba"))),	
				DynamicTest.dynamicTest(" 6st test ", () -> assertTrue(wp.itsAnagram("abc","abc"))),
				DynamicTest.dynamicTest(" 7st test ", () -> assertTrue(wp.itsAnagram("mno","onm"))),
				DynamicTest.dynamicTest(" 8st test ", () -> assertTrue(wp.itsAnagram("pqr","qrp")))
				);
	}

	@TestFactory
	DynamicTest[] dynamicTestForboth()
	{
		return new DynamicTest[] {
				DynamicTest.dynamicTest(" 1st test ", () -> assertTrue(wp.itsPalindrome("aba"))),	
				DynamicTest.dynamicTest(" 2st test ", () -> assertTrue(wp.itsPalindrome("bcb"))),
				DynamicTest.dynamicTest(" 3st test ", () -> assertTrue(wp.itsPalindrome("dfd"))),
				DynamicTest.dynamicTest(" 4st test ", () -> assertTrue(wp.itsPalindrome("mam"))),
				DynamicTest.dynamicTest(" 5st test ", () -> assertTrue(wp.itsAnagram("aba","aba"))),	
				DynamicTest.dynamicTest(" 6st test ", () -> assertTrue(wp.itsAnagram("abc","abc"))),
				DynamicTest.dynamicTest(" 7st test ", () -> assertTrue(wp.itsAnagram("mno","onm"))),
				DynamicTest.dynamicTest(" 8st test ", () -> assertTrue(wp.itsAnagram("pqr","qrp")))
		};
	}
	/*only list of objet are accept*/
//	@TestFactory
//	List<String>dinamictestwithInvalidreturnType()
//	{
//		return Arrays.asList("hello");
//	}
	
	/*Nasted class concept*/
	@Nested
	@Order(2)
	class wordtest1
	{
		@Test
		void  testWord()
		{
			assertEquals(0, wp.itsWord("its not a word"));
		}
	}
	
	
	@Nested
	@Order(1)
	class wordtest2
	{
		@Test
		void  testWord()
		{
			assertEquals(1, wp.itsWord("word"));
		}
	}
	
	/*All parametarized teST THAT ARE OF DIFFERENT TYPE*/
	
	
	@ParameterizedTest
	@ValueSource(strings = {"aba","bcb","mnm" , "kjk" , "mom"})
	void testWords(String s)
	{
		assertTrue(wp.itsPalindrome(s));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testWithValueSource(int argument) {
	    assertTrue(argument > 0 && argument < 4);
	}
	
	@ParameterizedTest
//	@NullSource
//	@EmptySource
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void nullEmptyAndBlankStrings(String text) {
	    assertTrue(text == null || text.trim().isEmpty());
	}

	/*methord providers*/
	
static	String[] word()
	{
		String arr [] = {"aaa","bbb","ccc" , "kjk" , "mom"};
		return arr;
		
	}
	@ParameterizedTest
	@MethodSource("word")
	void chack (String s)
	{
		assertTrue(wp.itsPalindrome(s));
	}
	
	@ParameterizedTest
	@CsvSource({
			"mom , omm",
			"aba , aab", 
			"pqr , rpq" 
	})
	public void testAnagram(String a , String b)
	
	{
		assertTrue(wp.itsAnagram(a, b));
	}
	
	
//	@ParameterizedTest
//	@MethodSource
//	public void testAnagram2(String a , String b)
//	{
//		assertTrue(wp.itsAnagram(a, b));
//	}
//	
	
	@ParameterizedTest
	@ArgumentsSource(ArgumentProvider.class)
	void testofpalandrum(String s)
	{
		assertTrue(wp.itsPalindrome(s));
	}
}


























