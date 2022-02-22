import java.io.*;
import java.net.*;
public class Server{
public static void main(String[] args){
try{
ServerSocket ss = new ServerSocket(8080);
Socket s = ss.accept();
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());  
dos.writeUTF("Hello Client");  
String str = (String)dis.readUTF();
System.out.println("" +str);
ss.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
