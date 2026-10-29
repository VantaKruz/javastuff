import java.io.*;
import java.util.Scanner;
import static silva.print.*;

class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        pln("Enter a number");
        int num=sc.nextInt();
        int temp, rev=0, original=num;
        while(original!=0)
        {
            temp=original%10;
            rev=rev*10 + temp;
            original/=10;
        }
        if(rev==num)
            pln("Number is palindrome");
        else
            pln("Number is not palindrome");
    }
}