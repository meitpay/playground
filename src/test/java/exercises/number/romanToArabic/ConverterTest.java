package exercises.number.romanToArabic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {
    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }
    @Test
    public void testFromRomanToArabicValue1() {
        int result = converter.fromRomanToInt("I");
        assertEquals(1, result);
    }

    @Test
    public void testFromRomanToArabicValue2() {
        int result = converter.fromRomanToInt("II");
        assertEquals(2, result);
    }

    @Test
    public void testFromRomanToArabicValue3() {
        
        int result = converter.fromRomanToInt("III");
        assertEquals(3, result);
    }


    @Test
    public void testFromRomanToArabicValue4() {
        
        int result = converter.fromRomanToInt("IV");
        assertEquals(4, result);
    }

    @Test
    public void testFromRomanToArabic19() {
        
        int result = converter.fromRomanToInt("XIX");
        assertEquals(19, result);
    }

    @Test
    public void testFromRomanToArabic9() {
        
        int result = converter.fromRomanToInt("IX");
        assertEquals(9, result);
    }

    @Test
    public void testFromRomanToArabic24() {
        
        int result = converter.fromRomanToInt("XXIV");
        assertEquals(24, result);
    }

    @Test
    public void testFromRomanToArabic29() {
        
        int result = converter.fromRomanToInt("XXVIIII");
        assertEquals(29, result);
    }
}
