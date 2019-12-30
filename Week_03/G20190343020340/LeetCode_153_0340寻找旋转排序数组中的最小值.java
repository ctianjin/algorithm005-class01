package com.exercise.week_three;/** * @ClassName: * @Description: * @Author: * @Date: *//** *@ClassName LeetCode_50_0340POW(X,N) *@Description *@Autor *@Date 2019/12/1521:27 *@Version 1.0 *@Example **/public class LeetCode_153_0340寻找旋转排序数组中的最小值 {    public static void main(String[] args) {        int[] nums = {4,5,6,7,0,1,2};        System.out.println(findMin(nums));    }    // 暴力法，虽然不符合题意    public static int findMin(int[] nums) {        // 边界条件        if (nums == null || nums.length == 0){            return 0;        }        int temp = nums[0];        for (int i = 1; i < nums.length; i++) {            if (temp > nums[i]){                temp = nums[i];            }        }        return temp;    }    // 二分法    public static int findMin1(int[] nums) {        // 边界条件        if (nums == null || nums.length == 0){            return 0;        }        int left = 0;        int right = nums.length - 1;        while (left < right) {            int mid = left + (right - left) / 2;            // 如果中位数>最右边，说明最小值在右侧区间            if (nums[mid] > nums[right]) {                left = mid + 1;            }            else {                right = mid;            }        }        return nums[left];    }}