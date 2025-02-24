import java.lang.Math;
import java.util.Scanner;
class prgmfact
{
public static void main(String args[])
        {
        double result;
        Scanner S=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=S.nextInt();
        result=Math.sqrt(number);
        System.out.println("sqrt of number is"+result);
        }
}
        