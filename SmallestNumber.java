package week1.day2;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] array= {23,45,67,32,89,22};
		Arrays.sort(array);
		for(int i=0;i<array.length-5;i++) {
			System.out.println(array[i]);
		}
	}

}
