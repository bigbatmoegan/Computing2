// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include "InsertionSort.h"
#include <vector>
#include <iostream>

InsertionSort::InsertionSort()
{
	
}

InsertionSort::~InsertionSort()
{
	
}

void InsertionSort::sort(std::vector<int> vector)
{
	int x=0;
	int temp=0;
	for(int i=0; i<50; i++)
	{
		temp=vector[i];
		x=i-1;
		while(x>=0&&vector[x]<temp)
		{
			vector[x+1]=vector[x];
			x=x-1;
		}
		vector[x+1]=temp;
	}
	



	//print out sorted vector
	for(int i=0; i<50; i++)
	{
		if(vector[i]==6)
		{
			std::cout << vector[i];
		}
		else
		{
			std::cout << vector[i] << ",";
		}
	}
	std::cout << "" << std::endl;
}