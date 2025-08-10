package com.example.bootproject.leetcode;

import java.util.Arrays;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 *
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveDuplicateElem {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] nums2 = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 1;
        boolean duplicate = false;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index] && !duplicate) {
                duplicate = true;
                result++;
                index++;
                nums[index] = nums[i];
            }

            if (nums[i] > nums[index]) {
                duplicate = false;
                index++;
                result++;
                nums[index] = nums[i];
            }
        }

        return result;
    }

}
