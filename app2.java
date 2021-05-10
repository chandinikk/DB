import java.util.*;
import java.io.*;

public class strtoken
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader b=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter id,name and salary: ");
        String emp = b.readLine();
        StringTokenizer st = new StringTokenizer(emp," ");
        while(st.hasMoreTokens())
            {
                System.out.println(st.nextToken());
            }
    }
}