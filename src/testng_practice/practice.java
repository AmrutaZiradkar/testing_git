package testng_practice;

import org.testng.annotations.Test;

public class practice {
  @Test(expectedExceptions=ArrayIndexOutOfBoundsException.class) 
  public void test0()
  {
	  int a[]= new int[2];
	  a[3]=5;
	  System.out.println("Value of a= "+a[2]);
  }
  
  @Test(dependsOnMethods="test0")
  public void test1()
  {
	  System.out.println("Bye...");
	  
  }
  
  @Test(dependsOnMethods="test0")
  public void test2()
  {
	  System.out.println("good night...");
	  
  }
  
  @Test(dependsOnMethods="test0")
  public void test3()
  {
	  System.out.println("HAVE a nice day...");
	  
  }
  
  @Test(dependsOnMethods="test0")
  public void test4()
  {
	  System.out.println("sweet dreams...");
	  
  }
}
