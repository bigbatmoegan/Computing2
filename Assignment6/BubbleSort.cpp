// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include "BubbleSort.h"
#include <vector>
#include <iostream>

BubbleSort::BubbleSort()
{
	
}

BubbleSort::~BubbleSort()
{
	
}

void BubbleSort::sort(std::vector<int> vector)
{
	int x, y, temp;
	for(x=0; x<50; x++)
	{
		for(y=0; y<49; y++)
		{
			if(vector[y]<vector[y+1])
			{
				temp=vector[y];
				vector[y]=vector[y+1];
				vector[y+1]=temp;
			}
		}
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