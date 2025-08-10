package com.example.bootproject.leetcode;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1：
 *
 * 输入：nums = [3,2,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        int[] nums2 = new int[]{2,2,1,1,1,2,2};
        int[] nums3 = new int[]{3,3,4};
        int[] nums4 = new int[]{2,2,1,3,1,1,4,1,1,5,1,1,6};
        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement2(nums2));
        System.out.println(majorityElement2(nums3));
        System.out.println(majorityElement2(nums4));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 这个思路更好：
     * 如果一个数组有大于一半的数相同，那么任意删去两个不同的数字，新数组还是会有相同的性质，删除到最后剩下的就只能是出现最多的那个值
     * @param nums
     * @return
     */
    public static int majorityElement2(int[] nums) {
        int winner = nums[0];
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (winner == nums[i]) {
                count++;
            } else {
                if (count == 0) {
                    winner = nums[i];
                } else {
                    count--;
                }
            }
        }

        return winner;
    }

}
