import java.io.*;
import java.util.Scanner;

class transpose extends print
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        pln("Enter Matrix Order");
        int n=sc.nextInt();
        int[][] arr =new int[n][n];

        pln("Enter Matrix");
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int[][] Tarr =new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                Tarr[j][i]= arr[i][j];
            }
        }
        pln("Transpose of Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                p(Tarr[i][j]+ " ");
            }
            pln("");
        }
    }
}