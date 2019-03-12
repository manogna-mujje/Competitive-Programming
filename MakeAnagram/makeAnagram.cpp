/*
 * makeAnagram.cpp
 *
 *  Created on: Sep 25, 2018
 *      Author: Mango
 */

#include <iostream>

using namespace std;

// Complete the makeAnagram function below.
int makeAnagram(string a, string b) {
    int Aarr[128] = { 0 }, Barr[128] = { 0 };
        for(int i=0; i<a.length(); i++){
            Aarr[(int)a[i]]++;
        }
		 for(int i=0; i<b.length(); i++){
			 Barr[(int)b[i]]++;
		}

        int j = 0, count = 0;
        while(j < 128){
               count = count+abs(Aarr[j] - Barr[j]);
            j++;
        }
        return count;
}

int main(){
	string str1 = "fcrxzwscanmligyxyvym";
	string str2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
	cout << "Answer: " << endl << makeAnagram(str1, str2) << endl;
	return 0;
}



