package SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3};
		int [] arr1 = {4, 5, 6};
		int [] arr2 = {7, 8, 9};
		int [][] array = {arr, arr1, arr2};
		System.out.println(findSpiral(array));
	}

	private static List<Integer> findSpiral(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		if(matrix.length == 0) return res;
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0; i<row; i++) {
			if(i%2 == 0) {
				for(int j=0; j<col; j++) {
					res.add(matrix[i][j]);
				}
			} else {
				for(int j=col-1; j>=0; j--) {
					res.add(matrix[i][j]);
				}
			}
		}
		return res;
	}
}
