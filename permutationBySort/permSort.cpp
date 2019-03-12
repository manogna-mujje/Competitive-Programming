/*
 * permSort.cpp
 *
 *  Created on: Sep 22, 2018
 *      Author: Mango
 */

#include <iostream>
#include <vector>

using namespace std;

bool permutation(string s1, string s2);

int main(){
	string str1 = "agMno";
		string str2 = "mango";
		cout << "Result: " << permutation(str1, str2) << endl;
		return 0;
	return 0;
}

bool permutation(string str1, string str2){
	if(str1.length() != str2.length()){
			return false;
		}
	vector<char> vec1 (str1.begin(), str1.end());
	vec1.push_back('\0');
	vector<char> vec2 (str2.begin(), str2.end());
	vec2.push_back('\0');
	sort(vec1.begin(), vec1.end());
	sort(vec2.begin(), vec2.end());
	for(int i=0; i<str1.length(); i++){
		if( vec1[i] != vec2[i]){
			return false;
		}
	}
	return true;
}

