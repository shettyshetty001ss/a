import java.util.Scanner;
class prgmfact1
{
public static void main(String args[])
       {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
       int n=s.nextInt();
       int result=fact(n);
       System.out.println("factorial="+result);
       }
       static int fact(int n)
       {
       int f=1;
       for(int i=1; i<=n; i++)
       f=f*i;
       return(f);
       }
}

