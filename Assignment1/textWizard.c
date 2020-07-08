// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// jeremorg
#include <stdio.h>
#include <string.h>

// This function uses recursion to reverse a word in C.
void reversedWord (char input [100], int size)
{   
	char temp;
	static int start;
	if(start==0){
        	start=0;
        	}
 	if(size<start){
		start=0;    
	 	return;
		   }
	temp=input[size];
	input[size]=input[start];
	input[start]=temp;
	start++;
	reversedWord(input, --size);
	

}

// This is our main method that is responsible for running our program.
int begin ()  {
	int length;
	char input[100];
	printf("Please enter a word: ");
	scanf("%s", input);
	length=strlen(input);
	length=length-1;
	reversedWord(input, length);
	printf("Your word spelled backwards is: %s ", input);
}



int end () { 
	char answer[100];
	printf("\nWould you like to continue (Y|N)? ");
	scanf("%s", answer);
	if(!strcmp(answer, "N")) {
	    printf("Thank you! Goodbye!");
	    return 0;
				  }
	
	if(!strcmp(answer, "Y")) {
	    loop();
				  }
           }

int loop () {
    begin();
    end();
            }

int main ()
{
	loop();
}

