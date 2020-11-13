package chit;

public class Browse {
public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int[] temp = new int[triangle.size()];
		int minTotal = Integer.MAX_VALUE;
		for(int i=0; i< temp.length; i++){
			temp[i] = Integer.MAX_VALUE;
			}
		if (triangle.size() == 1) {
			return Math.min(minTotal, ((Browse) triangle.get(0)).get(0));
			}
		int first = ((Browse) triangle.get(0)).get(0);
		for (int i = 0; i < triangle.size() - 1; i++) {
			for (int j = 0; j <= i; j++) {
				int a, b;if(i==0 && j==0){
					a = first + ((Browse) triangle.get(i + 1)).get(j);
					b = first + ((Browse) triangle.get(i + 1)).get(j + 1);
					}
				else{
					a = temp[j] + ((Browse) triangle.get(i + 1)).get(j);
					b = temp[j] + ((Browse) triangle.get(i + 1)).get(j + 1);
					}
				temp[j] = Math.min(a, temp[j]);
				temp[j + 1] = Math.min(b, temp[j + 1]);
				}
			}
		for (int e : temp) {
			if (e < minTotal)minTotal = e;
			}
		return minTotal;
		}
	


