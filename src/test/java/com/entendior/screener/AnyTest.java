package com.entendior.screener;

import org.testng.annotations.Test;

public class AnyTest {
	
  @Test
  public void testStringFormat() {
	  
	  String input = "Sentence with no format in";
	String toAppend = ", end of sentence.";
	String output = String.format(input, toAppend);
	System.out.println(output);
	if (output == input){
		System.out.println("Instance equality");
	} else if (output.equals(input)){
		System.out.println("Object equality");
		output = String.format(input + "%s", toAppend);
		System.out.println(output);
	}
  }
  
  
}
