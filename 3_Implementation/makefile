#JC = javac

#JFLAGS = -g
#.SUFFIXES: .java .class
#.java.class:
#	$(JC) $(JFLAGS) $*.java
#CLASSES = \
#	Server.java \
#	Client.java \
#default: classes
#classes: $(CLASSES:.java=.class)

#clean:
#$(RM) *.class

JCC = javac
J = java

JFLAGS = -g


default: Server.class Client.class 

Server.class: Server.java
	$(JCC) $(JFLAGS) Server.java
	$(J) Server
Client.class: Client.java
	$(JCC) $(JFLAGS) Client.java
	$(J) Client

clean: 
	$(RM) *.class
