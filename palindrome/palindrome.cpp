/*
 * palindrome.cpp
 *
 *  Created on: Sep 23, 2018
 *      Author: Mango
 */

#include <iostream>
#include <map>

using namespace std;

bool palindrome(string str);

int main(){
	string str = "Tact ca";
	cout << "Answer is: " << palindrome(str) << endl;
	return 0;
}

bool palindrome(string str){
	int check = 0;
	map<char, int> countMap;
	for(int i=0; i<str.length(); i++){
		if(str[i] > 96 && str[i] < 123){
			str[i] = str[i]-32;
		}
		map<char, int>::iterator it = countMap.find(str[i]);
		if(it != countMap.end()){
			it->second++;
		} else {
			countMap.insert(pair<char, int> (str[i],1));
		}
	}

	for(map<char, int>::iterator it = countMap.begin(); it != countMap.end(); ++it){
		if(it->second % 2 == 1){
			check++;
		}
	}
	return (check < 2);
}


