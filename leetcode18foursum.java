package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18foursum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	if(nums.length <4) {
    		return list;
    	}
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length-3; i++) {
    		if(i>0 && nums[i] == nums[i-1]) {
    			continue;
    		}
    		for (int j = i+1; j < nums.length-2; j++) {
				int start = j+1;
				int end = nums.length-1;
				while(start<end) {
					int sum = nums[i] + nums[j] + nums[start] +nums[end];
					if(sum == target) {
						List<Integer> result =Arrays.asList(nums[i],nums[j],nums[start],nums[end]);
						if(!list.contains(result)) {
							list.add(result);
						}						
						start++;
						end--;
					}else if(sum < target) {
						start++;
					}else {
						end--;
					}
				}
			}
		}
    	return list;
    }


}
