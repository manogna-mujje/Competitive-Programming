package Elections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Elections {

	public static void main(String[] args) {
		String [] arr = {
				"10",
				"Victor",
				"Veronica",
				"Ryan",
				"Dave",
				"Maria",
				"Maria",
				"Farah",
				"Farah",
				"Ryan",
				"Veronica"
		};
		String winner = electionWinner(arr);
		System.out.println(winner);
	}
	
	
	//ToDo: This sort is performing only first letter check
	//ToDo: Sort has a bug
	private static void sort(ArrayList<String> arr) {
		int n = arr.size();
		System.out.println("n: " + n);
		for(int i=1; i<n; i++) {
			System.out.println(i);
			String keyword = arr.get(i);
			char key = arr.get(i).charAt(0);
			int j = i-1;
			while(j >=0 && (arr.get(j).charAt(0) > key)) {
				System.out.println("New char: " + arr.get(j).charAt(0));
				System.out.println("Key: " + key);
				arr.add(j+1, arr.get(j));
				j--;
			}
			arr.add(j+1, keyword);
		}
		
	}

	static String electionWinner(String[] votes) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int numVotes = votes.length;
		for(int i=0; i<numVotes; i++) {
			if(!hm.containsKey(votes[i])) {
				hm.put(votes[i], 1);
			} else {
				hm.put(votes[i], hm.get(votes[i])+1);
			}
		}
		
		// Check if this buffering can be done during insertion
		int max = 0;
		ArrayList<String> buffer = new ArrayList<String>();
		boolean isBufferEmpty = true;
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				buffer.clear();
				buffer.add(entry.getKey());
				isBufferEmpty = false;
			} else if (entry.getValue() == max && !isBufferEmpty) {
				buffer.add(entry.getKey());
			}
		}
		
		System.out.println("HashMap: " + hm);
		
		System.out.println("Buffer: " + buffer);
		if(buffer.size() == 1) {
			System.out.println("fsfsbs");
			return buffer.get(0);
		} else if(buffer.size() > 1) {
			System.out.println("werdtrdf");
			sort(buffer);
			return buffer.get(buffer.size()-1);
		} else {
			return null;
		}
		
	}
}
