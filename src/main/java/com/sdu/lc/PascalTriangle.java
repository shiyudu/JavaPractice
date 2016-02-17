package com.sdu.lc;

import java.util.*;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> results = new ArrayList<List<Integer>>();
    	if (numRows > 0) {
    		for (int i = 0; i < numRows; i++) {
    			List<Integer> row = new ArrayList<Integer>();

    			if (i == 0) {
    				row.add(1);
    			} else if (i == 1) {
    				row.add(1);
    				row.add(1);
    			} else {
    				row.add(1);
    				for (int j = 1; j < i; j++) {
    					row.add(results.get(i-1).get(j-1) + results.get(i-1).get(j));
    				}
    				row.add(1);
    			}

    			results.add(row);
    		}
    	}

    	return results;
    }

	//https://leetcode.com/problems/pascals-triangle-ii/
	//Time Limit Exceeded
	public static List<Integer> generateII(int n) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i < n+1; i++) {
			result.add(getPascalValue(n, i));
		}
		return result;
	}

	public static int getPascalValue(int i, int j) {
		if (i < 0 || j < 0 || j > i+1) return 0; //unnecessary

		if (i == 1 && j == 1) return 1;

		if (i == 0 || j == 0 || j == i + 1) return 0;

		return getPascalValue(i-1, j-1) + getPascalValue(i-1, j);

	}



	public static void main(String[] args) throws Exception{

//    	System.out.println(generate(6).toString());
		System.out.println(generateII(7).toString());


	}

}
