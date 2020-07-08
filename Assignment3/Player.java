// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg

//1 means a made shot, 2 means a missed shot.
//Done to prevent an accidental return 0 ending main.
import java.util.Random;

public class Player
{
	private int shot, i, shotResult;
	private char[] array=new char[5];
	
	
	public Player()
	{
		//Default constructor
		shot=0;
	}
	
	public int getShot()
	{
		Random rand=new Random();
		shot=rand.nextInt(2)+1;
		return shot;
	}
	
	public void changePlayerArray(int missedShotNumber)
	{
		if (missedShotNumber==1){
			array[0]='H';
		}
		if (missedShotNumber==2){
			array[1]='O';
		}
		if (missedShotNumber==3){
			array[2]='R';
		}
		if (missedShotNumber==4){
			array[3]='S';
		}
		if (missedShotNumber==5){
			array[4]='E';
		}	
	}
	
	public char getAddedLetter(int missedShotNumber)
	{
		//To get current missed shot number, since i started with 1 miss.
		missedShotNumber=missedShotNumber-1;
		return array[missedShotNumber];
	}
	
	
	public void getFinalWord()
	{
		i=0;
		for(i=0; i<5; ++i){
			System.out.print(array[i]);
		}
		array=null;
	}
}