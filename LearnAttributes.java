package week5.Day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	@Test
	public void a() {
		System.out.println("Test 1");
	}
	
	@Test(priority=-1)
	public void b() {
		System.out.println("Test 2");
	}

	@Test(enabled=false)
	public void c() {
		System.out.println("Test 3");
	}
	
	@Ignore
	@Test
	public void d() {
		System.out.println("Test 4");
		
	}
	
	@Test(invocationCount=3,invocationTimeOut=6000)
	public void e() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 5");
		throw new RuntimeException();
	}
	

}

