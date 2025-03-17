package com.bptn;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		//writing a loop that starts counting from 1 and ends at 100
		
		for (int i = 1; i <= 100; i++) {
			
			
			//logic for FizzBuzz
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				//printing out remaining values
				System.out.println(i);
			}
			

		}
		
	}
}
