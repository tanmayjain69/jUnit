package jUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddStrings {

	@Test
	void test() {
		jUnitfunction junit=new jUnitfunction();
		String result=junit.addStrings("tanmay", "jain");
		assertEquals("tanmayjain",result);
	}

}
