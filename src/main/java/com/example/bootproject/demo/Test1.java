package com.example.bootproject.demo;

public class Test1 {

    static class Solution {
        public void solution(int N) {
            // Implement your solution here
            for(int i = 1; i <= N; i++) {
                if (i < N) {
                    System.out.println("L");
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int j = 1; j <= N; j++) {
                        stringBuilder.append("L");
                    }
                    System.out.println(stringBuilder);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(2);
    }

}
