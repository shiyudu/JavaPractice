package com.sdu.practice;

import java.util.Arrays;

public class BitManipulate {
	
	public static void main(String[] args) throws Exception{
	
		int a = 15;
		int b = 5;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a >>> 1);
		System.out.println(Integer.toBinaryString(15 & (1 << 6)));
		
		int input = 15;
		boolean[] bits = new boolean[7];
	    for (int i = 6; i >= 0; i--) {
	        bits[i] = (input & (1 << i)) != 0;
	    }
	
	    System.out.println(input + " = " + Arrays.toString(bits));
	    
	    //int limit [-2147483648, 2147483647]
	    System.out.println( "largest long is " + Long.MAX_VALUE );
	    System.out.println( "largest int is " + Integer.MAX_VALUE );

	    long x = (long)Integer.MAX_VALUE;
	    x++;
	    System.out.println("long x=" + x);

	    int y = (int) x;
	    System.out.println("int y=" + y);
	    //max_int = 01...1, max_int + 1 = 10...0 = ~max_int = -max_int -1 
	}
	
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        int index = 1;
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((n & (index << i)) != 0){
                count ++;
            }
            
            if (count > 1) return false;
        }
        
        return true;
        
    }

}
