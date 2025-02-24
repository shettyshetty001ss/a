//TEST AUTOBOXING AND UNBOXING
class testbox19
{
public static void main(String args[])
{
short a=10;
int b=20;
long c=30;
double d=300.75;
Short objecta=a;
Integer objectb=b;
Long objectc=c;
Double objectd=d;
System.out.println("converted short object value is:"+objecta);
System.out.println("converted interger object value is:"+objectb);
System.out.println("converted long object value is:"+objectc);
System.out.println("converted double object value is:"+objectd);
//INITIALIZE THE OBJECT
Boolean objects=true;
Character objectr='a';
Float objectm=100.75f;
Double objectl=300.777;
//CONVERT  THE OBJECT INTO BASIC TYPES BY COPYING THE VALUES
boolean s=objects;
char r=objectr;
float m=objectm;
double l=objectl;
System.out.println(" COVERTED BOOLEAN  VALUE ID:"+s);
System.out.println(" COVERTED BOOLEAN  VALUE ID:"+r);
System.out.println(" COVERTED BOOLEAN  VALUE ID:"+m);
System.out.println(" COVERTED BOOLEAN  VALUE ID:"+l);
}
}