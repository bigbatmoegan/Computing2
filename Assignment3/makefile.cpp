# Honor Pledge:
#
# I pledge that I have neither given nor 
# received any help on this assignment.
#
# jeremorg
TestMe.exe: Game.o Player.o	
	g++ Game.o Player.o -o TestMe.exe

Game.o: Game.cpp	
	g++ -c Game.cpp -o Game.o

Player.o: Player.cpp	
	g++ -c Player.cpp -o Player.o

clean:	
	rm -f Game.o Player.o TestMe.exe

