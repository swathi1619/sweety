package swathi;

public class ManipulateArray {
	// Manipulate original array
	public static int removeDuplicatesNaive(int[] A) {
		if (A.length < 2)return A.length;
		int j = 0;int i = 1;
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
				}
			else {
				j++;
				A[j] = A[i];
						i++;
						}
			}
		return j + 1;
		}
}