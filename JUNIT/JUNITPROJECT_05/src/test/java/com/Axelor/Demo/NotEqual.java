package com.Axelor.Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public interface NotEqual <B extends Comparable<B>> extends Book<B> {

	B createNotequal();
	
	 @Test
	    default void returnsZeroWhenComparedToItself() {
	        B value = createbook();
	        assertEquals(0, value.compareTo(value));
	    }

	    @Test
	    default void returnsPositiveNumberWhenComparedToSmallerValue() {
	        B value =  createbook();
	        B smallerValue = createNotequal();
	        assertTrue(value.compareTo(smallerValue) > 0);
	    }

	    @Test
	    default void returnsNegativeNumberWhenComparedToLargerValue() {
	        B value = createbook();
	        B smallerValue = createNotequal();
	        assertTrue(smallerValue.compareTo(value) < 0);
	    }
}
