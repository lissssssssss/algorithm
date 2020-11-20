package com.lishengsheng.learn.algorithm;

public class Combination {
    public void run(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(nums[start]);
        run(nums, start + 1, end);
        run(nums, start + 1, end);
    }
}
