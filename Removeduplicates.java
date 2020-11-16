package swathi;

public class Removeduplicates {
	public int removeDuplicates(int[] A) {
		if(A == null || A.length == 0)
			return 0;
		int pre = A[0];
		boolean flag = false;
		int count = 0;
		for(int i=1; i<A.length; i++){
			int curr = A[i];
			if(curr == pre){
				if(!flag){
					flag = true;
					continue;
					}
				else{
					count++;
					}
				}
			else{
				pre = curr;
				flag = false;
				}
			}
		return A.length - count;
		}
	}