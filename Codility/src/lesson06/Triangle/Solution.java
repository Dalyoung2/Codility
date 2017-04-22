package lesson06.Triangle;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[]{10, 2, 5, 1, 8, 20}));
		System.out.println(s.solution(new int[]{-1, 0, 1, 2}));
		System.out.println(s.solution(new int[]{10, -10, -10, 9}));
		System.out.println(s.solution(new int[]{-10, -9, -3, -2}));
	}
	// TODO
	public int solution(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
		for(int i = 0; i < A.length - 2; i++){
			if((long)A[i] + (long)A[i+1] > (long)A[i+2]){
				return 1;
			}
		}
		
		return 0;
    }
	
}
