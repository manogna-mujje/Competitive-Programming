/*
 * compressedString.cpp
 *
 *  Created on: Sep 23, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

string compressedString(string str);

int main(){
	string str = "abcd";
	cout << "Answer: " << compressedString(str) << endl;
	return 0;
}

string compressedString(string str) {
	char key = str[0];
	string shortString = "";
	int count = 0;
	for(int i=0; i<str.length(); i++){
		if (str[i] == key) {
			count++;
		} else {
			shortString = shortString + string(1, key) + to_string(count);
			count = 1;
			key = str[i];
		}
	}
	shortString = shortString + string(1, key) + to_string(count);
	if(shortString.length() > str.length()){
		return str;
	}
	return shortString;
}


