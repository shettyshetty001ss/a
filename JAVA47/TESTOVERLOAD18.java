//TEST OVERLOAD
class TESTOVERLOAD18
{
public static void main(String args[])
{
int a=10,b=20,c=30,result1,result2;
double x=100.5,y=200.5,result3;
result1=sum(a,b);
result2=sum(a,b,c);
result3=sum(x,y);
System.out.println("SUM OF 2integer IS: "+ result1);
System.out.println("SUM OF 2 integers IS: "+result2);
System.out.println("SUM OF 2 double IS: "+result3);
}
static int sum(int a,int b)
{
return(a+b);
}
static int sum(int a,int b,int c)
{
return(a+b+c);
}
static double sum(double a,double b)
{
return(a+b);
}
}
