/*
 * zeroMatrix.cpp
 *
 *  Created on: Oct 6, 2018
 *      Author: Mango
 */

#include <iostream>
#define N 4
using namespace std;

void zeroMatrix(int arr[][N]);
void displayMatrix(int mat[][N]);
void nullifyRow(int arr[][N], int i);
void nullifyCol(int arr[][N], int i);

int main(){
	int mat[N][N] =
		{
			{1, 2, 3, 0},
			{5, 6, 7, 8},
			{9, 10, 0, 12},
			{13, 14, 15, 16}
		};
	zeroMatrix(mat);
	displayMatrix(mat);
	return 0;
}

// Function to print the matrix
void displayMatrix(int mat[N][N])
{
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
			printf("%2d ", mat[i][j]);

		printf("\n");
	}
	printf("\n");
}

// Function to nullify a row
void nullifyRow(int arr[][N], int i) {
	for(int j=0; j<N; j++){
		arr[i][j] = 0;
	}
}

// Function to nullify a column
void nullifyCol(int arr[][N], int i) {
	for(int j=0; j<N; j++){
		arr[j][i] = 0;
	}
}

// Function to make a zero matrix
void zeroMatrix(int mat[][N]){
	bool row[N] = { false };
	bool col[N] = { false };
	for(int i=0; i<N; i++){
		for(int j=0; j<N; j++){
			if(mat[i][j] == 0){
				row[i] = true;
				col[j] = true;
			}
		}
	}
	int size = sizeof(row)/sizeof(row[0]);
	for(int i=0; i< size; i++){
		if(row[i]){
			nullifyRow(mat, i);
		}
	}

	for(int i=0; i< size; i++){
			if(col[i]){
				nullifyCol(mat, i);
			}
		}
}

