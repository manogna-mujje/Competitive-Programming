/*
 * merge.cpp
 *
 *  Created on: Sep 17, 2018
 *      Author: Mango
 *
 *      O(n) = n log n
 */


#include <iostream>

using namespace std;

void merge(int A[], int i, int j, int k);

void mergeSort(int [], int a, int b);

int main(){
	int A[] = { 10, 5, 8, 6, 1, 3};
	int Asize = 6;

	cout << "Unsorted Order:" << endl;
	for (int i = 0; i < Asize; i++) {
		cout << A[i] << " ";
	}
	cout << endl;

	mergeSort(A, 0, 5);

	cout << "Sorted Order:" << endl;
	for (int i = 0; i < Asize; i++) {
		cout << A[i] << " ";
	}
	cout << endl;

	return 0;
}

void merge(int A[], int p, int q, int r) {

	// Splitting the two sorted sets in two separate arrays
	int n1, n2;
	n1 = q - p + 1;
	n2 = r - q;

	int L[n1], R[n2];

	for(int i = 0; i < n1; i++) {
		L[i] = A[p+i];
	}

	for(int i = 0; i < n2; i++) {
		R[i] = A[q+1+i];
	}

//	L[n1] = numeric_limits<int>::max();
//	R[n2] = numeric_limits<int>::max();

	int i=0;
	int j=0;

	// Picking the top card from each set and comparing
	for (int k = p; k < r+1; k++){
		if(L[i] <= R[j]){
			A[k] = L[i];
			i= i+1;
		}
		else {
			A[k] = R[j];
			j= j+1;
		}
	}
}

void mergeSort(int A[], int p, int r) {
	if(p < r) {

		// Dividing cards into two sets
		int q = p+(r-p)/2;

		// Recursively calling each set for merge sort
		mergeSort(A, p, q);
		mergeSort(A, q+1, r);

		//Merging the two sorted sets
		merge(A, p, q, r);
	}
}

