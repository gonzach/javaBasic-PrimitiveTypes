package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class IntegerTypeTest {
    @Test
    void should_get_range_of_primitive_int_type() {
        final int maximum = 0x7fffffff;
        final int minimum = 0x80000000;

        final int maximumSymbol = Integer.MAX_VALUE;
        final int minimumSymbol = Integer.MIN_VALUE;

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_short_type() {
        final short maximum = 32767;
        final short minimum = -32768;

        final short maximumSymbol = Short.MAX_VALUE;
        final short minimumSymbol = Short.MIN_VALUE;

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_long_type() {
        final long maximum = 0x7fffffffffffffffL;
        final long minimum = -0x8000000000000000L;

        final long maximumSymbol = Long.MAX_VALUE;
        final long minimumSymbol = Long.MIN_VALUE;

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_get_range_of_primitive_byte_type() {
        final byte maximum = 127;
        final byte minimum = -128;

        final byte maximumSymbol = Byte.MAX_VALUE;
        final byte minimumSymbol = Byte.MIN_VALUE;

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    @Test
    void should_overflow_silently() {
        int theNumberWillOverflow = Integer.MAX_VALUE;
        ++theNumberWillOverflow;

        final int expectedResult = -2147483648;

        assertEquals(expectedResult, theNumberWillOverflow);
    }

    @Test
    void should_underflow_silently() {
        int theNumberWillUnderflow = Integer.MIN_VALUE;
        --theNumberWillUnderflow;

        final int expectedResult = 2147483647;

        assertEquals(expectedResult, theNumberWillUnderflow);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void should_throw_exception_when_overflow() {
        int theNumberWillOverflow = Integer.MAX_VALUE;
        assertThrows(ArithmeticException.class, () -> add(theNumberWillOverflow, 1));

    }

    @Test
    void just_prevent_lazy_implementation() {
        assertEquals(3, add(1, 2));
    }

    @SuppressWarnings({"PointlessArithmeticExpression", "IntegerDivisionInFloatingPointContext"})
    @Test
    void should_take_care_of_number_type_when_doing_calculation() {
        final double result1 = 2 / 3 * 5;
        final double result2 = 2 * 5 / 3;

        final double expectedResult1 = 0.0D;
        final double expectedResult2 = 3.0D;

        assertEquals(expectedResult1, result1, +1.0E-05);
        assertEquals(expectedResult2, result2, +1.0E-05);
    }

    @Test
    void should_truncate_number_when_casting() {
        final int integer = 0x0123_4567;
        final short smallerInteger = (short)integer;

        final short expected = 17767;

        assertEquals(expected, smallerInteger);
    }

    @Test
    void should_increment() {
        int integer = 3;
        int result = integer++;

        final int expectedCurrentInteger = 4;
        final int expectedResult = 3;

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @Test
    void should_increment_2() {
        int integer = 3;
        int result = ++integer;

        final int expectedCurrentInteger = 4;
        final int expectedResult = 4;

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @SuppressWarnings("unused")
    private int add(int left, int right) {
        int var = left + right;
        if (var == Integer.MIN_VALUE){
            throw new ArithmeticException("Overflow");
        }
        else if (var == Integer.MAX_VALUE) {
            throw new ArithmeticException("Underflow");
        }
        else {
            return var;
        }
    }
}
