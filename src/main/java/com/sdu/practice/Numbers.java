package com.sdu.practice;

import java.math.BigDecimal;
import java.util.Arrays;

public class Numbers {
	
	public static void main(String[] args) throws Exception{
		
//		floatNumbers();
		intLimit();

	}
	
	public static void intLimit() {
		long l;
		int i = -123456;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("abs(min) = " + Math.abs(min)); // strange. still negative
		int negMin = min * (-1);
		System.out.println("negMin = " + negMin);
		int negMax = max * (-1);
		System.out.println("negMax = " + negMax);
		l = min;
		l = l * (-1);
		System.out.println("l = " + l);
		
		l = min * (-1);
		System.out.println("l = " + l);
		
		l = max;
		l = l * 2;
		System.out.println("l = " + l);
		
		l = max * 2;
		System.out.println("l = " + l);

	}
	
	public static void floatNumbers() {
		Double a = new Double(0.2);
		Double b = new Double(0.2);
		Double sum = a + b;
		Double c = new Double(0.4);
		System.out.println("c=" + c + ", a+b=" + sum + ", equals: " + c.equals(a+b));
		System.out.println(sum.compareTo(c));
		System.out.println("a=b? " + a.equals(b));
		
		BigDecimal ba = new BigDecimal(0.2);
		BigDecimal bb = new BigDecimal(0.2);
		BigDecimal bc = new BigDecimal(0.4);
		BigDecimal bsum = ba.add(bb);
		System.out.println("bc=" + bc + ", ba+bb=" + bsum + ", equals: " + bc.equals(ba.add(bb)));
		System.out.println(bsum.compareTo(bc));
		System.out.println("ba=bb? " + ba.equals(bb));
		
		BigDecimal negNum = new BigDecimal(-0.0000001);
		if (negNum.compareTo(new BigDecimal(0)) < 0) {
			System.out.println("negNum < 0");
		}
		
		int num = 5/2;
		System.out.println(num);
		
		num = 28;
		for (int i=0; i < 10; i++){
			System.out.print(((int)(Math.random()*num*10))%num + " ");
			System.out.println();
			System.out.print((int)(Math.random()*num) + " ");
		}
		
		int[] count = new int[26];
		System.out.println(Arrays.toString(count));
	}
}
