package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.DnaStrand;


public class DnaStrandTest {
	
	/*
	 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
	 * carries the "instructions" for the development and functioning of living
	 * organisms.
	 * 
	 * If you want to know more http://en.wikipedia.org/wiki/DNA
	 * 
	 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and
	 * "G". You have function with one side of the DNA (string, except for Haskell);
	 * you need to get the other complementary side. DNA strand is never empty or
	 * there is no DNA at all (again, except for Haskell).
	 */
	
    @Test
    public void test01() {
       Assertions.assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
    	Assertions.assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
    	Assertions.assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }    
}
