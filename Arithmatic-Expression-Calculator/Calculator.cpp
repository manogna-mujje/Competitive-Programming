/*
 * Calculator.cpp
 *
 *  Created on: Oct 30, 2017
 *      Author: Manogna Sindhusha Mujje
 */

#include "Calculator.h"
#include <iostream>
#include <string>
#include <math.h>

using namespace std;

Calculator::Calculator()
{
}

Calculator::~Calculator()
{
}

double Calculator::expression(string str)
{
	// Variables to store operands on either side of '+' and '-'
	double num1, num2, result;
	bool multipleTerms = false;
	string lhs, rhs;
	int i = 0;
	while (i < str.size())
	{
		//If there are brackets implement brackets function
		if (str[i] == '(')
		{
			i = Brackets(str,i+1,1);
		}
		// When '+' or '-' is found determine the left and rigt operands
		//        and forward each to the term for further evaluation.

		if(str[i] == '+' || str[i] == '-')
		{
			if (str[i-1] == ' ' && str[i+1] == ' ')
			{
				multipleTerms = true;

				lhs = (str.substr(0, i));
				num1 = term(lhs);

				rhs = (str.substr(i+1));
				num2 = term(rhs);

				switch(str[i])
				{
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				}
				break;
			}
		}
		i++;
	}

	//When the expression is a single term
	if(multipleTerms == false)
	{
		result = term(str);
	}
	return result;
}

//Helper Function to read past the term when there are brackets

int Calculator::Brackets(string str, int position, int openBrackets)
{
	int i = position, closeBrackets = 0;
	while (closeBrackets != openBrackets)
	{
		if (str[i] == '(')
		{
			openBrackets++;
			Brackets(str, i+1, openBrackets);
		}
		else if(str[i] == ')')
		{
			closeBrackets++;
		}
		i++;
	}
	return i;
}


double Calculator::term(string str)
{
	bool multipleFactors=false;
	double num1=0.0, num2=0.0, result=0.0;
	int i = 0;

	while (i < str.size())
	{
		//When there are multiple terms
		if (str[i] == '(')
		{
			i = Brackets(str,i+1,1);
		}

		// When '*' or '/' is found determine the left and rigt operands
		//    and forward each to the factor for further evaluation.

		if(str[i] == '*' || str[i] == '/')
		{
			multipleFactors=true;
			string lhs = (str.substr(0, i));
			num1 = factor(lhs);
			string rhs = (str.substr(i+1));
			num2 = factor(rhs);

			switch(str[i])
			{
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
		}
		i++;
	}

	if (multipleFactors==false)
	{
		result = factor(str);
	}
	return result;
}

double Calculator::factor(string str)
{
	double number;
	bool num = true;
	int startPoint = 0, numLength = 0;

	int i = 0, size;
	size = str.size();
	while (i < size)
	{
		// Determine whether the argument is a number or expression
		if (str[i] == '+' || str[i] == '-' || str[i] == '*' || str[i] == '/')
		{
			if (str[i-1] == ' ' && str[i+1] == ' ')
			{
				num = false;
			}
		}
		//Pick the actual numbers avoiding all special characters
		if(str[i] != '(' && str[i] != ')' && str[i] != '*' && str[i] != '/' && str[i] != ' ' )
		{
			if(numLength == 0)
			{
				startPoint = i;
			}
			numLength++;
		}
		i++;
	}

// If the argument is a number convert it to double, else forward it to expression
	if (num == true)
	{
		number = stod(str.substr(startPoint, numLength));
	}
	else
	{
		number = expression(str.substr(1,size-2));
	}
	return number;
}

void Calculator::input(string str)
{
	cout << str << endl;
	string lhs, rhs;

	//Omit '=' operator at the end
	if (str.size() != 1)
	{
		str = str.substr(0, str.size()-1);
	}
	else
	{
		if (str == ".")
		{
			cout << "Done!" << endl;
			return;
		}
	}
// Read the output to check for errors
	try
	{
		int i = 0, openBrackets = 0, closeBrackets = 0;
		while(i < str.size())
		{
			switch(str[i])
			{
			case '+':
				break;
			case '-':
				break;
			case '*':
				break;
			case '/':
				break;
			case '(':
				openBrackets++;
				break;
			case ')':
				closeBrackets++;
				break;
			case '0':
				break;
			case '1':
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				break;
			case '5':
				break;
			case '6':
				break;
			case '7':
				break;
			case '8':
				break;
			case '9':
				break;
			case '.':
				break;
			case 'e':
				break;
			case 'E':
				break;
			case ' ':
				break;
			default:
				throw (str[i]);
			}
			i++;
		}
		if (openBrackets < closeBrackets)
		{
			throw (')');
		}
		else if (openBrackets > closeBrackets)
		{
			throw (0);
		}
		double output;
		output = expression(str);
		if(isinf(output) != 0)
		{
			throw(-1);
		}
		cout << output << endl;
	}
	catch(char ch)
	{
		cout << "***** Unexpected " << ch << endl;
	}
	catch (int i)
	{
		if (i == 0)
		{
			cout << "***** Missing )" << endl;
		}
		else if (i == -1)
		{
			cout << "***** Division by zero" << endl;
		}
	}
	return;
}
