/*
 * oneaway.cpp
 *
 *  Created on: Sep 23, 2018
 *      Author: Mango
 */

#include <iostream>
#include <map>

using namespace std;

bool oneaway(string str1, string str2);
bool onereplacement(string str1, string str2);
bool oneinsert(string str1, string str2);

int main(){
	string str1 = "pale", str2 = "bale";
	cout << "Answer: " << oneaway(str1, str2) << endl;
	return 0;
}

bool oneaway(string str1, string str2){
	if(str1.length() == str2.length()){
		return onereplacement(str1, str2);
	} else if(str1.length() == str2.length()+1){
		return oneinsert(str1, str2);
	} else if(str1.length()+1 == str2.length()) {
		return oneinsert(str2, str1);
	}
	return false;
}

bool onereplacement(string str1, string str2) {
	int count = 0;
	for (int i=0; i< str1.length(); i++){
		if(str1[i] != str2[i]){
			count++;
		}
	}
	return (count == 1);
}

bool oneinsert(string str1, string str2) {
	int j, count = 0;
	for(int i=0; i<str1.length(); i++){
		if(count < 1 ){
			j=i;
		} else {
			j=i-1;
		}
		if(str1[i] != str2[j]){
			count++;
		}
	}
	return (count==1);
}
