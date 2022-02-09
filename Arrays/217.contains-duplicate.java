
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.HashSet;

// @lc code=start
class Solution {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
