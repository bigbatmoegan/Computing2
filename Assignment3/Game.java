// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
//1 is made shot, 2 is missed shot.
import java.util.*;

public class Game
{
	public static void main (String [] args)
	{
		Scanner input=new Scanner(System.in);
		String answer;
		String N="N";
		String Y="Y";
		int shotResult1;
		int shotResult2;
		int player1Misses=1;
		int player2Misses=1;
		boolean keepGoing=true;
		boolean keepGoing2;
		boolean keepGoing3;
		//returns added letter
		char addedLetter;
		char addedLetter2;
		while(keepGoing){
			keepGoing2=true;
			keepGoing3=true;
			Player Player1=new Player();
			Player Player2=new Player();
			System.out.print("Welcome to the CSCI 240 Game of Horse!"+"\n");
			while(keepGoing2){
				shotResult1=Player1.getShot();
				shotResult2=Player2.getShot();
				if(shotResult1==1){
					System.out.print("Player #1: Hit Shot!"+"\n");
				}
				if(shotResult1==2){
					System.out.print("Player #1: Missed Shot!"+"\n");
				}
				if(shotResult2==1){
					System.out.print("Player #2: Hit Shot!"+"\n");
				}
				if(shotResult2==2){
					System.out.print("Player #2: Missed Shot!"+"\n");
				}
				if(shotResult1==shotResult2){
					keepGoing=true;
				}
				if(shotResult1!=shotResult2){
					if(shotResult1==2){
						Player1.changePlayerArray(player1Misses);
						addedLetter=Player1.getAddedLetter(player1Misses);
						//increases so next time through it will be already adjusted
						player1Misses=player1Misses+1;
						System.out.print("\t Player #1: Added an '"+addedLetter+"'"+"\n");
						keepGoing2=true;
					}
					if(shotResult2==2){
						Player2.changePlayerArray(player2Misses);
						addedLetter=Player2.getAddedLetter(player2Misses);
						//increases so next time through it will be already adjusted
						player2Misses=player2Misses+1;
						System.out.print("\t Player #2: Added an '"+addedLetter+"'"+"\n");
						keepGoing2=true;
					}
				}
				if(player1Misses==6){
					System.out.print("Player 2 Wins :: Player 1 = \'");
					Player1.getFinalWord();
					System.out.print("\'"+"\n");
					keepGoing2=false;
				}
				if(player2Misses==6){
					System.out.print("Player 1 Wins :: Player 2 = \'");
					Player2.getFinalWord();
					System.out.print("\'"+"\n");
					keepGoing2=false;
				}
			}
			while(keepGoing3){
				System.out.print("Would you like to play again? (Y|N)"+"\n");
				answer=input.next();
				if(answer.equals(N)){
					Player1=null;
					Player2=null;
					keepGoing=false;
					keepGoing2=false;
					keepGoing3=false;
				}
				else if(answer.equals(Y)){
					Player1=null;
					Player2=null;
					//reset misses for loops
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
}