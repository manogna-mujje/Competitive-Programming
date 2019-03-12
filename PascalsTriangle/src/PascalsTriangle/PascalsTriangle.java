package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		List<List<Integer>> result = getPascal(5);
		System.out.println(result);
	}

	private static List<List<Integer>> getPascal(int i) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		int rowNum = 1, colNum = 1;
		
		while(rowNum <= i) {
			List<Integer> row = new ArrayList<Integer>();
			triangle.add(getPascalRow(i, rowNum, colNum, row));
			rowNum++;
			colNum = 1;
		}
		return triangle;
	}

	private static List<Integer> getPascalRow(int i, int rowNum, int colNum, List<Integer> row) {
		while(colNum <= rowNum) {
			row.add(getPascalNum(rowNum, colNum));
			colNum++;
		}
		return row;
	}

	private static int getPascalNum(int i, int j) {
		if(i==j || j==1)
			return 1;
		return getPascalNum(i-1, j-1) + getPascalNum(i-1, j);
	}

}
