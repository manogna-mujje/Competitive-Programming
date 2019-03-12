package PascalsRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Using Recursion with Memoization
 * @author Mango
 *
 */
public class PascalsRow {

	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));
	}

	private static List<Integer> getRow(int rowIndex) {
		HashMap<String, Integer> memo = new HashMap<String, Integer>();
		List<Integer> row = new ArrayList<Integer>();
		int rowNum = 0, colNum = 0;
		while(rowNum <= rowIndex) {
			while(colNum <= rowNum) {
				if(rowNum == rowIndex) {
					row.add(getNum(rowNum, colNum, memo));
				} else {
					getNum(rowNum, colNum, memo);
				}
				colNum++;
			}
			rowNum++;
			colNum = 0;
		}
		return row;
	}

	private static int getNum(int rowNum, int colNum, HashMap<String, Integer> memo) {
		String key = String.valueOf(rowNum) + String.valueOf(colNum);
		if(colNum == 0 || colNum == rowNum) {
			memo.put(key, 1);
			return 1;
		}
		int value = memo.get(String.valueOf(rowNum-1) + String.valueOf(colNum-1)) + memo.get(String.valueOf(rowNum-1) + String.valueOf(colNum));
		memo.put(key, value);
		return value;
	}
}
