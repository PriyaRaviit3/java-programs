import java.net.*;
import java.io.*;
class myclient
{
	public static void main(String args[])throws Exception
	{
		Socket s=new Socket(InetAddress.getLocalHost(),8888);
		DataInputStream d=new DataInputStream(s.getInputStream());
		DataOutputStream o=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="",str2="";
		
		while(!str.equals("stop"))
		{
			str=br.readLine();
			o.writeUTF(str);
			o.flush();
			str2=d.readUTF();
			System.out.println("server says:"+str2);
			o.close();
			s.close();
		}
	}
}