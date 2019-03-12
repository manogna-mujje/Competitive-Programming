/*
 * isUnique.cpp
 *
 *  Created on: Sep 22, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

bool isUnique(string s);

int main(){
	string str = "Mangoose";
	bool ans = isUnique(str);
	cout << "Is it an unique string? " << ans << endl;;
	return 0;
}

bool isUnique(string s){
	bool char_set[128] = { false };
	for(int i=0; i<s.length(); i++){
		int val = s[i];
		cout << "Value: " << val << endl;
		cout << "Char Set Value: " << char_set[val] << endl;
		if(char_set[val]){
			return false;
		}
		char_set[val] = true;
	}
	return true;
}
