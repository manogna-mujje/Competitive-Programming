/*
 * binarySearch.cpp
 *
 *  Created on: Sep 20, 2018
 *      Author: Mango
 */

#include <iostream>
#include <vector>

using namespace std;

int binarySearch(int key, vector<int> v, int low, int high);

int main(){
	vector<int> v;
	v.push_back(4);
	v.push_back(8);
	v.push_back(10);
	v.push_back(12);
	int ans = binarySearch(10, v, 0, 3);
	cout << "Result: " << ans << endl;
}

int binarySearch(int key, vector<int> v, int low, int high) {
	if(low <= high){
		int mid = (low + high)/2;
		cout << "mid:" << mid <<  endl;
		cout << "v[mid]:" << v[mid] <<  endl;
		cout << "Key:" << key <<  endl;
		if(v[mid] == key){
			cout << "Key Found!!!!!!!!!!" << endl;
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


