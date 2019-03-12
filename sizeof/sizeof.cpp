/*
 * sizeof.cpp
 *
 *  Created on: Sep 19, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

void fun(int arr[]);


void fun(int arr[])
{
	int min = 1;
	for (int i=7; i>=0; i--){
		arr[i] = min++;
		}
}

int main(){

	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

	cout << "Initial Array: " << endl;
	for (int i=0; i<8; i++){
		cout << arr[i] << " ";
	}

	fun(arr);

	cout << endl << "Modified Array: " << endl;
		for (int i=0; i<8; i++){
				cout << arr[i] << " ";
			}
	return 0;
}


