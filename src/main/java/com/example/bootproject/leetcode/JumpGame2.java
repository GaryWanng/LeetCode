package com.example.bootproject.leetcode;

/**
 * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
 *
 * 每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。换句话说，如果你在索引 i 处，你可以跳转到任意 (i + j) 处：
 *
 * 0 <= j <= nums[i] 且
 * i + j < n
 * 返回到达 n - 1 的最小跳跃次数。测试用例保证可以到达 n - 1。
 *
 *
 * 示例 1:
 *
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 示例 2:
 *
 * 输入: nums = [2,3,0,1,4]
 * 输出: 2
 */
public class JumpGame2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        int[] nums2 = new int[]{2,3,0,1,4};
        int[] nums3 = new int[]{0};
        int[] nums4 = new int[]{2,1};
        int[] nums5 = new int[]{1,2,3};
        int[] nums6 = new int[]{1,1,2,1,1};
        int[] nums7 = new int[]{4,1,1,3,1,1,1};
        int[] nums8 = new int[]{2,0,2,0,1};
        int[] nums9 = new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        int[] nums11 = new int[]{9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};
        System.out.println(jump(nums));
        System.out.println(jump(nums2));
        System.out.println(jump(nums3));
        System.out.println(jump(nums4));
        System.out.println(jump(nums5));
        System.out.println(jump(nums6));
        System.out.println(jump(nums7));
        System.out.println(jump(nums8));
        System.out.println(jump(nums11));
    }

    public static int jump(int[] nums) {

        int count = 0;
        int nextIndex = Math.min(nums[0], nums.length - 1);
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums.length == 1) {
                break;
            }
            if (i < (j + nums[j]) && i < nums.length - 1) {
                if (i + nums[i] > nextIndex + nums[nextIndex] && i != j) {
                    nextIndex = i;
                }
            } else {
                count++;
                if (i + nums[i] > nextIndex + nums[nextIndex]) {
                    nextIndex = i;
                }
                j = nextIndex;
                nextIndex = Math.min(j + nums[j], nums.length - 1);
            }
        }

        return count;
    }

}
