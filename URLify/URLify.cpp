/*
 * URLify.cpp
 *
 *  Created on: Sep 22, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

string URLify(string str, int n);

int main(){
	string s = "Mr John Smith    ";
	cout << "Final URL is: " << URLify(s, 13);
	return 0;
}

string URLify(string str, int n){
	int len = str.length();
	int j = n-1;
	for(int i=len-1; i>=0; i--){
		if(str[j] == ' ') {
			str[i] = '0';
			str[i-1] = '2';
			str[i-2] = '%';
			i=i-2;
		} else {
			str[i] = str[j];
		}
		j--;
	}
	return str;
}
