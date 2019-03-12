/*
 * twosum.cpp
 *
 *  Created on: Sep 20, 2018
 *      Author: Mango
 *
 *  Complexity: O(nlogn)
 */


#include <iostream>
#include <vector>

using namespace std;

bool twosum(vector<int> v, int x);
int binarySearch(int key, vector<int> v, int low, int high);

int main(){
	vector<int> v;
	v.push_back(4);
	v.push_back(7);
	v.push_back(8);
	v.push_back(10);
	int sum = 18;
	cout << "Result: " << twosum(v, sum);
}

bool twosum(vector<int> v, int x) {
	int n = v.size();
	int i = n-1;
	while(i > 0) {
		int key1 = v[i];
		int key2 = x - key1;
		cout << "Key1: " << key1 << endl;
		cout << "Key2: " << key2 << endl;
		if (binarySearch(key2, v, 0, i-1) != -1){
			return true;
		}
		i--;
	}
	return false;
}

int binarySearch(int key, vector<int> v, int low, int high) {
	if(low <= high){
		int mid = (low + high)/2;
		if(v[mid] == key){
			return mid;
		}
		else if(key > v[mid]){
			return binarySearch(key, v, mid+1, high);
		}
		else {
			return binarySearch(key, v, low, mid-1);
		}
	}
	return -1;
}
