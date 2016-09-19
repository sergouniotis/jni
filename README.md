# jni
A Java project which utilizes jni in order to communicate with the Linux Kernel. 
This is a prototype project and the CommunicationManager acts as Mediator between the java code and the underlying system.
Currently the uname has been implemented. 

#Build 

mvn clean package -P linux
