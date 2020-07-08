# Honor Pledge:
#
# I pledge that I have neither given nor 
# received any help on this assignment.
#
#jeremorg

all: Game.class Player.class
	

Game.class: Game.java
	javac Game.java

Player.class: Player.java
	javac Player.java

clean:
	rm *.class
	
run:
	java Game