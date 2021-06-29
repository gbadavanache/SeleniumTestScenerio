package Run10outof100TC;

import org.testng.annotations.Test;

public class TenoutofHundredExample2 {
	@Test 
	public void test9() {
		System.out.println(" Test9");
	}
	@Test ( groups = {"myTest"})
	public void test10() {
		System.out.println("required Test10");
	}
	@Test
	public void test11() {
		System.out.println(" Test11");
	}
	@Test (dependsOnMethods = {"test13"})
	public void test12() {
		System.out.println("Test12");
	}
	@Test( groups = {"myTest"})
	public void test13() {
		System.out.println("required Test13");
	}
	@Test
	public void test14() {
		System.out.println("Test14");
	}
	@Test (dependsOnMethods = {"test14"})
	public void test15() {
		System.out.println(" Test15");
	}
	@Test ( groups = {"myTest"})
	public void test16() {
		System.out.println("required Test16");
	}
	
}
