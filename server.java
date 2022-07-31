import java.lang.*;
import java.net.*;
import java.io.*;

public class server
{
    public static void main(String[] args)throws Exception
    {
       System.out.println("server application is running....."); 
       String s1,s2;

       ServerSocket ss = new ServerSocket(1300);
       Socket s = ss.accept();

       System.out.println("connection succesful....");

       BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
    
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        while((s1 = br.readLine())!=null)
        {
            System.out.println("Clint Says:"+s1);
            System.out.println("Enter Message for Clint:");
            s2 = brK.readLine();
            ps.println(s2);

        }
        s.close();
        ss.close();
        brK.close();
        br.close();
        ps.close();
    }    
}
