/*
 * InsertionSort.cpp
 *
 *  Created on: Sep 20, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

void insertionSort(int arr[], size_t n);

void insertionSort(int arr[], size_t n) {
	if(n == 1) {
		return;
	}
	int subArray[n-1];
	int key = arr[n-1];
	for(int i = 0; i< n-1; i++) {
		subArray[i] = arr[i];
	}
	insertionSort(subArray, n-1);
	for(int i = 0; i < n-1; i++){
		arr[i] = subArray[i];
	}
	int i = n-2;
	while (i >= 0 && arr[i] > key) {
		arr[i+1] = arr[i];
		i--;
	}
	arr[i+1] = key;
}

int main(){
	int A[] = { 10, 5, 8, 6, 1, 3};
	int Asize = 6;

	cout << "Unsorted Order:" << endl;
	for (int i = 0; i < Asize; i++) {
		cout << A[i] << " ";
	}
	cout << endl;

	insertionSort(A, 6);

	cout << "Sorted Order:" << endl;
	for (int i = 0; i < Asize; i++) {
		cout << A[i] << " ";
	}
	cout << endl;

	return 0;
}

