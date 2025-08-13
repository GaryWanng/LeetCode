package com.example.bootproject.leetcode;

import java.util.Arrays;

/**
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 * <p>
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：citations = [3,0,6,1,5]
 * 输出：3
 * 解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
 * 由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
 * 示例 2：
 * <p>
 * 输入：citations = [1,3,1]
 * 输出：1
 */
public class HIndex {

    public static void main(String[] args) {

        int[] nums = new int[]{3,0,6,1,5};
        int[] nums2 = new int[]{1,3,1};
        int[] nums3 = new int[]{100};
        int[] nums4 = new int[]{0,0,2};
        int[] nums5 = new int[]{0};
        System.out.println(hIndex(nums));
        System.out.println(hIndex(nums2));
        System.out.println(hIndex(nums3));
        System.out.println(hIndex(nums4));
        System.out.println(hIndex(nums5));
    }

    public static int hIndex(int[] citations) {
        int[] sortArray = Arrays.stream(citations)
                .sorted()
                .toArray();

        int n = sortArray.length;

        for (int i = 0; i < sortArray.length; i++) {
            if (sortArray[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }

}
