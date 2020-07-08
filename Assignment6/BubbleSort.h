// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

#include "Sort.h"
#include <vector>

#ifndef _BUBBLESORT_H
#define _BUBBLESORT_H

class BubbleSort : public Sort
{
	private:
	
	public:
		//Default Constructor
		BubbleSort();
		//De-constructor
		~BubbleSort();
		
		virtual void sort(std::vector<int> vector);
		
};

#endif