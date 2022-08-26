package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class TestNGNew {

	    @BeforeClass 
	    public void Sample1 () {
		System.out.println("Before class");
	    }
	    
	    @BeforeMethod 
	    public void Sample3() {
		System.out.println("Before Method");
	    }
	    
	    @Test
		public void New1() {
			System.out.println("Test1");
		}
		
		@Test 
		public void New2() {
			System.out.println("Test2");
			
		}
		
		@Test
		public void New3() { 
			System.out.println("Test3");
		}
		 @AfterMethod 
		    public void Sample4 () {
			System.out.println("After Method");
	     }
		   
	    @AfterClass 
	    public void Sample2 () {  
		System.out.println("After class");
	    }
}	



