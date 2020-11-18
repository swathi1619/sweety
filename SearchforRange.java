package advjava;

import java.util.ArrayList;

public class SearchforRange {
	public int[] searchRange(int[] nums, int target) {
		if(nums == null || nums.length == 0){
			return null;
			}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i< nums.length; i++){
			if(nums[i]==target){
				result.add(i);
				}
			}
		int[] arr = new int[2];
		if(result.size() == 0){
			arr[0]=-1;
			arr[1]=-1;
			}
		else{
			arr[0] = result.get(0);
			arr[1] = result.get(result.size()-1);
			}
		return arr;
		}
	}

