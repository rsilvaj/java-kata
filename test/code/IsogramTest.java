package code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsogramTest {
	
	/**
	 * 
	 * An isogram is a word that has no repeating letters, consecutive or
	 * non-consecutive. Implement a function that determines whether a string that
	 * contains only letters is an isogram. Assume the empty string is an isogram.
	 * Ignore letter case.
	 * 
	 */
	
	Isogram isogram = new Isogram();
	
    @Test
    public void FixedTests() {
        Assertions.assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        Assertions.assertEquals(true, isogram.isIsogram("isogram"));
        Assertions.assertEquals(false, isogram.isIsogram("moose"));
        Assertions.assertEquals(false, isogram.isIsogram("isIsogram"));
        Assertions.assertEquals(false, isogram.isIsogram("aba"));
        Assertions.assertEquals(false, isogram.isIsogram("moOse"));
        Assertions.assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        Assertions.assertEquals(true, isogram.isIsogram("")); 
    }
}
