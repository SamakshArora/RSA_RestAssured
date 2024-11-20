package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Shifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0,0,1,0,1,0,0,1};
		// System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
			//		System.out.println("--" + arr[j] + "==>" + arr[j + 1] + "==" + j);
					// i=-1;
//
//
				}
			//	System.out.println("--" + arr[j] + "==>" + arr[j + 1] + "==" + j);

			}
//			if (arr[i] == 1) {
//
//			}

		}
		System.out.println(Arrays.toString(arr));

	}

}
