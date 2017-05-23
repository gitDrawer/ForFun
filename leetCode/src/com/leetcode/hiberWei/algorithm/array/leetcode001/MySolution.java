package com.leetcode.hiberWei.algorithm.array.leetcode001;

import java.util.HashMap;

/**
 * author:wzw
 * refer:hashMap
 * runtime:6
 */
public class MySolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap();
        int[] indices = new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)&&(Integer)map.get(temp)>i){
                indices[0]=i;
                indices[1]=(Integer)map.get(temp);
                break;
            }
        }
        return indices;
    }
}
