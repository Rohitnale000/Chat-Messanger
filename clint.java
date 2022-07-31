import java.lang.*;
import java.net.*;
import java.io.*;

public class clint
{
    public static void main(String[] args)throws Exception
    {
        System.out.println("clint application is running.....");
        String s1,s2;
        
        Socket s = new Socket("localhost",1300);

        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
    
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        while(!(s1=brK.readLine()).equals("gn"))
        {
            ps.println(s1);
            s2 = br.readLine();
            System.out.println("Server Says:" +s2);
            System.out.println("Enter Message for Server:");
        }
    
        s.close();
        brK.close();
        br.close();
        ps.close();

    }

}
