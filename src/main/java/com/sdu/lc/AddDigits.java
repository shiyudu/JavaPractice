package com.sdu.lc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddDigits {
	
	public static void main(String[] args) throws Exception{
		//https://leetcode.com/problems/add-digits/
		addDigits();
	}
		
    @SuppressWarnings("resource")
	public static void addDigits() {
    	Scanner scanner = new Scanner(System.in);
    	
    	int num = -1;
    	int sum = 0;
    	
    	while (true) {
    		System.out.println("Input a number: ");
    		try {
    			num = scanner.nextInt();
        		if (num < 0){
        			break;
        		}
        		    			
    			do {
    				sum = sumDigits(num);
    				num = sum;
    			} while (sum > 9);
    			
    			System.out.println("sum is " + sum);
    			
    		} catch (InputMismatchException e) {
    			System.out.print("Invalid input. Please reenter: ");
    			scanner.nextLine();
    		}
    		

    		
    	}
    }
    
    public static int sumDigits(int num){
    	int sum = 0;
    	while (num > 0) {
    		sum = sum + num % 10;
			num = (num - num % 10) / 10;
    	}
    	return sum;
    }
    


}
