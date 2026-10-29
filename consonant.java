import java.util.Scanner;
import static silva.print.*;

class consonant
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        pln("Enter a character");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        switch (ch)
        {
            case 'a','e','i','o','u'->
            {
                pln("Character is vowel");
            }
            default ->
            {
                pln("Character is consonant");
            }
        }
    }
}