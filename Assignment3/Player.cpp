// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include "Player.h"
#include <iostream>
#include <ctime>
#include <stdlib.h>
// 1 means a made shot, 2 means a missed shot. 
Player::Player()
{
	shot=0;
	char playerArray[5];
	int i;
}

int Player::playerShot()
{
	int shotChance[2]={1,2};
	int shotResult;
	shot=rand()%2;
	shotResult=shotChance[shot];
	return shotResult;
	
}

void Player::changePlayerArray(int missedShotNumber)
{
	if(missedShotNumber==1){
		playerArray[0]='H';
	}
	if(missedShotNumber==2){
		playerArray[1]='O';
	}
	if(missedShotNumber==3){
		playerArray[2]='R';
	}
	if(missedShotNumber==4){
		playerArray[3]='S';
	}
	if(missedShotNumber==5){
		playerArray[4]='E';
	}
}

char Player::getAddedLetter(int missedShotNumber){
	missedShotNumber=missedShotNumber-1;
	return playerArray[missedShotNumber];
}

void Player::getFinalWord(){
	int i;
	i=0;
	for(i=0; i<5; ++i){
		std::cout << playerArray[i];
	}
}




Player::~Player()
{
	
}