// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include <iostream>
#include <ctime>
#include <stdlib.h>
#include "Player.h"
//1 means shot is made, 2 means shot is missed. 
//did to ensure no return 0 anywhere would accidently end main.


int main()
{
	srand(time(NULL));
	char answer;
	int shotResult1;
	int shotResult2;
	int player1Misses=1;
	int player2Misses=1;
	//used to keep loops going
	bool keepGoing=true;
	bool keepGoing2=true;
	bool keepGoing3=true;
	char addedLetter;
	//returns letter added per missed shot
	char addedLetter2;
	while(keepGoing){
		keepGoing2=true;
		keepGoing3=true;
		Player* Player1=new Player;
		Player* Player2=new Player;
		std::cout << "Welcome to the CSCI 240 Game of Horse!" << std::endl;
		while(keepGoing2){
			shotResult1=Player1->playerShot();
			shotResult2=Player2->playerShot();
			if(shotResult1==1){
				std::cout << "Player #1: Hit Shot!" << std::endl;
			}
			if(shotResult1==2){
				std::cout << "Player #1: Missed Shot!" << std::endl;
			}
			if(shotResult2==1){
				std::cout << "Player #2: Hit Shot!" << std::endl;
			}
			if(shotResult2==2){
				std::cout << "Player #2: Missed Shot!" << std::endl;
			}
			if(shotResult1==shotResult2){
				keepGoing=true;
			}
			if(shotResult1!=shotResult2){
				if(shotResult1==2){
					Player1->changePlayerArray(player1Misses);
					addedLetter=Player1->getAddedLetter(player1Misses);
					//increases so next time through it will be already adjusted on next miss
					player1Misses=player1Misses+1;
					std::cout << "\t Player #1: Added an '"<< addedLetter << "'" << std::endl;
					keepGoing=true;
				}	
				if(shotResult2==2){
					Player2->changePlayerArray(player2Misses);
					addedLetter2=Player2->getAddedLetter(player2Misses);
					player2Misses=player2Misses+1;
					std::cout << "\t Player #1: Added an '"<< addedLetter2 << "'" << std::endl;
					keepGoing=true;
				}
			}
			//since I started my miss counter at 1 and then raised it after passing it through
			//the loop will stop when after 5 misses, but the value of the variable will be 6
			if(player1Misses==6){
				std::cout << "Player 2 Wins :: Player 1 = \'";
				Player1->getFinalWord();
				std::cout << "\'" << std::endl;
				keepGoing2=false;
			}
			if(player2Misses==6){
				std::cout << "Player 1 Wins :: Player 2 = \'";
				Player2->getFinalWord();
				std::cout << "\'" << std::endl;
				keepGoing2=false;
			}
		}
		while(keepGoing3){
			std::cout << "Would you like to play again? (Y|N) "<< std::endl;
			std::cin >> answer;
			if(answer=='N'){
				delete Player1;
				delete Player2;
				keepGoing=false;
				keepGoing2=false;
				keepGoing3=false;
				return 0;
			}
			else if(answer=='Y'){
				delete Player1;
				delete Player2;
				//resets misses for loop
				player1Misses=1;
				player2Misses=1;
				keepGoing2=true;
				keepGoing3=false;
			}
			else{
				keepGoing3=true;
			}
		}
	}
}