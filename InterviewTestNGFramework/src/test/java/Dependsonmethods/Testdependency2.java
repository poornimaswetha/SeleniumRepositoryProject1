package Dependsonmethods;

import org.testng.annotations.Test;

public class Testdependency2 {
	@Test(groups = { "smoke" })
	public void test1() {
		System.out.println("smoke - test1");
	}
	@Test(groups = { "smoke" })
	public void test2() {
		System.out.println(12/0);
		System.out.println("smoke -test2");
	}
	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("smoke - test3");
	}
	@Test(groups = { "sanity" })
	public void test4() {
		System.out.println("sanity");
	}
	@Test(groups = { "sanity" })
	public void test5() {
		System.out.println("sanity - test4");
	}
	@Test(groups = { "sanity" })
	public void test6() {
		System.out.println("sanity - test5");
	}

}
