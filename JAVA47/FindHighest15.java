import java.util.Scanner;
class FindHighest15
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int marks[]=new int[10];
int i;
for(i=0;i<10;i++)
{
System.out.println("Enter the marks of student"+(i+1));
marks[i]=s.nextInt();
}
int largest=marks[0];
for(i=1;i<10;i++)
{
if(marks[i]>largest)
largest=marks[i];
}
System.out.println("maximum marks scored"+largest);
}
}






