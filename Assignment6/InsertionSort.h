// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

#include "Sort.h"
#include <vector>

#ifndef _INSERTIONSORT_H
#define _INSERTIONSORT_H

class InsertionSort: public Sort
{
	private:
	
	public:
		//Default Constructor
		InsertionSort();
		//De-constructor
		~InsertionSort();
		
		virtual void sort(std::vector<int> vector);
		
};

#endif