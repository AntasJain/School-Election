import java.io.*;
import java.util.*;
public class stringTokenizer
{   
    public static void main(String args[])throws Exception
    {   
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String x="",z="";
        int p=0,maxl=0;
        System.out.println("CHOOSE INDEX FROM BELOW STRING");
        String s="YOLO LOL ROFL LMAO WTF ABCDE";
        StringTokenizer st=new StringTokenizer(s);
        System.out.println(s);
        System.out.println("Its length is "+(s.length())+" characters");
        System.out.println("Enter the index of any character to find its ASCII");
        int index=Integer.parseInt(br.readLine());
        char ch=s.charAt(index-1);
        int ascii=(int)ch;
        int xx=st.countTokens();
        System.out.println(ascii+" is the ascii code of '"+ch+"'");
        for(int i=1;i<=xx;i++)
        {   x=st.nextToken();
            p=x.length();
             if(p>maxl) //checking for maximum length
                {
                    maxl=p;
                    z=x;
                }
        }
        
        System.out.println(z+" is the longest word in string");
        
    }
    
}