package roman;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class romantesting {
		@Test
		public void manyletters() {
			int result = new romanwork().romanToDecimal("II");
			Assertions.assertEquals(2, result);
			int result1 = new romanwork().romanToDecimal("VII");
			Assertions.assertEquals(7, result1);
		}
		@Test
		public void subnotattion() {
			int result = new romanwork().romanToDecimal("IV");
			Assertions.assertEquals(4, result);
			int result1 = new romanwork().romanToDecimal("IX");
			Assertions.assertEquals(9, result1);
		}
		@Test
		public void invalidentry() {
			int result = new romanwork().romanToDecimal("G");
			Assertions.assertEquals(0, result);
			int result1 = new romanwork().romanToDecimal("AB");
			Assertions.assertEquals(0,result1);
			int result2 = new romanwork().romanToDecimal("VB");
			Assertions.assertEquals(0,result2);
			
		}
		
		@Test
		public void checksingledigit() {
			int result = new romanwork().romanToDecimal("I");
			Assertions.assertEquals(1, result);
			int result1 = new romanwork().romanToDecimal("V");
			Assertions.assertEquals(5, result1);
			int result2 = new romanwork().romanToDecimal("X");
			Assertions.assertEquals(10, result2);
			int result3 = new romanwork().romanToDecimal("L");
			Assertions.assertEquals(50, result3);
			int result4 = new romanwork().romanToDecimal("C");
			Assertions.assertEquals(100, result4);
			int result5 = new romanwork().romanToDecimal("D");
			Assertions.assertEquals(500, result5);
			int result6 = new romanwork().romanToDecimal("M");
			Assertions.assertEquals(1000, result6);
		}
		@Test
		public void invalidandvalidletter() {
			int result = new romanwork().romanToDecimal("XIZ");
			Assertions.assertEquals(0, result);
		}
		@Test
		public void doubleinvalid() {
			int result = new romanwork().romanToDecimal("VV");
			Assertions.assertEquals(0, result);
			int result1 = new romanwork().romanToDecimal("LL");
			Assertions.assertEquals(0, result1);
			int result2 = new romanwork().romanToDecimal("DD");
			Assertions.assertEquals(0, result2);
		}

	}


