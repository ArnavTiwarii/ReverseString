import java.util.Scanner;

/*
input:
Arnav
Output:
vanra
 */
public class ReverseString
{
    public static void main(String args[])
    {
        String rev="";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}
