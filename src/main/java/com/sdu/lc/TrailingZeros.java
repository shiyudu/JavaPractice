package com.sdu.lc;

/**
 *https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class TrailingZeros {

	//Time Limit exceed
	public static int trailingZeroes(int n) {
		if (n <= 0) return 0;

		int count = 0;

//		//power of 10
//		for (int i = 1; Math.pow(10, i) <= n; i++) {
//			for (int j = 1; Math.pow(10, i)*j <= n; j++) {
//					count += i;
//			}
//		}
//
//		//2 * 5
//		for (int i=1; Math.pow(10, i) <= n; i++) {
//			for (int j = 1; ; j++) {
//				for (int k = 1; ; k++) {
//
//				}
//			}
//		}

		int c2 = 0;
		int c5 = 0;

		for (int i = 1; i <= n; i++) {
			int x = i;
			while (x % 2 == 0) {
				c2++;
				x /= 2;
			}

			while (x % 5 == 0) {
				c5++;
				x /= 5;
			}
		}

		count = Math.min(c2, c5);

		return count;
	}

	public static void main(String[] args) throws Exception{
		System.out.println(trailingZeroes(5));

	}
}
