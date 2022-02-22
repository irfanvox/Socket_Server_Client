# Requirements :
## Introduction :-
A Server/client application consists of a client program that consumes services provided by a server program.The client requests services from tghe server by calling functions in the server application.A Socket is a localhost interface into which application process can both send and receive messages to/from another application processs. A door between application process and end-end-transport protocol.

## Research :
While working on this application which is basically server/client application lead employ to more topics discussion which are basically Socket Programming, Creating connections using TCP/IP.


## Cost and Features and Timeline :
Since this is intial application which is basically application interface there is no cost, but as we can furthur develop this application where we can build continious connection between two application withot any interrupts which may require more power and storage. 

## Defining Our System :
Our application is basically a two way communication where we make a connection using our local machine as host while connecting to a particular port, Once the connection is successfull client and server programs will the interaction, aftere successfull Inter Communication betwween programs the connection will be closed.
    
## SWOT ANALYSIS :
### Strength :- 
Can locally communicate with the other program which is Inter Process Communication.
### Weakness :- 
Communication can be done between two programs/application only. 
### Opportunities :- 
Application can be furthur developed for more than two application/programs communincation.
### Threats :- 
Lost of Connection can mislead communication, parts of code are in intial stage of testing.



# 4W&#39;s and 1&#39;H :

## Who :-
Anyone who are intrested in Socket Programming and want to develop an application which is a realible and connection oriented.


## What :-
Sockets allow you to exchange information between processes on the same machine or across a network. Project basically send a message from client to server after succesfull connection. 


## When :-
We Can develop to it's full potential after/in few weeks.


## Where :-
Linux Based System's are Preferable. 


## How :-
Application is based on Java, we need to have JRE in our local or distributed network and need to need to create a socket for communication between application's. 


# Detail requirements :
## High Level Requirements :-
|  ID |  Discription |  Status |
|------|---------------|---------|
|HLR_0|Connecting to  Port|Implemented|
|HLR_1|Allowing IPC between two programs|Implemented|
|HLR_2|Colsing Connection| Implemented|



##  Low level Requirements :-
| ID | Discription | Status |
|-----|------------|---------|
|LLR_0|Displaying Connection status of HLR_0| Implemented|
|LLR_1|Application's sending and receiving messages/data | Implemented|
