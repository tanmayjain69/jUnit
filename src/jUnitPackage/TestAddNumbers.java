package jUnitPackage;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestAddNumbers {

	@Test
	void test() {
		jUnitfunction junit=new jUnitfunction();
		int result=junit.addNumbers(100, 200);
		assertEquals(300,result);
	}


}
