import java.io.*;
public class validate
{       //static boolean len,flag2,flag3,flag4,flag5,flag6;
    static int vld=0;
        public static void main(String args[])throws IOException
    {
        BufferedReader val=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t\t\t\tENTER FOLLOWING DETAILS TO CHECK VALIDATION");
        System.out.print("USERNAME: ");
        String user=val.readLine();
        System.out.print("PASSWORD: ");
        String pass=val.readLine();
        checklen(user,pass);
        checkcase(user,pass);
        checkSymbol(user);
        passchr(pass);
        validates(user,pass);
    }
        public static void checklen(String x,String y)
        {
        if(x.length()<8)
        System.out.println("Invalid Username : Must have atleast 8 character");
        if(y.length()<8)
        System.out.println("Invalid Password : Must have atleast 8 character");
        else vld+=2;
        }
        public static void checkSymbol(String x)
        {   int c=0,v=0;
            for(int i=0;i<x.length();i++)
            {
                if(!Character.isLetterOrDigit(x.charAt(i)))
                c++;
                else
                v++;
            }
            if(c!=0)
            System.out.println("Invalid Username : Must not have any special symbol");
           else vld++;
        }
        public static void checkcase(String x,String y)
        {   int c=0,v=0,c1=0,v1=0;
        for(int i=0;i<x.length();i++)
            {
                if(Character.isUpperCase(x.charAt(i)))
                c++;
                else if(Character.isDigit(x.charAt(i)))
                v++;
            }
        if(c==0)
        {
            System.out.println("Invalid Username : Must have atleast One Upper Case Character");
        }
        if(v==0)
                System.out.println("Invalid Username : Must have atleast One digit");
                else 
                vld+=2;
                for(int j=0;j<y.length();j++)
                {
                    if(Character.isUpperCase(y.charAt(j)))
                c1++;
                else 
                v1++;}
                if(c1==0)
        {
            System.out.println("Invalid Password : Must have atleast One Upper Case Character");
            
        }
        else
        vld++;
    }
    public static void passchr(String y)
{int x=0;
    for(int i=0;i<y.length();i++)
    {
        if((y.charAt(i)=='@')||(y.charAt(i)=='#')||(y.charAt(i)=='*')||(y.charAt(i)=='$')){
             x++;
        }
        
}if(x>0)
{vld++;
}
else{System.out.println("Invalid Password : Must have any one of these symbols:$,#,@,*");
}
}
        public static void validates(String x,String y)
        {   
            if(vld==7){
            System.out.println("VALIDATED DATA");
            System.out.print("WELCOME: "+x+" Password: ");
            for(int i=0;i<y.length();i++)
            {
                System.out.print("*");
            }
        }
        else{
            System.out.println("Please Try Again and  Enter Valid Data");
        }
}
        }