package com.sdu.lc;

/**
 * https://leetcode.com/problems/house-robber/
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {


	//will stack over flow when nums length is large
	public static int rob(int[] nums) {
		int length = nums.length;

		if (length == 0) return 0;
		if (length == 1) return nums[0];
		return Math.max(subRob(nums, 1), nums[0] + subRob(nums, 2));
	}

	public static int subRob(int[] nums, int i) {
		int length = nums.length;
		if (i >= length) return 0;

		if (i == length -1) {
			return nums[i];
		}

		return Math.max(subRob(nums, i+1), nums[i] + subRob(nums, i+2));

	}


	public static void main(String[] args) throws Exception{

		int[] nums = new int[] {1, 10, 15, 12, 3};
		System.out.println(rob(nums));

	}

}
