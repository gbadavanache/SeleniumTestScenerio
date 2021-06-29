package Run10outof100TC;

import org.testng.annotations.Test;

public class tenOutofHundred {
			
		@Test  ( groups = {"myTest"})
		public void test1() {
			System.out.println("required Test1");
		}
		@Test ( groups = {"myTest"})
		public void test2() {
			System.out.println("required Test2");
		}
		@Test  ( groups = {"myTest"})
		public void test3() {
			System.out.println("required Test3");
		}
		@Test
		public void test4() {
			System.out.println("Test4");
		}
		@Test ( groups = {"myTest"})
		public void test5() {
			System.out.println("required Test5");
		}
		@Test (dependsOnGroups = {"myTest"})
		public void test6() {
			System.out.println("Test6");
		}
		@Test
		public void test7() {
			System.out.println(" Test7");
		}
	}
	
