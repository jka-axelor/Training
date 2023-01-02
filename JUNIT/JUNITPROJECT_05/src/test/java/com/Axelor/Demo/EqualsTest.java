package com.Axelor.Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public interface EqualsTest <B> extends Book<B> {

	B createvalue();
	
	@Test
    default void valueEqualsItself() {
        B value = createbook();
        assertEquals(value, value);
    }

    @Test
    default void valueDoesNotEqualNull() {
        B value = createbook();
        assertFalse(value.equals(null));
    }

    @Test
    default void valueDoesNotEqualDifferentValue() {
        B value = createbook();
        B differentValue = createvalue();
        assertNotEquals(value, differentValue);
        assertNotEquals(differentValue, value);
    }
}
