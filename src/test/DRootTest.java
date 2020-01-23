package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.DRoot;

public class DRootTest {

	/*
	 * In this kata, you must create a digital root function.
	 * A digital root is the recursive sum of all the digits in a number. 
	 * Given n, take the sum of the digits of n. 
	 * If that value has more than one digit, continue reducing in this way until a single-digit number is produced. 
	 * This is only applicable to the natural numbers.
	 * */
	
	@Test
    public void Tests() {
      Assertions.assertEquals(7, DRoot.digital_root(16));
      Assertions.assertEquals(6, DRoot.digital_root(456));
      Assertions.assertEquals(2, DRoot.digital_root(493193));
    }
	
}
