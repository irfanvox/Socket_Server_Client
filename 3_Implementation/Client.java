import java.io.*;
import java.net.*;
public class Client{
	public static void main(String[] args){
	try{
	Socket s = new Socket("localhost", 8080);
	DataInputStream dis = new DataInputStream(s.getInputStream());
	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	dos.writeUTF("Hello Server");
	String str =  (String)dis.readUTF();
	System.out.println(""+str);
	dos.flush();
	dos.close();
	s.close();
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
   }
}

