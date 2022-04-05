package mavenpackage;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class UITest {

	@Test
	public void hello1() {
		System.out.println("Hello1");
		//assertTrue(false);
	}
	
	@Test
	public void hello2() {
		System.out.println("Hello2");
	}
	@Test
	public void hello3() {
		System.out.println("Hello3");
	}
}
