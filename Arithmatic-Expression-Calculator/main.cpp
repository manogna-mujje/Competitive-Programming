/*
 * main.cpp
 *
 *  Created on: Oct 31, 2017
 *      Author: Mango
 */

#include "Calculator.h"
#include <iostream>
#include <vector>

using namespace std;

int main()
{
	Calculator data;

	//Store all the input strings in a vector
	vector <string> inputVector;
	inputVector.push_back("42 =");
	inputVector.push_back("2*(42 - 42e-1) =");
	inputVector.push_back("12/(5.5*(17 + 0.00314E+3)) =");
	inputVector.push_back("65%2 =");
	inputVector.push_back("12/(5.5*(17 + 0.00314E+3) =");
	inputVector.push_back("(((((5))))) =");
	inputVector.push_back("(5)) + 2 =");
	inputVector.push_back("5/(6 - 2*3) =");
	inputVector.push_back("(3*(5 - 1.2)) + ((8.5 + 3.5)/2)  =");
	inputVector.push_back(".");

	int i = -1;
	do
	{
		i++;
		cout << "Expression? ";
		data.input(inputVector[i]);
		cout << endl;
	} while (inputVector[i]!= ".");
}
