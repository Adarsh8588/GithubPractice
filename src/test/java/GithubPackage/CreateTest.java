package GithubPackage;

import org.testng.annotations.Test;

public class CreateTest {
	
	
	@Test(groups="smoke")
	public void Create() 
	{
      System.out.println("Created");
}
	@Test(groups="regression")
	public void modify(){
		
	       System.out.println("----modification---");
	}
	@Test
	public void  modifydone(){
		
	       System.out.println("----modification done---");
	      	       
	}
	@Test
	public void m1() {
		System.out.println("----chgdfdhg-----");
	}	
}
