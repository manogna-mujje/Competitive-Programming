/*
 * InsertionSort.cpp
 *
 *  Created on: Sep 17, 2018
 *      Author: Mango
 */


#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
	vector<int> alist;
	alist.push_back(10);
	alist.push_back(4);
	alist.push_back(8);
	alist.push_back(6);
	alist.push_back(3);
	alist.push_back(5);

	cout << "Unsorted Order:" << endl;

	for (int i = 0; i < alist.size(); i++) {
		cout << alist[i] << " ";
	}
	cout << endl;

	for (int i = 1; i < alist.size(); i++){
		int key = alist[i];
		int j = i-1;
		while(j >= 0 && alist[j] > key) {
			alist[j+1] = alist[j];
			j = j - 1;
		}
		alist[j+1] = key;
	}

	cout << "Sorted Order:" << endl;
	for (int i = 0; i < alist.size(); i++) {
			cout << alist[i] << " ";
		}
		cout << endl;

	return 0;

}
