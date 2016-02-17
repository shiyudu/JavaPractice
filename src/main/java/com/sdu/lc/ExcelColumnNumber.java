package com.sdu.lc;

import java.lang.Math;
import java.util.*;

public class ExcelColumnNumber {
	
	
	
    public static int titleToNumber(String s) {
    	int index = 0;
    	int result = 0;
    	int length = s.length();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	//result += (c - 'A' + 1) * Math.pow(26, (--length));
        	result = result * 26 + (c - 'A' + 1);
        }
        
        return result;
    }
    
    public static int romanToInt(String str) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        char prev = 'A';
        int sum = 0;
        for(char s : str.toCharArray()) {
            if(a[s - 'A'] > a[prev - 'A']) {
                sum = sum - 2 * a[prev - 'A'];
            }
            sum = sum + a[s - 'A'];
            prev = s;
        }
        return sum;
        
        
    }
	
	
	public static void main(String[] args) throws Exception{
		
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("AAA"));
		
		System.out.println(romanToInt("IIX"));

		
	}

}
