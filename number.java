import java.io.*;
import java.util.Scanner;

class number extends print
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        pln("Enter number");
        int n=sc.nextInt();
        int[]arr= new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            p("Enter "+(i+1)+" number: ");
            arr[i]=sc.nextInt();
        }
        int lost=0;
        for(i=0;i<n;i++)
        {
            if(i<n-1)
            {
                if(arr[i+1]!=arr[i]+1)
                {
                    lost=arr[i]+1;
                }
            }
        }
        pln("Lost number= "+lost);
    }
}