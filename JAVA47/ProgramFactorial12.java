 //FIND FACTORIAL OF A NUMBER
//USE STATIC METHOD AND KEYBOARD INPUT
import java.util.Scanner;
class ProgramFactorial12
{
public static void main(String[] args)
{ 
Scanner s=new Scanner(System.in);
int number;
System.out.println("ENTER THE NUMBER FROM KEYBOARD");
number=s.nextInt();
System.out.println("FACTORIAL OF NUMBER IS"+fact(number));
}
static int fact(int n)
{
int f=1;
for(int i=1;i<=n;i++)
f=f*i;
return(f);
}
}
 
