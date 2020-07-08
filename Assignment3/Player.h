// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#ifndef _PLAYER_H
#define _PLAYER_H


class Player
{
	private:
				//Private members
				int shot;
				char playerArray[5];
				int i;
				
	public:
				//Default Constructor
				Player();
				
				//Get player's shot (getter)
				int playerShot();
				
				//Change player Array (setter) 
				void changePlayerArray(int missedShotNumber);
				
				//Get added letter
				char getAddedLetter(int missedShotNumber);
				
				//Get final word
				void getFinalWord();
				
				//De constructor
				~Player();
				
};

#endif