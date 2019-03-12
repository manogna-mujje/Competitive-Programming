/*
 * cwRotation.cpp
 *
 *  Created on: Oct 6, 2018
 *      Author: Mango
 */

/*
 * rotateMatrix.cpp
 *
 *  Created on: Oct 6, 2018
 *      Author: Mango
 */



// C++ program to rotate a matrix by 90 degrees
#include <iostream>
#define N 4
using namespace std;

void displayMatrix(int mat[N][N]);

// An Inplace function to rotate a N x N matrix
// by 90 degrees in anti-clockwise direction
void rotateMatrix(int mat[][N])
{
	// Consider all squares one by one
	for (int i = 0; i < N / 2; i++)
	{
		// Consider elements in group of 4 in
		// current square
		int last = N-1-i;
		for (int j = i; j < last; j++)
		{
			// store current cell in temp variable
			int temp = mat[i][j];

			// move values from right to top
			mat[i][j] = mat[last-j+i][i];

			// move values from bottom to right
			mat[last-j+i][i] = mat[last][last-j+i];

			// move values from left to bottom
			mat[last][last-j+i] = mat[j][last];

			// assign temp to left
			mat[j][last] = temp;
		}
	}
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


/* Driver program to test above functions */
int main()
{
	// Test Case 1
	int mat[N][N] =
	{
		{1, 2, 3, 4},
		{5, 6, 7, 8},
		{9, 10, 11, 12},
		{13, 14, 15, 16}
	};


	// Tese Case 2
//	 int mat[N][N] = {
//						{1, 2, 3},
//						{4, 5, 6},
//						{7, 8, 9}
//					};


	// Tese Case 3
//	int mat[N][N] = {
//					{1, 2},
//					{4, 5}
//				};

	//displayMatrix(mat);

	rotateMatrix(mat);

	// Print rotated matrix
	displayMatrix(mat);

	return 0;
}




