package chit;

public class Console {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
			}
		// initialize minimum  length to be the input array length
		int result = nums.length;
		int i = 0;
		int sum = nums[0];
		for(int j=0; j<nums.length; ){
			if(i==j){
				if(nums[i]>=s){
					return 1;//if single element is large enough
					}
				else{
					j++;
					if(j<nums.length){
						sum = sum + nums[j];
						}
					else{
						return result;
						}
					}
				}
			else{
				//if sum is large enough, move left cursor
				if(sum >= s){
					result = Math.min(j-i+1, result);
					sum = sum - nums[i];
					i++;
					//if sum is not large enough, move right cursor
					}
				else{
					j++;
					if(j<nums.length){
						sum = sum + nums[j];
						}
					else{
						if(i==0){
							return 0;
							}
						else{
							return result;
							}
					}
					}
				}
			}
		return result;
	}

}

