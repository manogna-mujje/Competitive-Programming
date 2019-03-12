/*
 * permutation.cpp
 *
 *  Created on: Sep 22, 2018
 *      Author: Mango
 */


#include <iostream>
#include <typeinfo>
#include <map>

using namespace std;

bool permutation(string s1, string s2);

int main(){
	string str1 = "agMno";
	string str2 = "lango";
	cout << "Result: " << permutation(str1, str2) << endl;
	return 0;
}

bool permutation(string str1, string str2){
	if(str1.length() != str2.length()){
		return false;
	}
	map<char, int> helpMap;
	int count = 0;
	// Inserting all the elements in to the map
	for(int i = 0; i<str1.length(); i++) {
		helpMap.insert(pair<char, int>(str1[i],count+1));
		}
	// Checking each element and decreasing the corresponding value
	try {
		for(int i = 0; i<str2.length(); i++) {
			int value = helpMap.at(str2[i]);
			map<char, int>::iterator it = helpMap.find(str2[i]);
					if (it != helpMap.end())
					    it->second = value-1;
					if(helpMap[i] != 0) {
									return false;
								}
		}

	} catch (exception &e){
		return false;
	}
	return true;
}
