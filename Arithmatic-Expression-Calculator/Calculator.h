/*
 * Calculator.h
 *
 *  Created on: Oct 30, 2017
 *      Author: Manogna Sindhusha Mujje
 */

#include <string>
#include <fstream>

using namespace std;

#ifndef CALCULATOR_H_
#define CALCULATOR_H_

class Calculator
{
public:

	/**
	 * Constructor
	 */
	Calculator();

	/**
	 * Destructor
	 */
	~Calculator();


	/**
	 * Function to evaluate the value of expression
	 * @param str string form of factor
	 * @return Evaluated value from the term
	 */
	double expression(string str);

	/**
	 * Function to evaluate the value of term
	 * @param str string form of factor
	 * @return Evaluated value from the term
	 */
	double term(string str);

	/**
	 * Function to evaluate the value of term
	 * @param str string form of factor
	 * @return Evaluated value from the factor
	 */
	double factor(string str);

	/**
	 * Helper function to keep track of brackets
	 * @param str string starting from the brackets
	 * @param position starting position of the iteration
	 * @param openBrackets count of brackets opened so far
	 * @param int final position after iterating through brackets
	 */
	int Brackets(string str, int position, int openBrackets);


	/**
	 * Helper function to validate the input
	 * @param input string
	 * @param No returns expected
	 */
	void input(string str);

};


#endif /* CALCULATOR_H_ */
