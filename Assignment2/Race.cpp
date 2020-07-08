// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include <iostream>
#include <stdlib.h>
#include <ctime>
#include <iomanip>

#define RACE_LENGTH 50

void advanceTortoise(int* ptrTortoise);
void advanceHare(int* ptrHare);
void printPosition(int* ptrTortoise, int* ptrHare);


int main()
{
	srand(time(NULL));
	int tortoise;
	tortoise=0;
	int hare;
	hare=0;
	int* ptrTortoise;
	ptrTortoise=&tortoise;
	int* ptrHare;
	ptrHare=&hare;
	std::cout << "Welcome to CSCI 240s Tortoise vs Hare race!" << std::endl;
	while((tortoise<RACE_LENGTH)&&(hare<RACE_LENGTH))
	{
		advanceHare(&hare);
		advanceTortoise(&tortoise);
		if(*ptrTortoise==*ptrHare){
		    *ptrTortoise=*ptrTortoise-1;
		}
		printPosition(&tortoise, &hare);
	}
	if(hare==RACE_LENGTH)
	{
		std::cout << "The Hare wins! His speed could not be bested!" << std::endl;
		return 0;
	}
	if(tortoise==RACE_LENGTH)
	{
		std::cout << "The Tortoise wins! Slow ans steady wins the race!" << std::endl;
		return 0;
	}
	
}

void advanceTortoise(int* ptrTortoise)
{
	int rollTortoise[10]={1,1,1,1,1,1,2,3,4,4};
	int roll;
	int rollResult;
	roll=rand()%10;
	rollResult=rollTortoise[roll];
	if(rollResult==1){
		*ptrTortoise=*ptrTortoise+1;
	}	
	if(rollResult==2){
	    *ptrTortoise=*ptrTortoise+2;
	}
	if(rollResult==3){
		*ptrTortoise=*ptrTortoise+3;
	}
	if(rollResult==4){
		*ptrTortoise=*ptrTortoise;
	}
	if(*ptrTortoise>RACE_LENGTH){
	    *ptrTortoise=RACE_LENGTH;
	}	
}

void advanceHare(int* ptrHare)
{
	int rollHare[10]={1,2,2,2,3,3,3,5,6,6};
	int roll;
	int rollResult;
	roll=rand()%10;
	rollResult=rollHare[roll];
	if(rollResult==1){
	    *ptrHare=*ptrHare+1;
	}
	if(rollResult==2){
	    *ptrHare=*ptrHare+2;
	}
	if(rollResult==3){
	    *ptrHare=*ptrHare+3;
	}
	if(rollResult==5){
	    *ptrHare=*ptrHare-2;
	}
	if(rollResult==6){
	    *ptrHare=*ptrHare-3;
	}
	if(*ptrHare>RACE_LENGTH){
	    *ptrHare=RACE_LENGTH;
	}
}
void printPosition(int* ptrTortoise, int* ptrHare){
	
	//Inserted to fix an error in spacing when both are equal to zero
	if(*ptrHare<=0 && *ptrTortoise==0){
        std::cout << "H" << "T" << std::setw(RACE_LENGTH-1) << "|" << std::endl;
		*ptrHare==0;
		return;
    }
	//To make sure that the Hare never goes behind the startig line
	if (*ptrHare<=0){
	    *ptrHare=0;
		std::cout << std::setw(*ptrHare) << "H" << std::setw(*ptrTortoise-*ptrHare) << "T" << std::setw(RACE_LENGTH-*ptrTortoise) << "|" << std::endl;
		return;
    }
    if(*ptrTortoise==0){
        std::cout << std::setw(*ptrTortoise) << "T" << std::setw(*ptrHare-*ptrTortoise) << "H" << std::setw((RACE_LENGTH)-*ptrHare) << "|" << std::endl;
        return;
    }
    if(*ptrTortoise==RACE_LENGTH){
	    std::cout << std::setw(*ptrHare) << "H" << std::setw(*ptrTortoise-*ptrHare) << "T" << std::setw((RACE_LENGTH-*ptrTortoise)+1) << "|" << std::endl;
	    return;
	}
	if(*ptrHare==RACE_LENGTH){
	    std::cout << std::setw(*ptrTortoise) << "T" << std::setw(*ptrHare-*ptrTortoise) << "H" << std::setw((RACE_LENGTH-*ptrHare)+1) << "|" << std::endl;
	    return;
	}
	if(*ptrTortoise>*ptrHare){
		std::cout << std::setw(*ptrHare) << "H" << std::setw(*ptrTortoise-*ptrHare) << "T" << std::setw((RACE_LENGTH+1)-*ptrTortoise) << "|" << std::endl;
	}
	
	if(*ptrHare>*ptrTortoise){
		std::cout << std::setw(*ptrTortoise) << "T" << std::setw(*ptrHare-*ptrTortoise) << "H" << std::setw((RACE_LENGTH+1)-*ptrHare) << "|" << std::endl;
	}
}