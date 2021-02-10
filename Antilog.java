import java.util.*;
import java.lang.*;
class Antilog
{  
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double logBase2,logBase10,logBasee,x=10;
        logBase2 = Math.pow(2,x);
        logBase10 = Math.pow(10,x);
        logBasee = Math.pow(2.718281828,x);
        System.out.println("Anti Log of 10 for base as 2 = "+logBase2);
        System.out.println("\nAnti Log of 10 for base as 10 = "+logBase10);
        System.out.println("\nAnti Log of 10 for base as e = "+logBasee);
    }
}