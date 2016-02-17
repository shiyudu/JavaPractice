package com.sdu.lc;

import java.util.*;
//https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet set = new HashSet();
		
		for (int num : nums) {
			if (!set.add(num))
				return true;
		}
		
	    return false;
	}
	
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int index = nums.length / 2;
        return nums[index];       
    }
    
    public static boolean isUgly(int num) {
        if (num <= 0) 
        	return false;
        if (num == 1)
        	return true;
        
        while(num % 2 == 0) {
        	num /= 2;
        }
        
        while(num % 3 == 0) {
        	num /= 3;
        }
        
        while(num % 5 == 0) {
        	num /= 5;
        }
        
        return num==1;

    }
    
    public static boolean isHappy(int n) {
        
        
        HashSet checked = new HashSet();
        
        while (checked.add(n)) {
        	
        	if (n == 1) return true;
	        int sum = 0;
	        while (n > 0) {
	        	sum += Math.pow(n % 10, 2);
	        	n = n / 10;
	        }
	        
	        n = sum;
        }
	        
	    return false;
        
    }
    
    public static int myAtoi(String str) {
    	if (str == null || str.isEmpty() || str.trim().isEmpty())
    		return 0;
    	
        str = str.trim();
        
        int sign = 1;
        long result = 0;
        
        if (str.charAt(0) == '+') {
        	sign = 1;
        	str = str.substring(1);
        } else if (str.charAt(0) == '-') {
        	sign = -1;
        	str = str.substring(1);
        }
        
        long absIntegerMin = Integer.MIN_VALUE;
        absIntegerMin *= -1;
        
		for (char c : str.toCharArray()) { 
			if (c < '0' || c > '9')
				break;
			
			result = result * 10 + c - '0';
			
			if (sign == 1 && result > Integer.MAX_VALUE){
				result = Integer.MAX_VALUE;
				break;
			}
			
			if (sign == -1 && result > absIntegerMin) {
				result = absIntegerMin;
				break;
			}		
		}
		
		return (int)result * sign;
    }
    
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = length - 1;       
        
        for (int i = 0; i <= j; i++) {
        	if (nums[i] == val) {
                while (nums[j] == val) {
                	j--;
                	if (j < i) return j+1;
                }
        		
        		swap(i, j, nums);
        		j--;
        	}
        }
        
        return j + 1;
    }
    
    public static void swap(int i, int j, int[] nums) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
    
    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            digits[i]++;
        	if (digits[i] > 9) {
        		digits[i] = 0;
        	} else {
        	    return digits;
        	}
        }
        
        //need one more digit before digit[0]
        int[] result = new int[length + 1];
    	result[0] = 1;
    	for (int i = 1; i < length + 1; i++) {
    		result[i] = 0;
    	}
    	
    	return result;
    }
	
	public static void main(String[] args) throws Exception{
		//int[] nums = new int[] {1, 3, 5, 7, 9};	
		int[] nums = {1, 3, 5, 3, 9};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(containsDuplicate(nums));
		
		int[] nums2 = {};
		System.out.println(containsDuplicate(nums2));
		
		System.out.println(isUgly(14));
		System.out.println(isHappy(19));
		
		System.out.println(myAtoi("  -00123"));
		System.out.println(myAtoi("  +123ab5 "));
		
		int[] nums3 = {3};
		int val = 3;
		System.out.println("nums = " + Arrays.toString(nums3) + ", val = " + val);
		int length = removeElement(nums3, val);
		System.out.println("new nums = " + Arrays.toString(nums3) + ", length = " + length);
		
	

	}

}
