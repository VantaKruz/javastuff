import java.io.*;
import java.util.Scanner;

class Desks extends print
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        pln("Enter Students in Class A");
        int a=sc.nextInt();
        if(a%2!=0)
            a++;
        pln("Enter Students in Class B");
        int b=sc.nextInt();
        if(b%2!=0)
            b++;
        pln("Enter Students in Class C");
        int c=sc.nextInt();
        if(c%2!=0)
            c++;
        int aDesks=a/2;
        int bDesks=b/2;
        int cDesks=c/2;
        pln("Desks required in class A:"+aDesks+" Desks required in class B:"+bDesks+" Desks required in class C:"+cDesks);
        pln("Total Desks:"+(aDesks+bDesks+cDesks));
    }
}