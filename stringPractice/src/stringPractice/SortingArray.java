package stringPractice;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {

		int[] arr = {0,2,0,2,1,1};
		int[] sort = sort(arr);
		System.out.println(Arrays.toString(sort));
	}

	private static  int[] sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tep = arr[i];
					arr[i]= arr[j];
					arr[j]= tep;
				}
			}
		}
		return arr;
	}
}
