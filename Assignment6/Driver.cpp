// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

#include "Sort.h"
#include "InsertionSort.h"
#include "BubbleSort.h"
#include <iostream>
#include <sstream>
#include <fstream>
#include <string>
#include <vector>

int main()
{
	//Classes stored on Heap
	Sort * bubble=new BubbleSort();
	Sort * insertion=new InsertionSort();
	std::string stringNumber="";
	int number=0;
	std::stringstream ss;
	//used to store menu answers
	char answer='a';
	char answer2='a';
	bool keepGoing=true;
	std::vector<int> numberList;
	while(keepGoing){
		std::cout << "1. Load Data (From File)" << std::endl;
		std::cout << "2. Exit Program" << std::endl;
		std::cout << "Please enter your selection: ";
		std::cin >> answer;
		if(answer=='1'){
			std::ifstream inputFile("data.txt");
			if(inputFile.is_open())
			{
				ss.clear();
				ss.str("");
				std::string line;
				std::getline(inputFile, line);
				ss.str(line);
				//This is to loop the length of the line to get each number off
				for(int i=0; i<50; i++)
				{
					//std::cout <<"Unsorted Vector: " << line << std::endl;
					std::getline(ss, stringNumber, ',');
					ss.clear();
					//get contents of string number and convert it to int and push onto vector
					std::stringstream tempString(stringNumber);
					tempString >> number;
					numberList.push_back(number);
				}
			inputFile.close();
				
			}
			else
			{
				std::cout << "Unable to open file" << std::endl;
				keepGoing=false;
			}
			std::cout << "Unsorted Vector: ";
			//Print vector as is
			for(int i=0; i<50; i++)
			{
				std::cout << numberList[i] << ",";
			}
			std::cout << "" << std::endl;
			std::cout << "1. Insertion Sort" << std::endl;
			std::cout << "2. Bubble Sort" << std::endl;
			std::cout << "3. Exit Program" << std::endl;
			std::cout << "Please enter your selection: ";
			std::cin >> answer2;
			if(answer2=='1'){
				std::cout << "Insertion Sort: ";
				//Vector is printed inside of function
				insertion->sort(numberList);
				keepGoing=true;
			}
			else if(answer2=='2'){
				std::cout << "Bubble Sort: ";
				//Vector is printed inside of function
				bubble->sort(numberList);
				keepGoing=true;
			}
			else if(answer2=='3'){
				std::cout << "Goodbye!" << std::endl;
				delete bubble;
				delete insertion;
				keepGoing=false;
				return 0;
			}
		}
		else if(answer=='2'){
			std::cout << "Goodbye!" << std::endl;
			delete bubble;
			delete insertion;
			keepGoing=false;
			return 0;
		}
	}
	return 0;
}